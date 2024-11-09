package org.launchcode;

public class CD extends BaseDisc{
    // TODO: Implement your custom interface.


    public CD(float storageCapacity, int numOfTracks, String rpm) {
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
        System.out.println("CD spins at " + this.getRpm() + " rpm. ");
    }

    @Override
    public void readDisk() {

    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
