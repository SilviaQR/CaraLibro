import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.nio.file.Files;
import java.io.IOException;
import java.awt.Desktop;
import java.net.*;
import java.util.Scanner;

/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    private ArrayList<Entrada> entradas;
    private ArrayList<String> nuevoMuro;

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entradas = new ArrayList<>();
        nuevoMuro = new ArrayList<>();
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
        for(Entrada entrada : entradas){
            System.out.println(entrada.getCantidadDeDatosAsociadosALaEntrada());
        }
    }

    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada, String nombre)
    {
        for(Entrada entrada : entradas){

            // el equals estaba al reves, ojo!!
            if(entrada.getClass().getSimpleName().equals(tipoEntrada) && entrada.getAutor().equals(nombre) || (entrada.getClass().getSimpleName().equals(tipoEntrada))
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

    public void mostrarMuroEnNavegador()
    {
        // Obtenemos una referencia a una ruta donde estará el archivo
        Path rutaArchivo = Paths.get("muro.html");
        Runtime run = Runtime.getRuntime();
        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una
        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write("<html><head><title>CaraLibro - Muro</title><link rel=\"stylesheet\" type=\"text/css\" href=\"muroCodigo.css\" media=\"screen\"/></head><body>");
            archivo.write("<h1><img src=\"caralibro.jpg\"/>araLibro</h1>");
            archivo.write("Bienvenido a CaraLibro. Esto es lo que ha ocurrido en tu ausencia:<br/>");

            for(int index = 0; index < entradas.size(); index++){
                archivo.write("<br/><fieldset>" + entradas.get(index).toString() + "<br/></fieldset>");
            }
            archivo.write("</body></html>");
            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }
        try{
            run.exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe " + "C:/Users/Zivy/Desktop/Programacion/CaraLibro/muro.html");
        }
        catch (IOException exception){
            System.out.println(exception.toString());
        }
    }

    public void mostrarMuroEnNavegador2(String user)
    {
        Runtime run = Runtime.getRuntime();
        Path rutaArchivo = Paths.get("nuevoMuro.html");
        try{
            URL direccion = new URL("https://script.google.com/macros/s/AKfycbzHc3p1twTfyF7o0_cxSwnxSsyOemuHnSu406ly9DZIf5Ck2BA/exec" + "?user=" + user);
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write("<html><head><title>CaraLibro - Muro</title><link rel=\"stylesheet\" type=\"text/css\" href=\"muroCodigo.css\" media=\"screen\"/></head><body>");
            archivo.write("<h1><img src=\"caralibro.jpg\"/>araLibro</h1>");
            archivo.write("Bienvenido a CaraLibro. Esto es lo que ha ocurrido en tu ausencia:<br/>");   
            Scanner sc = new Scanner (direccion.openStream());
            while(sc.hasNextLine()){
                String lineaLeida = sc.nextLine();
                String[] nuevasEntradas = lineaLeida.split(";");
                for(String cadena : nuevasEntradas){
                    nuevoMuro.add(cadena);

                    switch(cadena){
                        case "EntradaTexto": EntradaTexto nuevaEntradaTexto = new EntradaTexto(nuevasEntradas[1], nuevasEntradas[2]);                      
                        entradas.add(nuevaEntradaTexto);
                        archivo.write("<br/><fieldset>" + nuevaEntradaTexto + "<br/></fieldset>");
                        break;
                        case "EntradaFoto": EntradaFoto nuevaEntradaFoto = new EntradaFoto(nuevasEntradas[1], nuevasEntradas[2], nuevasEntradas[3]);
                        entradas.add(nuevaEntradaFoto);
                        archivo.write("<br/><fieldset>" + nuevaEntradaFoto + "<br/></fieldset>");
                        break;
                        case "EntradaUnionAGrupo": EntradaUnionAGrupo nuevaEntradaGrupo = new EntradaUnionAGrupo(nuevasEntradas[1], nuevasEntradas[2]);
                        entradas.add(nuevaEntradaGrupo);
                        archivo.write("<br/><fieldset>" + nuevaEntradaGrupo + "<br/></fieldset>");
                        break;
                    }
                }
                System.out.println(lineaLeida);
            }
            sc.close();
            archivo.close();
            run.exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe " + "C:/Users/Zivy/Desktop/Programacion/CaraLibro/nuevoMuro.html");
        }
        catch(IOException exc)
        {
            System.out.println(exc.toString());
        }
    }
}
