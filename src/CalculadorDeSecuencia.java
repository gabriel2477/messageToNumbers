import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculadorDeSecuencia{

    public CalculadorDeSecuencia() {
    }
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

    public String calcular(String string){
        char[] caracteres = string.toUpperCase().toCharArray();
        int posicion = 0;
        List<String> keys = new ArrayList<>(); 
        String secuenciaDenumeros= "";
        String teclaAnterior = "";

        for(int x=0 ; x<caracteres.length; x++ ){
            for (Map.Entry<String, String> entry : teclas.entrySet()){

                if (entry.getValue().contains(String.valueOf(caracteres[x]))){
                    
                    String value = entry.getValue();
                    posicion = value.indexOf(caracteres[x]);

                    if(teclaAnterior == entry.getKey()){
                        keys.add(" ");
                    }

                    for(int nn=0; nn<=posicion; nn++){
                        keys.add(entry.getKey());
                    }
                    
                    teclaAnterior = entry.getKey();
                    break;
                }
            }
        }
        
        for(String numero : keys){
            secuenciaDenumeros += numero;
        }
        return secuenciaDenumeros;
    }
}