package ucb.edu.bo.tareaTDD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonatddTest {

    @Test
    public void personaPisoAleatorio(){
        Personatdd pt;
        pt = new Personatdd();
        //assertEquals(null, null);
        System.out.println(pt.getPisoPersonatdd());
        assertTrue(pt.getPisoPersonatdd() > 0 && pt.getPisoPersonatdd() < 4);

        pt = new Personatdd();
        System.out.println(pt.getPisoPersonatdd());
        assertTrue(pt.getPisoPersonatdd() > 0 && pt.getPisoPersonatdd() < 4);

        pt = new Personatdd();
        System.out.println(pt.getPisoPersonatdd());
        assertTrue(pt.getPisoPersonatdd() > 0 && pt.getPisoPersonatdd() < 4);
        

    }
    

    @Test
    public void personaPisoSeleccionado(){
        Personatdd pt;
        pt = new Personatdd();
        pt.setSeleccion();
        //assertEquals(null, null);
        System.out.println(pt.getPisoPersonatdd());
        assertTrue(pt.getPisoPersonatdd() > 0 && pt.getPisoPersonatdd() < 4);
        assertNotEquals(pt.getPisoPersonatdd(), pt.getSeleccion());
        

    }
    
}
