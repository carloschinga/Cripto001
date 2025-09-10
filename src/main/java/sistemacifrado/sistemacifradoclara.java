/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacifrado;

public class sistemacifradoclara {

    public static String cifrar(String mensajeOri) {
        String mensajeC = "";
        int len = mensajeOri.length();
        for (int i = 0; i < len; i++) {
            char c = mensajeOri.charAt(i);
            int code = (int) c;
            code += 1; 
            char nc = (char) code;
            mensajeC += nc;
        }
        return mensajeC;
    }

    public static String descifrar(String mensajeOri) {
        String mensajeC = "";
        int len = mensajeOri.length();
        for (int i = 0; i < len; i++) {
            char c = mensajeOri.charAt(i);
            int code = (int) c;
            code -= 1;
            char nc = (char) code;
            mensajeC += nc;
        }
        return mensajeC;
    }

    public static void main(String[] args) {
        String mensajeO = "SEÑORITA NO DEBE DE LLEGAR TARDE";
        String mensajeCifrado = sistemacifradoclara.cifrar(mensajeO);
        String mensajeDescifrado = sistemacifradoclara.descifrar(mensajeCifrado);

        System.out.println("Original: " + mensajeO);
        System.out.println("Cifrado: " + mensajeCifrado);
        System.out.println("Descifrado: " + mensajeDescifrado);
    }
}
