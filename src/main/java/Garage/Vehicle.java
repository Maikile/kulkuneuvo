package Garage;

import java.util.ArrayList;


public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    protected ArrayList<VehicleList> vehicleLists = new ArrayList<>();

    public Vehicle(String type, String manufacturer, String model, int maxSpeed){
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void printVehicles(){
        for (VehicleList vehicleList : vehicleLists) {
            System.out.println(type+": "+model);
            System.out.println("Huippunopeus: "+maxSpeed);
        }
    }
}
