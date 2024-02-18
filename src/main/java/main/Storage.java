package main;

import java.util.ArrayList;
import Garage.Vehicle;
import Garage.Car;
import Garage.Plane;
import Garage.Ship;


public class Storage {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

public void listVehiclesInformation() {
    for (Vehicle vehicle : vehicles) {
    vehicle.printVehicles();
    }
}
public void driveCars(){
    for (Vehicle vehicle : vehicles) {
        if(vehicle instanceof Car){
            Car car = (Car) vehicle;
            car.drive();
        }
        
    }
}

public void flyPlanes(){
    for (Vehicle vehicle : vehicles) {
        if(vehicle instanceof Plane){
            Plane plane = (Plane) vehicle;
            plane.fly();
        }
        
    }
}

public void sailShips(){
    for (Vehicle vehicle : vehicles) {
        if(vehicle instanceof Ship){
            Ship ship = (Ship) vehicle;
            ship.sail();
        }
        
    }
}

}
