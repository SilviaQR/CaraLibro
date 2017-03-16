import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaFoto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto extends Entrada
{
    // instance variables - replace the example below with your own

    private String urlImagen;
    private String titulo;

    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        // initialise instance variables
        super(autor);
        urlImagen = url;
        this.titulo = titulo;

    }

    
    
    
    public String getUrlImagen()
    {
        return urlImagen;
    }

    
    public String toString()
    {
        String textoAMostrar = "";
        textoAMostrar += "Usuario: " + getAutor() + "\n";
        textoAMostrar += titulo + "\n";
        textoAMostrar += urlImagen + "\n";
        textoAMostrar += getCantidadMeGusta() + " me gusta";
        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        textoAMostrar += "Hace: ";
        if(minutosQueHanPasadoDesdeCreacion > 0)
        {
            textoAMostrar += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        textoAMostrar += segundosResiduales + " segundos.\n";
        if(getComentarios().isEmpty())
        {
            textoAMostrar += "Esta entrada aún no tiene comentarios. ¡Sé el primero en comentar!";
        }
        else{

            textoAMostrar += getComentarios();

        }
        return textoAMostrar;
    }
}
