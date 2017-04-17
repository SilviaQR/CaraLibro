import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Entrada
{
    // instance variables - replace the example below with your own
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private int unlikes;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor)
    {
        // initialise instance variables
        usuario = autor;    
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        unlikes = 0;
    }

    public void meGusta()
    {
        cantidadMeGusta++;
    }

    public int getCantidadMeGusta()
    {
        return cantidadMeGusta;
    }

    public void noMeGusta()
    {
        unlikes--;
    }

    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }

    public String getAutor()
    {
        return usuario;
    }

    public String toString()
    {
        String textoAMostrar = "";
        textoAMostrar += "<br/><b>Usuario</b>: " + getAutor() + "<br/>";
        textoAMostrar += getCantidadMeGusta() + " me gusta. ";
        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long horasQueHanPasadoDesdeCreacion = minutosQueHanPasadoDesdeCreacion / 60;
        long diasQueHanPasadoDesdeCreacion = horasQueHanPasadoDesdeCreacion / 24;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        textoAMostrar += "<br/><b>Hace: ";
        if(diasQueHanPasadoDesdeCreacion > 0){
            textoAMostrar += diasQueHanPasadoDesdeCreacion + " días,";
        }
        if(horasQueHanPasadoDesdeCreacion > 0){
            textoAMostrar += horasQueHanPasadoDesdeCreacion + " horas,";
        }
        if(minutosQueHanPasadoDesdeCreacion > 0){
            textoAMostrar += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        textoAMostrar += segundosResiduales + " segundos.<br/></b>";
        return textoAMostrar;
    }

    public void setCantidadMeGusta(int cantidad)
    {    
        cantidadMeGusta = cantidad;
    }

    public abstract void mostrar();

    public abstract int getCantidadDeDatosAsociadosALaEntrada();
}