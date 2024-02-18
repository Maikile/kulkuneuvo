package Garage;

public class Plane extends Vehicle{

    public Plane(String type, String manufacturer, String model, int maxSpeed){
        super(type,manufacturer,model,maxSpeed);
        vehicleLists.add(new VehicleList(type, manufacturer,model,maxSpeed));
    
    }

    public void fly(){
        System.out.println(manufacturer+" "+model+" lentää kohteeseen!");
    }
}