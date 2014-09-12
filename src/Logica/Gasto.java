/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


/**
 *
 * @author facundo
 */
public class Gasto {
private String nombreGasto = "";
private int precioGasto = 0;
private int total = 0;



    public String getNombreGasto() {
        return nombreGasto;
    }

    public void setNombreGasto(String nombreGasto) {
        this.nombreGasto = nombreGasto;
    }

    public int getPrecioGasto() {
        return precioGasto;
    }

    public void setPrecioGasto(int precioGasto) {
        this.precioGasto = precioGasto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
 
    @Override
    public String toString() {
        return "" + nombreGasto + ":     $ " + precioGasto + "      total=" + total +"" ;
    }
}
