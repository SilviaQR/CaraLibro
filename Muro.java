import java.util.ArrayList;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    // instance variables - replace the example below with your own
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        // initialise instance variables
        mensajes = new ArrayList<EntradaTexto>();
        fotos = new ArrayList<EntradaFoto>();
    }
    
    public void addEntradaTexto(EntradaTexto entradaTexto)
    {
        mensajes.add(entradaTexto);
    }
    
    public void addEntradaFoto(EntradaFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }
    
    public String toString()
    {
        String textoAMostrar = "";
        mensajes.toString();
        fotos.toString();
        return textoAMostrar;
    }
}