package lab02;


public class XorExample2 {
    public static void main(String[] args) {
        String mensaje = "110101";
        String flujoClave = "101011";

        String cifrado = xorBits(mensaje, flujoClave);
        String descifrado = xorBits(cifrado, flujoClave);

        System.out.println("Mensaje:    " + mensaje);
        System.out.println("Cifrado:    " + cifrado);
        System.out.println("Descifrado: " + descifrado);
    }

    public static String xorBits(String texto, String clave) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char bit = (texto.charAt(i) == clave.charAt(i)) ? '0' : '1';
            resultado.append(bit);
        }
        return resultado.toString();
    }

}
