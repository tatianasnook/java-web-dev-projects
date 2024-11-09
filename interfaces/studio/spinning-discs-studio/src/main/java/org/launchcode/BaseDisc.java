package org.launchcode;

public abstract class BaseDisc implements OpticalReadable{
    public float storageCapacity;
    private int numOfTracks;
    private String rpm;

    public BaseDisc(float storageCapacity, int numOfTracks, String rpm) {
        this.storageCapacity = storageCapacity;
        this.numOfTracks = numOfTracks;
        this.rpm = rpm;
    }

    public float getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(float storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public int getNumOfTracks() {
        return numOfTracks;
    }

    public void setNumOfTracks(int numOfTracks) {
        this.numOfTracks = numOfTracks;
    }
}
