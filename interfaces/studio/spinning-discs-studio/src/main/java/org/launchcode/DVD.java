package org.launchcode;

public class DVD extends BaseDisc{
    // TODO: Implement your custom interface.


    public DVD(float storageCapacity, int numOfTracks, String rpm) {
        super(storageCapacity, numOfTracks, rpm);
    }

    @Override
    public void writeDisc() {

    }

    @Override
    public void playTrack() {

    }

    @Override
    public void spinDisk() {
        System.out.println("DVD spins at " + this.getRpm() + " rpm. ");
    }

    @Override
    public void readDisk() {

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
