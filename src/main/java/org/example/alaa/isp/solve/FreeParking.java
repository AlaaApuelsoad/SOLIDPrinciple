package org.example.alaa.isp.solve;

public class FreeParking implements FreeParkingLot{
    @Override
    public boolean isParkingAvailable() {
        return true;
    }

    @Override
    public int getFreeSpotsCount() {
        return 5;
    }
}
