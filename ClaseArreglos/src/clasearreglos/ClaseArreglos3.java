package clasearreglos;

import java.util.Scanner;

public class ClaseArreglos3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        double[] calificaciones_progr={18,19,15,16,17,10};
        double[] calificaciones_bd={10,12,13,20,17,20};
        double[] promedios= new double[6];
        for(int contador=0;contador<calificaciones_bd.length;contador++){
            double suma=calificaciones_progr[contador]+calificaciones_bd[contador];
            double promedio=suma/2;
            promedios[contador]=promedio;
        }
        for (int contador=0;contador<calificaciones_bd.length;contador++){
            System.out.printf("Estudiante %d\t\t %.2f\t\t  %.2f\t\t  %.2f\n",contador+1, calificaciones_progr[contador], calificaciones_bd[contador], promedios[contador]);
        
        }
    }
    
}
