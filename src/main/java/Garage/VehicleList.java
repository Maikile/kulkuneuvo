package Garage;

import java.io.Serializable;

public class VehicleList implements Serializable {
        private String type;
        private String manufacturer;
        private String model;
        private int maxSpeed;

    public VehicleList(String type, String manufacturer, String model, int maxSpeed) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    }
