package org.example;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }


    public boolean isWeekend() {
        return isWeekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        double basePrice = 0;
        if (roomType.equalsIgnoreCase("King")) {
            basePrice = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            basePrice = 124.00;
        }
        return basePrice;
    }
    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}
