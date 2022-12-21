package at.fhtw.bic.slmtestgrades.controller;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertThrows;
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

   // @Test
   // public void grade_whenNegative_thenThrow() {
   //     ValueController controller = new ValueController();
   //     assertThrows(InvalidParameterException.class, () -> {
   //         int result = controller.returnGrades(-2);
   //     });
   // }
    @Test
    public void grade_when80_then2() {
        ValueController controller = new ValueController();
        int result = controller.returnGrades(80);
        assertEquals(2, result);
    }
    @Test
    public void grade_when70_then3() {
        ValueController controller = new ValueController();
        int result = controller.returnGrades(70);
        assertEquals(3, result);
    }

    @Test
    public void grade_when60_then4() {
        ValueController controller = new ValueController();
        int result = controller.returnGrades(60);
        assertEquals(4, result);
    }

    @Test
    public void grade_when40_then5() {
        ValueController controller = new ValueController();
        int result = controller.returnGrades(40);
        assertEquals(5, result);
    }
}
