package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    @Test
    void pruebaReflejoBasico() {
        Mirror mirror = new Mirror();

        // Caso 1: La cadena tiene una parte reflejada "ab" al principio y final
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));

        // Caso 2: La cadena tiene solo un carácter reflejado al principio y final
        assertEquals("a", mirror.mirrorEnds("abca"));

        // Caso 3: La cadena es completamente reflejada
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    void pruebaCadenaVacia() {
        Mirror mirror = new Mirror();

        // Caso 4: Cadena vacía, no tiene reflejo
        assertEquals("", mirror.mirrorEnds(""));
    }

    @Test
    void pruebaUnSoloCaracter() {
        Mirror mirror = new Mirror();

        // Caso 5: Cadena con un solo carácter, siempre reflejada
        assertEquals("a", mirror.mirrorEnds("a"));
    }

        @Test
    void pruebaLongitudPar() {
        Mirror mirror = new Mirror();

        // Caso 7: Cadena con longitud par, tiene "ab" como reflejo
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    void pruebaSinReflejo() {
        Mirror mirror = new Mirror();

        // Caso 8: No hay parte reflejada
        assertEquals("", mirror.mirrorEnds("abcd"));
    }
}
