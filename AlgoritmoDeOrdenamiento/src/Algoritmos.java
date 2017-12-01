/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author vanessa albarran
 */
public class Algoritmos {
    public static void main(String[] args) {
        AlgoritmosDeOrdenamiento ordenar = new AlgoritmosDeOrdenamiento();
        int vector1[] = {5, 6, 3, 44, 22, 1};
        int vector2[] = {55, 4, 43, 44, 2, 10};
        int vector3[] = {5, 2,1,8,3,9,7};

        /*System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo ordenado con burbuja 1");
        ordenar.burbuja1(vector1);
        ordenar.mostrarArreglo(vector1);
        System.out.println();
        System.out.println("Arreglo original");
        ordenar.mostrarArreglo(vector2);
        System.out.println("Arreglo ordenado con burbuja 2");
        ordenar.burbuja1(vector2);
        ordenar.mostrarArreglo(vector2);*/

        //System.out.println("Arreglo orginal");
        //ordenar.mostrarArreglo(vector2);
        //ordenar.radix(vector2);
        //ordenar.mostrarArreglo(vector3);
        //System.out.println("Arreglo Ordenado con Quick");
        //ordenar.quick(vector3, 0, vector3.length-1);
        int tam;
        tam=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el tamaño del arreglo:"));
        int vectorcito[]=new  int[tam];
        for (int i=0;i<tam;i++){
            vectorcito[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento del indice"+i));
            ordenar.insercion(vectorcito,i+1);

        }



    }
}

