import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaConComentario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaConComentario extends Entrada
{
    // instance variables - replace the example below with your own
    private ArrayList<String> comentarios;
    /**
     * Constructor for objects of class EntradaConComentario
     */
    public EntradaConComentario(String autor)
    {
        super(autor);
        comentarios = new ArrayList<String>();
    }

    public String getComentarios()
    {
        String comentarioAMostrar = "";
        for(String comentario : comentarios)
        { 
            comentarioAMostrar += comentario + " ";
        }
        return comentarioAMostrar;
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }
    
    public String toString()
    {
        String textoAMostrar = super.toString();
        if(getComentarios().isEmpty()){
            textoAMostrar += "Esta entrada aún no tiene comentarios. ¡Sé el primero en comentar!\n";
        }
        else{
            textoAMostrar += getComentarios();
        }
        return textoAMostrar;
    }
}
