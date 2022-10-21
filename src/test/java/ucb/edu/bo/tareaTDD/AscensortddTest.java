package ucb.edu.bo.tareaTDD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AscensortddTest {

    Ascensortdd ascensortdd;

    @Before
    public void before(){
        ascensortdd = new Ascensortdd();

    }
    

    @Test
    public void primerPisoInicio(){
        Ascensortdd as;
        as=new Ascensortdd();
        assertEquals(1, as.pisoAscensor());

    }

    @Test
    public void primeraPersonaSlec(){
        Ascensortdd as;
        Personatdd pt;

        as=new Ascensortdd();
        pt=new Personatdd();

        ascensortdd.peticionRealizada(pt.getSeleccion());

        assertEquals(true, as.sube());
        assertEquals(pt.getSeleccion(), as.llegadaSubida());



    }


    @Test
    public void recojerPersona(){
        Ascensortdd as;
        Personatdd pt;

        as=new Ascensortdd();
        pt=new Personatdd();

        ascensortdd.peticionRealizada(pt.getSeleccion());
        ascensortdd.personaDentro(pt.getPisoPersonatdd());

        assertFalse(as.personaIngresada());
        assertEquals(as.llegadaSubida(), pt.getSeleccion());


    }

    @Test
    public void dejarPersona(){
        Ascensortdd as;
        Personatdd pt;

        as=new Ascensortdd();
        pt=new Personatdd();
        pt.setSeleccion();

        ascensortdd.peticionRealizada(pt.getSeleccion());
        ascensortdd.personaDentro(pt.getPisoPersonatdd());
        ascensortdd.dejarAPersona();

        assertFalse(as.personaIngresada());
        assertEquals(as.pisoAscensor(), pt.getSeleccion());


    }
}
