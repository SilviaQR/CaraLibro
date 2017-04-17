import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaConComentario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class EntradaConComentario extends Entrada
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
            comentarioAMostrar += comentario + "<br/>";
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
            textoAMostrar += "Esta entrada a&uacute;n no tiene comentarios. ¡S&eacute; el primero en comentar!<br/>"
            + "<textarea cols=\"30\" rows=\"5\" style=\"color: black; text-align: left;\";\"></textarea><br/><p><input type=\"submit\" value=\"Enviar\"/>" 
            + " " + "<input type=\"reset\" value=\"Borrar\"/></p>";
        }
        else{
            textoAMostrar += getComentarios();
        }
        return textoAMostrar;
    }
}
