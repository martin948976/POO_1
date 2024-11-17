/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author USER
 */
public class Parlantes extends Producto{
    private String Rendimiento;
    private String Sonido;

    public Parlantes(String Rendimiento, String Sonido, String Color, String Marca, String Modelo) {
        super(Color, Marca, Modelo);
        this.Rendimiento = Rendimiento;
        this.Sonido = Sonido;
    }

    public String getRendimiento() {
        return Rendimiento;
    }

    public void setRendimiento(String Rendimiento) {
        this.Rendimiento = Rendimiento;
    }

    public String getSonido() {
        return Sonido;
    }

    public void setSonido(String Sonido) {
        this.Sonido = Sonido;
    }
    
    
}
    