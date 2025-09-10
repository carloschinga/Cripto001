package sistemacifrado;




public class SistemaCifrado {
    public static String cifrar(String mensajeOriginal){
        String mensajeCifrado="";        
        int len= mensajeOriginal.length();        
        for(int i=0;i<len;i++){
            char c= mensajeOriginal.charAt(i);
            int code=(int)c;
            code+=1;
            char nc=(char)code;
            mensajeCifrado+=nc;            
        }
        return mensajeCifrado;
    }
    public static String descifrar(String mensajeDescifrado){
        String mensajeCifrado="";        
        int len= mensajeDescifrado.length();        
        for(int i=0;i<len;i++){
            char c= mensajeDescifrado.charAt(i);
            int code=(int)c;
            code-=1;
            char nc=(char)code;
            mensajeCifrado+=nc;            
        }
        return mensajeCifrado;
    }
    
    public static void main(String[] args) {
        String mensajeOriginal="Srta. no debe llegar tarde";
        String mensajeCifrado=SistemaCifrado.cifrar(mensajeOriginal);
        String mensajeDescifrado=SistemaCifrado.descifrar(mensajeCifrado);
        
        System.out.println(mensajeOriginal);
        System.out.println(mensajeCifrado);
        System.out.println(mensajeDescifrado);
        
    }
}
