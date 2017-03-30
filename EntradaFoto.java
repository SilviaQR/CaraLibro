import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaFoto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto extends EntradaConComentario
{
    // instance variables - replace the example below with your own

    private String urlImagen;
    private String titulo;
    private int cantidadElementos;

    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        // initialise instance variables
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
        cantidadElementos = 6;
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }

    
    public String toString()
    {
        String textoAMostrar = super.toString();    
        textoAMostrar += titulo + "<br/>";
        textoAMostrar += "<img src=\"" + urlImagen + "\"/><br/>";
        return textoAMostrar;
    }
    
     public void mostrar()
    {
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return cantidadElementos;
    }
    
    public void mostrarDatosExclusivos()
    {
        System.out.println(urlImagen + "\n" + titulo);
    }
}
