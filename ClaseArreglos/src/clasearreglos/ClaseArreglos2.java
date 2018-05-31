package clasearreglos;

import java.util.Scanner;

public class ClaseArreglos2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        //en la linea 9 se inicializa el arreglo
        int[] arreglo={1,2,3,4,5,6,7};
        // el siguiente for se usa para recorrer cada elemento de la lista
        for(int contador=0;contador<arreglo.length;contador++){
            //el if se uso para usar nada mas los numeros pares del arreglo
            if (arreglo[contador]%2==0){
                System.out.println("Tabla " + arreglo[contador]+"\n");
                // este for es para multiplicar cada numero par con los numeros del 1 al 12
                for (int cont=0;cont<=12;cont++){
                    //se procede a presentar la cada multiplicacion con su resultado
                    System.out.printf("%d %s %d %s %d\n", arreglo[contador], "x", cont, "=", arreglo[contador]*cont);
                }
            }
        }
    }
    
}
