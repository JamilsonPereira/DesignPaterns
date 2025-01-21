package com.patterns.designPattern.criacionais.factory;

public class Main {
    public static void main(String[] args) {

        String logisticsTypes = "road";

        Logistics logistics = switch (logisticsTypes.toLowerCase()) {
            case "road" -> new RoadLogistics();
            case "sea" -> new ShipLogistics();
            default -> throw new IllegalArgumentException("Unknown logistics type: " + logisticsTypes);
        };

        logistics.planDelivery();
    }
}
