package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

 //   UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }

//EXTRA
    @Test
    public void addFiveToOneMillion() {
        int result = new GettingStarted().addFive(1999999999);
        Assertions.assertEquals(2000000004, result);
    }

    @Test
    public void addFives() {
        int result = new GettingStarted().addFive(-50);
        Assertions.assertEquals(-45, result);
    }

    @Test
    public void addFiveNormal() {
        int result = new GettingStarted().addFive(150);
        Assertions.assertEquals(155, result);
    }
}