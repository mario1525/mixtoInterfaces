
package Humano;

import Interfas.interfaces;
import abstracto.nombres;


public class color extends nombres implements interfaces{
    
    private boolean color;

    public color() {
    }

    public color(boolean color) {
        this.color = color;
    }
    

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }
    

    @Override
    public void asigName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesoGramos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pesoLibra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()+ "color{" + "color=" + color + '}';
    }
    
    
    
}
