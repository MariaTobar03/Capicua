/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pils;

/**
 *
 * @author usuario1
 */
public class Pila {
    
    private static final int tamañoPila = 20;
    private int inicio;
    private char listaPila[];

    public Pila() {
        inicio = -1;
        listaPila = new char[tamañoPila];
    }

    public void insertar(char elemento) throws Exception {
        if (pilaLlena()) {
            throw new Exception("Desbordamiento De Pila");
        }
        inicio++;
        listaPila[inicio] = elemento;
    }

    public char extraer() throws Exception {
        char aux;
        if (pilaVacia()) {
            throw new Exception("Pila Vacia, No Se Puede Extraer");
        }
        aux = listaPila[inicio];
        inicio--;
        return aux;
    }

    public boolean pilaVacia() {
        return inicio == -1;
    }

    public boolean pilaLlena() {
        return inicio == tamañoPila - 1;
    }
}
