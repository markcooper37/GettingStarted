package com.amigoscode.garage;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(4, false);

        ArrayList<Car> carList =  new ArrayList<>();
        carList.add(car);

        Garage garage = new Garage(carList, 5);

        car.accelerate();
        car.decelerate();

        garage.fixCar(car);

        System.out.println(car.isFixed());

    }

}
