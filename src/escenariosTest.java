import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.Test;

public class escenariosTest {
    CalculadorDeSecuencia calculador = new CalculadorDeSecuencia();
    Map<String,String> teclas = CalculadorDeSecuencia.teclas;
    
    @Test
    public void cuandoEscriboLaLetraAEsperoQueMeRetorne2(){
        String expectedResponse = "2";

        String secuencia = calculador.calcular("a");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboLaLetraDEsperoQueMeRetorne3(){
        String expectedResponse = "3";

        String secuencia = calculador.calcular("d");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboLaLetraBEsperoQueMeRetorne22(){
        String expectedResponse = "22";

        String secuencia = calculador.calcular("b");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboLaLetraEEsperoQueMeRetorne33(){
        String expectedResponse = "33";

        String secuencia = calculador.calcular("e");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboLaLetraZEsperoQueMeRetorne9999(){
        String expectedResponse = "9999";

        String secuencia = calculador.calcular("z");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboFAesperoQueMeRetorne3332(){
        String expectedResponse = "3332";

        String secuencia = calculador.calcular("fa");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboYESesperoQueMeRetorne999337777(){
        String expectedResponse = "999337777";

        String secuencia = calculador.calcular("yes");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboHIesperoQueMeRetorne44_444(){
        String expectedResponse = "44 444";

        String secuencia = calculador.calcular("hi");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboFoo_baresperoQueMeRetorneLaSecuenciaCorrespondiente(){
        String expectedResponse = "333666 666022 2777";

        String secuencia = calculador.calcular("foo bar");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboHello_worldEsperoQueMeRetorneLaSecuenciaCorrespondiente(){
        String expectedResponse = "4433555 555666096667775553";

        String secuencia = calculador.calcular("hello world");
        assertEquals(expectedResponse, secuencia);
    }

    @Test
    public void cuandoEscriboHola_como_estasEsperoQueMeRetorneLaSecuenciaCorrespondiente(){
        String expectedResponse = "4466655520222666 6 6660337777827777";

        String secuencia = calculador.calcular("Hola como estas");
        assertEquals(expectedResponse, secuencia);
    }

}
