import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 * Write a description of class EntradaFoto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto
{
    // instance variables - replace the example below with your own
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private int unlikes;
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        // initialise instance variables
        usuario = autor;
        urlImagen = url;
        this.titulo = titulo;
        comentarios = new ArrayList<String>();
        cantidadMeGusta = 0;
        unlikes = 0;
        momentoPublicacion = LocalDateTime.now();
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
    
    public void addComentario(String comentario)
    {
        comentarios.add(comentario);
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String toString()
    {
        String textoAMostrar = usuario + ": " + urlImagen;
        System.out.println(usuario + " " + momentoPublicacion.getDayOfMonth() + "/" + momentoPublicacion.getMonthValue() + "/" + momentoPublicacion.getYear()
        + " " + momentoPublicacion.getHour() + ":" + momentoPublicacion.getMinute() + ":" + momentoPublicacion.getSecond() + "\n" + urlImagen 
        + "\n" + titulo);
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
