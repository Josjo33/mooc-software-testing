package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String encrypt(String message, int shift) {
        StringBuilder sb = new StringBuilder();

        // Asegurar que el shift esté dentro del rango [0, 25]
        shift = shift % 26;

        for (char currentChar : message.toCharArray()) {
            if (currentChar == ' ') {
                sb.append(' '); // Mantener espacios sin cambios
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                // Aplicar el desplazamiento
                char shiftedChar = (char) (currentChar + shift);

                // Manejo de desbordamiento por la derecha ('z' → 'a')
                if (shiftedChar > 'z') {
                    shiftedChar = (char) (shiftedChar - 26);
                }
                // Manejo de desbordamiento por la izquierda ('a' → 'z')
                if (shiftedChar < 'a') {
                    shiftedChar = (char) (shiftedChar + 26);
                }

                sb.append(shiftedChar);
            } else {
                return "invalid"; // Si hay caracteres no permitidos, retorna "invalid"
            }
        }

        return sb.toString();
    }
}
