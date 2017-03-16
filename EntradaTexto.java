import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends Entrada
{
    // instance variables - replace the example below with your own

    private String mensaje;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String mensaje)
    {
        // initialise instance variables
        super(autor);
        this.mensaje = mensaje;
    }

    public String getMensaje()
    {
        return mensaje;
    }

   
    public String toString()
    {
        String textoAMostrar = "";
        textoAMostrar += "Usuario: " + getAutor() + "\n";
        textoAMostrar += mensaje + "\n";
        textoAMostrar += getCantidadMeGusta() + " me gusta. ";
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
        System.out.println(textoAMostrar);
        return textoAMostrar;
    }
}

