import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CalculadorDeSecuencia{
    StringBuilder secuenciaDeNumeros = new StringBuilder();
    int posicionDelCaracter = 0;
    String teclaAnterior = "";
    
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
        return obtenerSecuencia(caracteresDelMensaje);
        
    }

    private String obtenerSecuencia(char[] caracteresDelMensaje) {
        for(int x=0 ; x<caracteresDelMensaje.length; x++ ){
            obtenerSecuenciaPorCaracter(caracteresDelMensaje[x]);
        }
        
        return secuenciaDeNumeros.toString();
    }

    private void obtenerSecuenciaPorCaracter(char caracter) {

        for (Map.Entry<String, String> entry : teclas.entrySet()){

            if (laTeclaContieneElCaracter(entry.getValue(),caracter)){
                posicionDelCaracter = entry.getValue().indexOf(caracter);
                secuenciaDeNumeros.append(teclasSegunPosicion(entry));
                teclaAnterior = entry.getKey();
                break;
            }
        }
    }


    private boolean laTeclaContieneElCaracter(String tecla, char caracter) {
        return tecla.contains(String.valueOf(caracter));
    }

    private String teclasSegunPosicion(Entry<String, String> entry) {
        StringBuilder teclas = new StringBuilder();
        if(elCaracterSeEncuentraEnLamismaTecla(entry)){
            teclas.append(" ");
        }
        for(int x=0; x<=posicionDelCaracter; x++){
            teclas.append(entry.getKey());
        }
        return teclas.toString();
    }

    private boolean elCaracterSeEncuentraEnLamismaTecla(Entry<String, String> entry) {
        return teclaAnterior == entry.getKey();
        
    }


}

