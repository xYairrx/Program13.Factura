/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program14facturaa;

/**
 *
 * @author soyesteph
 */
public class factura {
     private String numerpDePieza;
     private String descripcionPieza; 
     private int cantidadPieza; 
     private double precioPieza;
     private double montoFactura;

    public factura() {
    }

    public factura(String numerpDePieza, String descripcionPieza, int cantidadPieza, double precioPieza) {
        this.numerpDePieza = numerpDePieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidadPieza = cantidadPieza;
        if (precioPieza > 0.0){
        this.precioPieza = precioPieza;
        }
    }
    
    public String getNumerpDePieza() {
        return numerpDePieza;
    }

    public void setNumerpDePieza(String numerpDePieza) {
        this.numerpDePieza = numerpDePieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidadPieza() {
        return cantidadPieza;
    }

    public void setCantidadPieza(int cantidadPieza) {
        this.cantidadPieza = cantidadPieza;
    }

    public double getPrecioPieza() {
        return precioPieza;
    }

    public void setPrecioPieza(double precioPieza) {
        this.precioPieza = precioPieza;
    }
    
    public double obterMontoFactura (int cantidadPieza, double precioPieza){
        this.montoFactura += cantidadPieza *precioPieza;
         return this.montoFactura;
        
    }
     

     
}
    
