package Garage;

public class Ship extends Vehicle{

    public Ship(String type, String manufacturer, String model, int maxSpeed){
        super(type,manufacturer,model,maxSpeed);
        vehicleLists.add(new VehicleList(type, manufacturer,model,maxSpeed));
    }
    public void sail(){
        System.out.println(manufacturer+" "+model+" seilaa merten ääriin!");
    }
}
