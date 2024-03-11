import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class DiasLLuviaTest {

    @Test
    void testRegistrarDias1(){
        DiasLluvia calendario = new DiasLluvia();

        assertEquals(true, calendario.registroDia(11,3,true));
    }

    @Test

    void testRegistrarDias2(){
        DiasLluvia calendario = new DiasLluvia();

        assertEquals(true, calendario.registroDia(11,12,true));
    }
    @Test

    void testRegistrarDias3(){
        DiasLluvia calendario = new DiasLluvia();

        assertNotEquals(false, calendario.registroDia(11,3,true));
    }

    @Test
    void testConsultarDia1(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(11,3,true);

        assertEquals(true, calendario.consultarDia(11,3));
    }
    @Test
    void testConsultarDia2(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(11,0,true);

        assertEquals(false, calendario.consultarDia(11,0));
    }
    @Test
    void testConsultarDia3(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(11,3,true);

        assertNotEquals(false, calendario.consultarDia(11,3));
    }

    @Test
    void testContarDias1(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(10,3,true);
        calendario.registroDia(11,3,true);
        calendario.registroDia(12,3,true);


        assertEquals(3, calendario.contarDiasLluvias());
    }

    @Test
    void testContarDias2(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(10,3,true);
        calendario.registroDia(11,3,false);
        calendario.registroDia(12,3,true);


        assertEquals(2, calendario.contarDiasLluvias());
    }

    @Test
    void testContarDias3(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(10,3,true);
        calendario.registroDia(11,3,false);
        calendario.registroDia(12,3,true);


        assertNotEquals(3, calendario.contarDiasLluvias());
    }

    @Test
    void testTrimestreLluvia1(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(10,2,true);
        calendario.registroDia(11,2,true);
        calendario.registroDia(12,2,true);

        calendario.registroDia(10,4,true);
        calendario.registroDia(11,4,true);
        calendario.registroDia(12,4,true);
        calendario.registroDia(13,4,true);
        calendario.registroDia(14,4,true);
        calendario.registroDia(15,4,true);


        assertEquals(2, calendario.trimestraLluviosa());
    }

    @Test
    void testTrimestreLluvia2(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(10,2,true);
        calendario.registroDia(11,2,true);
        calendario.registroDia(12,2,true);
        calendario.registroDia(10,6,true);
        calendario.registroDia(11,6,true);
        calendario.registroDia(12,6,true);
        calendario.registroDia(13,7,true);
        calendario.registroDia(14,8,true);
        calendario.registroDia(15,9,true);


        assertEquals(3, calendario.trimestraLluviosa());
    }

    @Test
    void testTrimestreLluvia3(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(10,2,true);
        calendario.registroDia(11,2,true);
        calendario.registroDia(12,2,true);
        calendario.registroDia(10,6,true);
        calendario.registroDia(11,6,true);
        calendario.registroDia(12,6,true);
        calendario.registroDia(13,7,true);
        calendario.registroDia(14,8,true);
        calendario.registroDia(15,9,true);


        assertNotEquals(2, calendario.trimestraLluviosa());
    }

    @Test
    void testPrimerDia1(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(10,2,true);
        calendario.registroDia(11,2,true);
        calendario.registroDia(12,2,true);


        assertEquals(41, calendario.primerDiaLluvia());
    }

    @Test
    void testPrimerDia2(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(1,1,true);

        assertEquals(1, calendario.primerDiaLluvia());
    }

    @Test
    void testPrimerDia3(){
        DiasLluvia calendario = new DiasLluvia();

        calendario.registroDia(10,2,true);

        assertNotEquals(43, calendario.primerDiaLluvia());
    }
}
