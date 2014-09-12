/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author facundo
 */
public  class CrearTxt {
    private String nombreEvento = "";
    private int CatInvitados = 0;
    private Gasto Gastos[] = new Gasto[1000];
    



    public static void crearTxt(Gasto gasto){

        //Un texto cualquiera guardado en una variable
        String alumnos="hola";

        try
        {
        //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
        File archivo=new File("listaAlumnos.txt");

        //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
        FileWriter escribir=new FileWriter(archivo,true);

        //Escribimos en el archivo con el metodo write
        escribir.write(alumnos);

        //Cerramos la conexion
        escribir.close();
        }

        //Si existe un problema al escribir cae aqui
        catch(Exception e)
        {
        System.out.println("Error al escribir");
        }
        }
    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public int getCatInvitados() {
        return CatInvitados;
    }

    public void setCatInvitados(int CatInvitados) {
        this.CatInvitados = CatInvitados;
    }

    public Gasto[] getGastos() {
        return Gastos;
    }


    public CrearTxt() {
    }


    @Override
    public String toString() {
        return "CrearTxt{" + "nombreEvento=" + nombreEvento + ", CatInvitados=" + CatInvitados + ", Gastos=" + Gastos + '}';
    }


}


