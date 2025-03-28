package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    @Test
    public void testPositiveShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("def", cipher.encrypt("abc", 3));
        
    }

    @Test
    public void testNegativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("xyz", cipher.encrypt("abc", -3));
        assertEquals("uvw", cipher.encrypt("xyz", -3));
    }

    @Test
    public void testLargeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("abc", cipher.encrypt("abc", 26)); // Mismo resultado
        assertEquals("bcd", cipher.encrypt("abc", 27)); // Equivalente a shift 1
    }

    @Test
    public void testWithSpaces() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("d e f", cipher.encrypt("a b c", 3));
    }

    @Test
    public void testInvalidCharacter() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        assertEquals("invalid", cipher.encrypt("hello!", 3));
        assertEquals("invalid", cipher.encrypt("123", 3));
    }
}
