/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario1
 */
public class Cola {
    
     private char cola[];
    private int inicio;
    private int Final;
    private int nulo;
    private int maximoCola = 20;

    public Cola() {
        cola = new char[maximoCola + 1];
        maximoCola -= 1;
        nulo = - 1;
        inicio = nulo;
        Final = nulo;
    }

    public void desbordamiento(char elemento) {
        if ((inicio == 0 && Final == maximoCola) || (inicio == (Final + 1))) {
            JOptionPane.showMessageDialog(null, "Desbordamiento De Memoria");
            //System.out.println("Desbordamiento De Memoria");
            return;
        } else {
            if (inicio == nulo) {
                inicio = 0;
                Final = 0;
            } else if (Final == maximoCola) {
                Final = 0;
            } else {
                Final += 1;
            }
            cola[Final] = elemento;
        }
    }
    
    public char vacia(){
        char aux;
        if(inicio == nulo){
            JOptionPane.showMessageDialog(null, "Cola Vacia");
            //System.out.println("Cola Vacia");
            return 0;
        }else {
            aux = cola[inicio];
            if(inicio == Final){
                inicio = nulo;
                Final = nulo;
            }else if(inicio == maximoCola)
                inicio = 0;
            else
                inicio += 1;
            return  aux;
        }
    }
}
