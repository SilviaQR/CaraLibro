

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
    private Muro muro1;
    private EntradaTexto entradaT1;
    private EntradaTexto entradaT2;
    private EntradaFoto entradaF1;
    private EntradaFoto entradaF2;
    private EntradaUnionAGrupo entradaU1;
    private EntradaUnionAGrupo entradaU2;

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
        muro1 = new Muro();
        entradaT1 = new EntradaTexto("Silvia", "Hola");
        muro1.addEntrada(entradaT1);
        entradaT2 = new EntradaTexto("Ivan", "Que tal");
        muro1.addEntrada(entradaT2);
        entradaF1 = new EntradaFoto("Miguel", "www.google.es", "Google");
        muro1.addEntrada(entradaF1);
        entradaF2 = new EntradaFoto("Nacho", "www.youtube.es", "Youtube");
        muro1.addEntrada(entradaF2);
        entradaU1 = new EntradaUnionAGrupo("Brian", "dam1");
        muro1.addEntrada(entradaU1);
        entradaU2 = new EntradaUnionAGrupo("Valerie", "dam2");
        muro1.addEntrada(entradaU2);
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
