package org.example.alaa.isp.problem;

import org.example.alaa.isp.Car;

public interface ParkingLot {

    void parkCar();
    void unparkCar();
    void getCapacity();
    double calculateFee(Car car);
    void doPayment(Car car);
}
