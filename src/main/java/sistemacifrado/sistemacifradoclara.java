/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacifrado;

/**
 *
 * @author Clara
 */
public class sistemacifradoclara {
    public static String cifrar(String mensajeOri){
        String mensajeC="";
        int len = mensajeC.length();
        for(int i=0; i<len;i++){
            char c= mensajeC.charAt(i);
            int code=(int )c;
            code+=1;
            char nc=(char) code;
            mensajeC+=nc;
        }
        return mensajeC;
    }
    
      public static String descifrar(String mensajeOri){
        String mensajeC="";
        int len = mensajeC.length();
        for(int i=0; i<len;i++){
            char c= mensajeC.charAt(i);
            int code=(int )c;
            code-=1;
            char nc=(char) code;
            mensajeC+=nc;
        }
        return mensajeC;
    }
      
      
      public static void main(String[] args) {
        String mensajeO=" SEÑRITA NO DEBE DE LLEGRA TARDE";
        String mensajeCifrado = sistemacifradoclara.cifrar(mensajeO);
        String mensajeDescifrado= sistemacifradoclara.descifrar(mensajeCifrado);
        
          System.out.println(mensajeO);
          System.out.println(mensajeCifrado);
          System.out.println(mensajeDescifrado);
          
    }
}
