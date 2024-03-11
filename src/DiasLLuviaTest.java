import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DiasLLuviaTest {

    @Test
    void testRegistrarDias1(){
        DiasLluvia calendario = new DiasLluvia();

        assertEquals(true, calendario.registroDia(11,3,true));
    }
}
