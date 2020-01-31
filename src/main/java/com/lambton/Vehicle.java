package com.lambton;

import java.util.HashMap;

public abstract class Vehicle {

    private int vehicleIdentificationNumber;
    private String vehicleDescription;
    private String manufacturerName;
    private boolean selfDrive;
    private boolean isInsured;
    private int noOfSeat;
    private String insuranceProviderName;
    private String fuelType;
    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

}
