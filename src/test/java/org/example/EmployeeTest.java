package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {

        // Arrange
        Employee emp = new Employee(1, "Mahmoud", "Reception", 20.0, 0);

        // Act
        emp.punchIn(9.0); // 9 AM

        // Assert

        emp.punchOut(17.0); // 5 PM
        assertEquals(8.0, emp.getHoursWorked(), 0.01, "Worked hours should be 8.0 after punch out");
    }

    @Test
    void punchOut() {
        // Arrange
        Employee emp = new Employee(2, "Ali", "Support", 22.0, 0);
        emp.punchIn(10.0);

        // Act
        emp.punchOut(15.5); // 5.5 hours worked

        // Assert
        assertEquals(5.5, emp.getHoursWorked(), 0.01, "Worked hours should be 5.5 after punch out");
    }
}