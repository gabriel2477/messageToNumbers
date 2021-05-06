import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class escenariosTest {
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
    @Test
    public void cuandoEscriboLaLetraAEsperoQueMeRetorne2(){
        String expectedResponse = "2";

        String secuencia = calcularSecuencia("a");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboLaLetraDEsperoQueMeRetorne3(){
        String expectedResponse = "3";

        String secuencia = calcularSecuencia("d");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboLaLetraBEsperoQueMeRetorne22(){
        String expectedResponse = "22";

        String secuencia = calcularSecuencia("b");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboLaLetraEEsperoQueMeRetorne33(){
        String expectedResponse = "33";

        String secuencia = calcularSecuencia("e");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboLaLetraZEsperoQueMeRetorne9999(){
        String expectedResponse = "9999";

        String secuencia = calcularSecuencia("z");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboFAesperoQueMeRetorne3332(){
        String expectedResponse = "3332";

        String secuencia = calcularSecuencia("fa");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboYESesperoQueMeRetorne999337777(){
        String expectedResponse = "999337777";

        String secuencia = calcularSecuencia("yes");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboHIesperoQueMeRetorne44_444(){
        String expectedResponse = "44 444";

        String secuencia = calcularSecuencia("hi");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboFoo_baresperoQueMeRetorneLaSecuenciaCorrespondiente(){
        String expectedResponse = "333666 666022 2777";

        String secuencia = calcularSecuencia("foo bar");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboHello_worldEsperoQueMeRetorneLaSecuenciaCorrespondiente(){
        String expectedResponse = "4433555 555666096667775553";

        String secuencia = calcularSecuencia("hello world");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboHola_como_estasEsperoQueMeRetorneLaSecuenciaCorrespondiente(){
        String expectedResponse = "4466655520222666 6 6660337777827777";

        String secuencia = calcularSecuencia("Hola como estas");
        assertEquals(expectedResponse, secuencia);
    }

    private String calcularSecuencia(String string) {

        char[] caracteres = string.toUpperCase().toCharArray();
        int posicion = 0;
        List<String> keys = new ArrayList<>(); 
        String secuenciaDenumeros= "";
        String teclaAnterior = "";

        for(int x=0 ; x<caracteres.length; x++ ){
            for (Map.Entry<String, String> entry : teclas.entrySet()){
                System.out.println(caracteres[x]);
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
                    System.out.println(teclaAnterior);
                    break;
                }
                
                
            }
            

        }
        
        
        for(String numero : keys){
            secuenciaDenumeros += numero;
        }
        System.out.println(secuenciaDenumeros);
        return secuenciaDenumeros;
    }
}
