package com.amigoscode.garage;

public class Car {

    private int numberOfWheels;
    private boolean isFixed;

    public Car() {}

    public Car(int numberOfWheels, boolean isFixed) {
        this.numberOfWheels = numberOfWheels;
        this.isFixed = isFixed;
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void decelerate() {
        System.out.println("Decelerating");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }
}
