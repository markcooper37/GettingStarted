package com.amigoscode.garage;

import java.util.ArrayList;

public class Garage {

    private ArrayList<Car> carList;
    private int numberOfStaff;

    public Garage() {}

    public Garage(ArrayList<Car> carList, int numberOfStaff) {
        this.carList = carList;
        this.numberOfStaff = numberOfStaff;
    }

    public void fixCar(Car car) {
        car.setFixed(true);
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }
}
