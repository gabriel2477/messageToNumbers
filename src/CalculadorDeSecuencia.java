import java.util.HashMap;
import java.util.Map;

public class CalculadorDeSecuencia{
    
    
    public static Map<String, String> teclas;
    static{
        teclas = new HashMap<>();
        teclas.put("0", " ");
        teclas.put("1","");
        teclas.put("2", "ABC");
        teclas.put("3", "DEF");
        teclas.put("4", "GHI");
        teclas.put("5", "JKL");
        teclas.put("6", "MNO");
        teclas.put("7", "PQRS");
        teclas.put("8", "TUV");
        teclas.put("9", "WXYZ");
    }

    public String calcular(String mensaje){
        char[] caracteresDelMensaje = mensaje.toUpperCase().toCharArray();
        return secuenciaSegunCaracter(caracteresDelMensaje);
        
    }

    private String secuenciaSegunCaracter(char[] caracteresDelMensaje) {
        StringBuilder secuenciaDeNumeros = new StringBuilder();
        int posicionDelCaracter = 0;
        String teclaAnterior = "";
        
        for(int x=0 ; x<caracteresDelMensaje.length; x++ ){
            for (Map.Entry<String, String> entry : teclas.entrySet()){

                if (entry.getValue().contains(String.valueOf(caracteresDelMensaje[x]))){
                    
                    posicionDelCaracter = entry.getValue().indexOf(caracteresDelMensaje[x]);

                    if(teclaAnterior == entry.getKey()){
                        secuenciaDeNumeros.append(" ");
                    }

                    for(int nn=0; nn<=posicionDelCaracter; nn++){
                        secuenciaDeNumeros.append(entry.getKey());
                    }
                    
                    teclaAnterior = entry.getKey();
                    break;
                }
            }
        }

        return secuenciaDeNumeros.toString();
    }
}