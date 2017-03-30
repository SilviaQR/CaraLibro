

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private EntradaUnionAGrupo entradaU1;
    private Muro muro1;
    private EntradaTexto entradaT1;
    private EntradaTexto entradaT2;
    private EntradaFoto entradaF1;
    private EntradaFoto entradaF2;
    private EntradaUnionAGrupo entradaU2;
    private EntradaUnionAGrupo entradaU3;

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        entradaU1 = new EntradaUnionAGrupo("Brian", "DAM1");
        muro1 = new Muro();
        entradaT1 = new EntradaTexto("Silvia", "'¡Buenos días!");
        muro1.addEntrada(entradaT1);
        entradaT2 = new EntradaTexto("Miguel", "¿Qué tal?!");
        muro1.addEntrada(entradaT2);
        entradaF1 = new EntradaFoto("Nacho", "http://www.elvinilo.es/337/fotomural-bosque-verde.jpg", "Bosque");
        muro1.addEntrada(entradaF1);
        entradaF2 = new EntradaFoto("Miguel", "http://www.abc.es/media/motor/2015/12/04/1-playa--620x349.jpg", "La playa");
        muro1.addEntrada(entradaF2);
        entradaU2 = new EntradaUnionAGrupo("Brian", "DAM1");
        entradaU3 = new EntradaUnionAGrupo("Valerie", "DAM1");
        muro1.addEntrada(entradaU2);
        muro1.addEntrada(entradaU3);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
