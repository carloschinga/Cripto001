package lab02;

public class FeistelExample3 {

    public static void main(String[] args) {
        String mensaje = "ABCD"; // 4 caracteres
        String clave = "K"; // clave muy simple para ejemplo

        String cifrado = feistel(mensaje, clave, true);
        String descifrado = feistel(cifrado, clave, false);

        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Cifrado: " + cifrado);
        System.out.println("Descifrado: " + descifrado);
    }

    public static String feistel(String texto, String clave, boolean cifrar) {
        // asegurarse de que texto tiene longitud par y >=2
        if (texto.length() % 2 != 0) {
            throw new IllegalArgumentException("Texto debe tener longitud par.");
        }
        String L = texto.substring(0, texto.length() / 2);
        String R = texto.substring(texto.length() / 2);

        int rondas = 2;
        if (cifrar) {
            // encriptación: rondas 0..rondas-1
            for (int ronda = 0; ronda < rondas; ronda++) {
                String f = funcionF(R, clave);
                String nuevoL = xorStrings(L, f);
                L = R;
                R = nuevoL;
            }
        } else {
            // desencriptación: aplicar rondas en orden inverso
            for (int ronda = rondas - 1; ronda >= 0; ronda--) {
                // invertir una ronda Feistel:
                // R_prev = L_curr
                // L_prev = R_curr XOR F(R_prev)
                String Rprev = L;
                String Lprev = xorStrings(R, funcionF(Rprev, clave));
                L = Lprev;
                R = Rprev;
            }
        }

        return L + R;
    }

// Función f muy simple: sumar +1 a cada carácter
    public static String funcionF(String parte, String clave) {
        char[] salida = new char[parte.length()];
        for (int i = 0; i < parte.length(); i++) {
            salida[i] = (char) (parte.charAt(i) + 1);
        }
        return new String(salida);
    }

// XOR simplificado carácter a carácter
    public static String xorStrings(String a, String b) {
        char[] resultado = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            resultado[i] = (char) (a.charAt(i) ^ b.charAt(i % b.length()));
        }
        return new String(resultado);
    }

}
