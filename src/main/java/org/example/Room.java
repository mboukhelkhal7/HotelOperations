package org.example;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }
    public boolean isAvailable() { if (occupied == false && dirty == false) {
        return true;
    } else {
        return false;
    } }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
    public void checkIn() {
       if (occupied == false && dirty == false) {
           this.occupied = true;
           this.dirty = true;
       }
    }
    public void checkout() {
        if (occupied) {
            this.occupied = false;
            this.dirty = true;
        }
    }
    public void cleanRoom() {
        if (occupied == false && dirty == true) {
            this.dirty = false;
        }
    }
}
