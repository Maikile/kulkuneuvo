package Garage;

import java.util.ArrayList;


public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    protected ArrayList<VehicleList> vehicleLists = new ArrayList<>();
    Engine engine = new Engine();

    public Vehicle(String type, String manufacturer, String model, int maxSpeed){
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void printVehicles(){
        for (VehicleList vehicleList : vehicleLists) {
            System.out.println(type+": "+model);
            if(type == "Auto"){
                System.out.println("Moottori: "+engine.getCarEng()+" "+engine.getCarPower()+"kW");
            }
            else if(type == "Lentokone"){
                System.out.println("Moottori: "+engine.getPlaneEng()+" "+engine.getPlanePower()+"kW");
            }
            if(type == "Laiva"){
                System.out.println("Moottori: "+engine.getShipEng()+" "+engine.getShipPower()+"kW");
            }
            System.out.println("Huippunopeus: "+maxSpeed);
            System.out.println();
        }
    }
}
