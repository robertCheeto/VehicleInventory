package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Vehicle[] usedCarArray = new Vehicle[20];
        //usedCarArray[0] = new Vehicle[]{101121L, "Ford Explorer", "white", 50000, 17590f};
        //usedCarArray.add(101121L, "Ford Explorer", "white", 50000, 17590f);

        Vehicle[] carList = {
                (101121L, "Ford Explorer", "white", 50000, 17590),

        };
        System.out.println(usedCarArray);
        // need to determine when I put the 6 cars into the array
        // I think that needs to be initialized in the Vehicle file

    }
}
