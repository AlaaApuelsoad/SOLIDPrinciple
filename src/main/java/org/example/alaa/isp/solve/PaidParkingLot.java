package org.example.alaa.isp.solve;

import org.example.alaa.isp.Car;

public interface PaidParkingLot {

    void parkCar();
    void unparkCar();
    void getCapacity();
    double calculateFee(Car car);
    void doPayment(Car car);
}
