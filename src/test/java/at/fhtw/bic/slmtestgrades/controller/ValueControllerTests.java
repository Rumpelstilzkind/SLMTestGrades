package at.fhtw.bic.slmtestgrades.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueControllerTests {

    @Test
    public void valueToGrade_when90_then1() {
        // A - Arrange
        ValueController controller = new ValueController();

        // A - Act
        int result = controller.returnGrades(90);

        // A - Assert
        assertEquals(1, result);

    }
}
