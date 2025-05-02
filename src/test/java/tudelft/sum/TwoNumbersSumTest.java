package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    void pruebaSumaBasica() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(2, 4, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(5, 6, 4));

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(7, 0, 8));

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void pruebaSumaConAcarreo() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(9, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1));

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 0, 1));

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void pruebaSumaConLongitudesDiferentes() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(7, 8));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(3, 4, 5));

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 2, 4));

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void pruebaListasVacias() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        ArrayList<Integer> expected = new ArrayList<>();

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void pruebaUnaListaVacia() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> second = new ArrayList<>();

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 2, 1));

        ArrayList<Integer> result = sum.addTwoNumbers(first, second);

        Assertions.assertEquals(expected, result);
    }
}
