package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// ================= Employee =================
        Employee employee = new Employee(101, "Mahmoud", "Front Desk", 20.0, 0);
        employee.punchIn(9.0);
        employee.punchOut(17.0);
        System.out.println("Employee Total Hours: " + employee.getHoursWorked());
        System.out.println("Employee Total Pay: $" + employee.getTotalPay());

        // ================= Room =================
        Room room = new Room();
        room.setNumberOfBeds(2);
        room.setPrice(150.0);
        room.setOccupied(false);
        room.setDirty(false);

        room.checkIn();
        room.checkout();
        room.cleanRoom();
        System.out.println("Room Available: " + room.isAvailable());

        // ================= Hotel =================
        Hotel hotel = new Hotel("Seaside Stay", 5, 10);
        hotel.bookRoom(2, true);    // Book 2 suites
        hotel.bookRoom(3, false);   // Book 3 basic rooms

        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Basic Rooms: " + hotel.getAvailableRooms());

    }
}