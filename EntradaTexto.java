import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto
{
    // instance variables - replace the example below with your own
    private String usuario;
    private String mensaje;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private int unlikes;
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String usuario, String mensaje)
    {
        // initialise instance variables
        this.usuario = usuario;
        this.mensaje = mensaje;
        momentoPublicacion = LocalDateTime.now();
        comentarios = new ArrayList<String>();
        cantidadMeGusta = 0;
        unlikes = 0;
    }

    public int meGusta()
    {
        cantidadMeGusta++;
        return cantidadMeGusta;
    }

    public int noMeGusta()
    {
        unlikes--;
        return unlikes;
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }

    public String getMensaje()
    {
        return mensaje;
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
        String textoAMostrar = usuario + ": " + mensaje;
        System.out.println(usuario + " " + momentoPublicacion.getDayOfMonth() + "/" + momentoPublicacion.getMonthValue() + "/" + momentoPublicacion.getYear()
        + " " + momentoPublicacion.getHour() + ":" + momentoPublicacion.getMinute() + ":" + momentoPublicacion.getSecond() + "\n" + mensaje);
        if(!comentarios.isEmpty()){
            for(String comentario : comentarios){
                System.out.println(comentario);
            }
        }
        else{
            System.out.println("Esta entrada aún no tiene comentarios. ¡Sé el primero en comentar!");
        }
        System.out.println("Me gusta:" + cantidadMeGusta + " " + "No me gusta: " + unlikes);
        return textoAMostrar;
    }
}

