package com.pluralsight;

public class Vehicle {
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, double price) {
        this.vehicleID = 0;
        this.makeModel = "";
        this.color = "";
        this.odometerReading = 0;
        this.price = 0;
    } // Vehicle Constructor
    // parameterless constructor must be made for when user inputs are taken in

    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
