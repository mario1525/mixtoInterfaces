
package Main;

import Animal.gato;
import Animal.perro;
import Comida.cena;
import Comida.desayuno;
import Humano.color;
import Humano.genero;


public class Main {
    public static void main(String[] args) {
       gato cat = new gato();
       cat.setNombre("michu");
       cat.setColor("negro");
       System.out.println(cat);
       
       perro dog = new perro();
       dog.setNombre("michu");
       dog.setColor("negro");
       System.out.println(dog);
       
       cena cen = new cena();
       cen.setNombre("perro ");
       cen.setPrecio(120);
       System.out.println(cen);
       
       desayuno eg = new desayuno();
       eg.setNombre("michu");
       eg.setPrecio(2558);
       System.out.println(eg);
       
       color col = new color();
       col.setNombre("michu");
       col.setColor(true);
       System.out.println(col);
       
       genero gen = new genero();
       gen.setNombre("michu");
       gen.setGenero(true);
       System.out.println(gen);
       
       
    }
}
