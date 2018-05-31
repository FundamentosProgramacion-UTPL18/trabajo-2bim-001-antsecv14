package clasearreglos;

import java.util.Scanner;

public class ClaseArreglos3 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        //se inicializan los 3 arreglos con los valores de calificaciones normales y en base de datos
        double[] calificaciones_progr={18,19,15,16,17,10};
        double[] calificaciones_bd={10,12,13,20,17,20};
        double[] promedios= new double[6];
        // se usa un for para sacar cada uno de los promedios
        for(int contador=0;contador<calificaciones_bd.length;contador++){
            double suma=calificaciones_progr[contador]+calificaciones_bd[contador];
            double promedio=suma/2;
            promedios[contador]=promedio;
        }
        // el siguiente for es para presentar cada estudiante con sus calificaciones normales, base de datos y promedios
        for (int contador=0;contador<calificaciones_bd.length;contador++){
            System.out.printf("Estudiante %d\t\t %.2f\t\t  %.2f\t\t  %.2f\n",contador+1, calificaciones_progr[contador], calificaciones_bd[contador], promedios[contador]);
        // se utiliza el contador+1 para q al presentar el numero de estudiantes lo haga desde el 1
        }
    }
    
}
