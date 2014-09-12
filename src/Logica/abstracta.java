/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Ui.Evento;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facundo
 */
 public  abstract class abstracta {
        private static Gasto[] Gastos = new Gasto[100];
        public static int GastoTotal=0;
        public static String nombreEvento="";
        private static String archivo = "array.db";
        private static FileInputStream fis = null;
        private static ObjectInputStream ois = null;
        private static FileOutputStream fos = null;
        private static ObjectOutputStream oos = null;
        
        
        public static boolean addGasto(Gasto p){
        for (int i=0; i<Gastos.length;i++){
            if (Gastos[i]==null){
                Gastos[i]=p;
                return true;
            }
        }
        return false;}
    public static Gasto[] getLista(){
        return Gastos;
    }
    public static void setLista(Gasto[] lista){
        abstracta.Gastos= lista;
    }

    public static int getGastoTotal() {
        return GastoTotal;
    }

    public static void setGastoTotal(int GastoTotal) {
        abstracta.GastoTotal = GastoTotal;
    }

    public static String getNombreEvento() {
        return nombreEvento;
    }

    public static void setNombreEvento(String nombreEvento) {
        nombreEvento = nombreEvento;
    }

    public static void refreshTable() {
        //Levantamos los datos a cargar
        Gasto[] listado = abstracta.getLista();

        //Creamos el modelo de datos de la tabla.
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("n°");
        model.addColumn("gasto");
        model.addColumn("precio");
        model.addColumn("total");

        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                String[] fila = new String[4];
                String strprecio = Integer.toString(listado[i].getPrecioGasto());
                fila[0] = "" + (i+1);
                fila[1] = listado[i].getNombreGasto();
                fila[2] = strprecio;
                fila[3] = "$" + listado[i].getTotal();
                model.addRow(fila);
            }
        }
       Evento.jList1.setModel(model);
    }

 public static boolean saveLista() {

        boolean saved = false;
        
        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            //Esta es otra forma de hacer un for, la sintaxis es la siguiente:
            //for (Clase aux:array), recorre el array y se lo asigna al auxiliar.
            oos.writeObject(Gastos);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
            return false;
        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo");
            return false;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    oos = null;
                }
                if (fos != null) {
                    fos.close();
                    fos = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }        

        System.out.println("Guardado Correctamente");
        return true;
    }

    /*
     * Devuelve un arraylist con las ventas en disco
     */
 
 }

 
 
