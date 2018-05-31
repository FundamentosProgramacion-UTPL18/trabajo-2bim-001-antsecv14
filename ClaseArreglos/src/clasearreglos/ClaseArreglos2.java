package clasearreglos;

import java.util.Scanner;

public class ClaseArreglos2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int[] arreglo={1,2,3,4,5,6,7};
        for(int contador=0;contador<arreglo.length;contador++){
            if (arreglo[contador]%2==0){
                System.out.println("Tabla " + arreglo[contador]+"\n");
                for (int cont=0;cont<=12;cont++){
                    System.out.printf("%d %s %d %s %d\n", arreglo[contador], "x", cont, "=", arreglo[contador]*cont);
                }
            }
        }
    }
    
}
