import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionAGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    // instance variables - replace the example below with your own
    private String grupo;
    private int cantidadElementos;
    
    /**
     * Constructor for objects of class EntradaUnionAGrupo
     */
    public EntradaUnionAGrupo(String usuario, String grupo)
    {
        super(usuario);
        this.grupo = grupo;
        cantidadElementos = 5;
    }
    
    public String getNombreGrupo()
    {
        return grupo;
    }
    
    public String toString()
    {
        String textoAMostrar = super.toString();
        textoAMostrar += "El usuario " + getAutor() + " ";
        textoAMostrar += "se ha unido al grupo " + grupo + ".\n";
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
        System.out.println(grupo);
    }
    
}
