package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(5, 3, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void bigAndSmallBars() {
        int result = new ChocolateBags().calculate(5, 3, 17);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void onlySmallBars() {
        int result = new ChocolateBags().calculate(4, 2, 3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void noHaySuficientesBolsasPequeNas() {
        ChocolateBags bolsas = new ChocolateBags();
        int resultado = bolsas.calculate(2, 3, 17);
        Assertions.assertEquals(-1, resultado);
    }



    @Test
    public void noHaySuficientesBolsasPequenas() {
        ChocolateBags bolsas = new ChocolateBags();
        int resultado = bolsas.calculate(5, 1, 11);
        Assertions.assertEquals(-1, resultado);
    }

    @Test
    public void seEmpaquetanTodosConSobrante() {
        int resultado = new ChocolateBags().calculate(3, 3, 18);
        Assertions.assertEquals(3, resultado);
    }

    @Test
    public void soloBolsasGrandes() {
        int resultado = new ChocolateBags().calculate(40, 1, 25);
        Assertions.assertEquals(20, resultado);
    }
}
