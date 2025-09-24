package lab02;

public class XorBitsEjemplo1 {

    public static void main(String[] args) {
        String mensaje = "HOLA";
        String clave = "KEY1"; // misma longitud que el mensaje

        // Convertir a binario
        String binMensaje = toBinary(mensaje);
        String binClave = toBinary(clave);

        // Aplicar XOR bit a bit
        String cifradoBin = xorBits(binMensaje, binClave);
        String descifradoBin = xorBits(cifradoBin, binClave);

        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Binario mensaje : " + binMensaje);
        System.out.println("Binario clave   : " + binClave);
        System.out.println("Binario cifrado : " + cifradoBin);
        System.out.println("Descifrado bin  : " + descifradoBin);
        System.out.println("Texto descifrado: " + fromBinary(descifradoBin));
    }

    // Convertir String a su representación binaria (8 bits por char)
    public static String toBinary(String texto) {
        StringBuilder sb = new StringBuilder();
        for (char c : texto.toCharArray()) {
            sb.append(String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
        }
        return sb.toString();
    }

    // Convertir binario a String
    public static String fromBinary(String binario) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binario.length(); i += 8) {
            String byteStr = binario.substring(i, i + 8);
            sb.append((char) Integer.parseInt(byteStr, 2));
        }
        return sb.toString();
    }

    // XOR bit a bit entre dos cadenas binarias
    public static String xorBits(String a, String b) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char bit = (a.charAt(i) == b.charAt(i)) ? '0' : '1'; 
            sb.append(bit);
        }
        return sb.toString();
    }


}
