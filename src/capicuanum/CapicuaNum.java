/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicuanum;

import Cola.Cola;
import Pils.Pila;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario1
 */
public class CapicuaNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila miPilita;
        Cola miColita;
        char ch;
        boolean esCapicua = false;
        String numero;
        Scanner sc = new Scanner(System.in);
        try {
            miPilita = new Pila();
            miColita = new Cola();
            System.out.println("Ingrese Un Numero Para Verificar Si Es Capicua");
            System.out.flush();
            numero = sc.next();
            for(int i = 0; i < numero.length(); i++){
                ch = numero.charAt(i);
                miPilita.insertar(ch);
                miColita.desbordamiento(ch); 
            }
            for(int i = 0; i < numero.length(); i++){
                if(miPilita.extraer() == miColita.vacia()){
                    esCapicua = true;
                    break;
                }else{
                    esCapicua = false;
                    break;
                }
        }
            if(esCapicua)
                JOptionPane.showMessageDialog(null, "El Numero " + numero + " Es Capicua");
                //System.out.println("El Numero " + numero + " Es Capicua");
            else
                JOptionPane.showMessageDialog(null, "El Numero " + numero + " No Es Capicua");
                //System.out.println("El Numero " + numero + " No Es Capicua");
        } catch (Exception e) {
            System.err.println("Exception: " + e);
        }
    
    }
    
}
