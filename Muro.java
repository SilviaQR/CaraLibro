import java.util.ArrayList;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    // instance variables - replace the example below with your own
    private ArrayList<Entrada> entradas;

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        // initialise instance variables
        entradas = new ArrayList<>();
    }

    public void addEntrada(Entrada nuevaEntrada)
    {
        entradas.add(nuevaEntrada);
    }

    public String toString()
    {
        String textoAMostrar = "";
        for(Entrada entrada : entradas){ 
            textoAMostrar += entrada + "\n";
        }
        return textoAMostrar;
    }

    public void mostrar()
    {
        System.out.println(this);
    }

    public void verCantidadDatosPorEntrada()
    {
        for(Entrada entrada : entradas)
        {
            System.out.println(entrada.getCantidadDeDatosAsociadosALaEntrada());
        }
    }

    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada, String nombre)
    {
        for(Entrada entrada : entradas){
            if(tipoEntrada == entrada.getClass().getSimpleName() && entrada.getAutor().equals(nombre) ||tipoEntrada == entrada.getClass().getSimpleName()
             && nombre == null || tipoEntrada == null && entrada.getAutor().equals(nombre) || tipoEntrada == null && nombre == null){
                switch(entrada.getClass().getSimpleName()){
                    case "EntradaTexto": ((EntradaTexto) entrada).mostrarDatosExclusivos();
                    break;
                    case "EntradaFoto": ((EntradaFoto) entrada).mostrarDatosExclusivos();
                    break;
                    case "EntradaUnionAGrupo": ((EntradaUnionAGrupo) entrada).mostrarDatosExclusivos();
                    break;
                }
            }
        }
    }
}
