package com.ass6;

import java.io.*;
import java.util.*;

class Vehicle {
    int vehicleId;
    String model;
    String type;
    double price;

    public Vehicle(int vehicleId, String model, String type, double price) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Model: " + model + ", Type: " + type + ", Price: " + price;
    }
}

public class Program {

    static final String FILE_NAME = "Vehicles.db";

    public static void writeVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(101, "Toyota Corolla", "Sedan", 20000));
        vehicles.add(new Vehicle(102, "Honda Civic", "Sedan", 22000));
        vehicles.add(new Vehicle(103, "Tesla Model 3", "Electric", 35000));
        vehicles.add(new Vehicle(104, "Ford F-150", "Truck", -15000));
        vehicles.add(new Vehicle(105, "BMW X5", "SUV", 60000));

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Vehicle v : vehicles) {
                if (v.price > 0) {
                    dos.writeInt(v.vehicleId);
                    dos.writeUTF(v.model);
                    dos.writeUTF(v.type);
                    dos.writeDouble(v.price);
                } else {
                    System.out.println("Skipping invalid vehicle with ID: " + v.vehicleId + " (price <= 0)");
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void readVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                try {
                    int id = dis.readInt();
                    String model = dis.readUTF();
                    String type = dis.readUTF();
                    double price = dis.readDouble();

                    vehicles.add(new Vehicle(id, model, type, price));
                } catch (EOFException eof) {
                    break; 
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        vehicles.sort((v1, v2) -> Double.compare(v2.price, v1.price));

        System.out.println("Sorted Vehicle Records (by price descending):");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        writeVehicles();
        readVehicles();
    }
}
