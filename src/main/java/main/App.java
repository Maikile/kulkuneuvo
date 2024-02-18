package main;

import java.util.Scanner;
import Garage.Vehicle;
import Garage.Car;
import Garage.Plane;
import Garage.Ship;


public class App {
    
    public static void main( String[] args ){
        Vehicle newVehicle = null;  
        Storage storage = new Storage();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            if(sc.hasNext()){
                String stringInput = sc.nextLine();
                int i = Integer.parseInt(stringInput);
                
                switch(i){
                    case 1:
                    if(i == 1){
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                        String typeString = sc.nextLine();
                        int vehicleType = Integer.parseInt(typeString);
                        if(vehicleType == 1) {
                            String type = "Auto";
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String manufacturer = sc.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String model = sc.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            String stringSpeed = sc.nextLine();
                            int maxSpeed = Integer.parseInt(stringSpeed);
                            newVehicle = new Car(type,manufacturer,model,maxSpeed);
                        } else if(vehicleType == 2) {
                            String type = "Lentokone";
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String manufacturer = sc.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String model = sc.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            String stringSpeed = sc.nextLine();
                            int maxSpeed = Integer.parseInt(stringSpeed);
                            newVehicle = new Plane(type,manufacturer,model,maxSpeed);
                        }
                        else if(vehicleType == 3) {
                            String type = "Laiva";
                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String manufacturer = sc.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String model = sc.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            String stringSpeed = sc.nextLine();
                            int maxSpeed = Integer.parseInt(stringSpeed);
                            newVehicle = new Ship(type,manufacturer,model,maxSpeed);
                            
                        }
                        storage.addVehicle(newVehicle);
                        break;
                        }

                    case 2:
                    storage.listVehiclesInformation();
                    break;
                    
                    case 3:
                    storage.driveCars();
                    break;

                    case 4:
                    storage.flyPlanes();
                    break;

                    case 5:
                    storage.sailShips();
                    break;
                        
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;

                    

                }
            }
        }
    sc.close();
    }
}

