package Garage;

public class Car extends Vehicle{
    
    public Car(String type, String manufacturer, String model, int maxSpeed){
        super(type,manufacturer,model, maxSpeed);
        vehicleLists.add(new VehicleList(type,manufacturer,model,maxSpeed));
        
    }
    public void drive(){
        System.out.println(manufacturer+" "+model+" paahtaa tietä eteenpäin!");
    }
}
