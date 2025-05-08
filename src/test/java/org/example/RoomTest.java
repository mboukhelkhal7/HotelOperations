package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn() {
        // Arrange
        Room room = new Room();
        room.setOccupied(false);
        room.setDirty(false);

        // Act
        room.checkIn();

        // Assert
        assertTrue(room.isOccupied(), "Room should be occupied after check-in");
        assertTrue(room.isDirty(), "Room should be dirty after check-in");

    }

    @Test
    void checkout() {
        // Arrange
        Room room = new Room();
        room.setOccupied(true);
        room.setDirty(false);

        // Act
        room.checkout();

        // Assert
        assertFalse(room.isOccupied(), "Room should not be occupied after checkout");
        assertTrue(room.isDirty(), "Room should be dirty after checkout");
    }

    @Test
    void cleanRoom() {

        // Arrange
        Room room = new Room();
        room.setOccupied(false);
        room.setDirty(true);

        // Act
        room.cleanRoom();

        // Assert
        assertFalse(room.isDirty(), "Room should be clean after cleaning");
    }
}