import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends EntradaConComentario
{
    // instance variables - replace the example below with your own
    private String mensaje;
    private int cantidadElementos;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String mensaje)
    {
        // initialise instance variables
        super(autor);
        this.mensaje = mensaje;
        cantidadElementos = 5;
    }

    public String getMensaje()
    {
        return mensaje;
    }
   
    public String toString()
    {
        String textoAMostrar = super.toString();
        textoAMostrar += mensaje + "<br/>";
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
        System.out.println(mensaje);
    }
}

