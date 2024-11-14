/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

/**
 *
 * @author Martin Sagastume
 */
public class Herencia {

    public static void main(String[] args) {
    Animal p = new perro("color negro", "si", "si", "si", Integer.BYTES);
      p.Sonido();
    
    Animal g = new Gato("Cafe","Si", "Si", "Si", 4);
       g.Sonido();
       
    Animal q = new Quequo("No", "Si", "Si", "Si", 4);
       q.Sonido();
    }
}
 