package clasearreglos;

import java.util.Scanner;

public class ClaseArreglos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        //en la linea 9 se procede a inicializar lel arreglo 
        int[] c=new int[4];
        //en la linea 11 se le da el valor de 10 al primer puesto del arreglo
        c[0]=10;
        //el siguiente for es para presentar de arriba hacia abajo el arreglo
        for(int contador=0;contador<c.length;contador++){
            System.out.println(c[contador]);
        }
    }
    
}
