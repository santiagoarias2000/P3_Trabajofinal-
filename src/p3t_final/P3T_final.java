/*
 Author      = Santiago Arias Mancilla.
 Date        = 20/11/2019
 Description = La empresa “Boyacá ancestral  food” les pide crear un programa qu
e permita tener la información del sueldo (numero randomico entre SMLV  y el SML
V*4) de cada uno de sus N empleados por cada trimestre del año
 */
package p3t_final;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class P3T_final {

    static int[][] myVector;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
// This function is a principal menu
        try {
            int opt = 6;
            System.out.println("Selccione la opcion de su preferecia, si quiere "
                    + "tener la infomacion completa siga la secuencia de el menu.");
            while (opt != 0) {
                show_menu();
                opt = keyboard.nextInt();

                switch (opt) {
                    case 1:
                        create_myVector();
                        break;
                    case 2:
                        show_myVector(myVector);
                        break;
                    case 3:
                        show_max_20000000(myVector);
                        break;
                    case 4:
                        show_average(myVector);
                        show_average2(myVector);
                        show_average3(myVector);
                        show_average4(myVector);
                        break;
                    case 5:
                        salary_max(myVector);
                        break;
                    case 6:
                        salary_min(myVector);
                        create_file(myVector);
                        System.out.println("Terminada toda la funcion por favor "
                                + "ingrese al disco local C, \n en la caperta de "
                                + "usuarios y despues en la carpeta de santiago,"
                                + " buscar el archo de texto con nombre: "
                                + "pago de trabajadores.");
                        break;

                }
                
            }

        } catch (Exception e) {
            System.err.println("opción no encontrada, seleccione una de las opciones disponibles");
            System.err.println("Aborted system. Error public static void main("
                    + "String[] args) " + e.toString());
        }
    }

    public static void show_menu() {
        // This function is a display a menu 
        try {
            System.out.println(" --------------Software de nomina para empresa "
                    + "Boyacá Ancestral Food--------------"
                    + "\n creado por Santiago Andres Arias Mancilla."
                    + "\n Menú principal:"
                    + "\n 1.  Generar base de datos."
                    + "\n 2.  Visualizar base de datos."
                    + "\n 3.  Empleados que ganaron más de $20.000.000"
                    + "\n 4.  Promedio de sueldos por trimestre."
                    + "\n 5.  Empleado con mayor ganancia de sueldos en el año."
                    + "\n 6.  Empleado con menor ganancia de sueldos en el año."
                    + "\n 0.  Salir del software.");
        } catch (Exception e) {
            System.out.println("Aborted system. Error public static void show_"
                    + "menu() " + e.toString());
        }

    }

    public static int[][] create_myVector() {
        //This function is a create of vector 
        try {
            System.out.println("Ingrese el numero de trabajadores a los que quie"
                    + "re ingresa a el sistema.");
            int N = keyboard.nextInt();

            myVector = new int[N][4];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 4; j++) {
                    myVector[i][j] = (int) Math.round(Math.random() * (3312464
                            - 828116 + 1) + 828116);
                }

            }

            return myVector;
        } catch (Exception e) {
            System.err.println("Aborted system. Error public static int [][][] "
                    + "create_myVector() " + e.toString());
            return null;
        }

    }

    public static void show_myVector(int[][] myVector) {
        // This function is a show of vector 
        try {
            for (int i = 0; i < myVector.length; i++) {
                System.out.println("Numero de trabajador es: " + (1 + i) + "\n el "
                        + "pago de el trabajador es: " + myVector[i][0] + "\n el "
                        + "pago de el trabajador es: " + myVector[i][1]
                        + "\n el pago de el trabajador es: " + myVector[i][2] + " "
                        + "\n el pago de el trabajador es: " + myVector[i][3]);
            }
        } catch (Exception e) {
            System.err.println("Aborted system. Error public static void show_my"
                    + "Vector(int[][] myVector) " + e.toString());
        }

    }

    public static int show_max_20000000(int[][] vector) {
        // This function show salari max of 5000000 
        try {
            int total = 0;
            int employer = 0;
            for (int[] vector1 : vector) {
                total = vector1[1] + vector1[2] + vector1[3];
                if (total >= 5000000) {
                    employer += 1;
                }
            }
            System.out.println("resutado: " + employer);
            return employer;
        } catch (Exception e) {
            return 0;
        }
    }

    public static double show_average(int[][] vector) {
        // This function show average in all program 
        try {
            int suma = 0;
            for (int i = 0; i < vector.length; i++) {
                suma += vector[i][0];

            }
            double average = suma / vector.length;
            System.out.println("resutado 1: " + average);
            return suma;

        } catch (Exception e) {
            System.out.println("Aborted system Error public static int show_"
                    + "average(int[][] vector) " + e.toString());

            return 0;
        }
    }

    public static double show_average2(int[][] vector) {
        // This function 
        try {
            int suma = 0;
            for (int i = 0; i < vector.length; i++) {
                suma += vector[i][1];

            }
            double average = suma / vector.length;
            System.out.println("resutado 2: " + average);
            return suma;

        } catch (Exception e) {
            System.out.println("Aborted system Error public static int show_"
                    + "average2(int[][] vector) " + e.toString());

            return 0;
        }
    }

    public static double show_average3(int[][] vector) {
        //
        try {
            int suma = 0;
            for (int i = 0; i < vector.length; i++) {
                suma += vector[i][2];

            }
            double average = suma / vector.length;
            System.out.println("resutado 3: " + average);
            return suma;

        } catch (Exception e) {
            System.out.println("Aborted system Error public static int show_"
                    + "average3(int[][] vector) " + e.toString());

            return 0;
        }
    }

    public static double show_average4(int[][] vector) {
        //
        try {
            int suma = 0;
            for (int i = 0; i < vector.length; i++) {
                suma += vector[i][3];

            }
            double average = suma / vector.length;
            System.out.println("resultado 4: " + average);
            return suma;

        } catch (Exception e) {
            System.out.println("Aborted system Error public static int show_"
                    + "average4(int[][] vector) " + e.toString());

            return 0;
        }
    }

    public static int salary_max(int[][] vector) {
        // 
        try {
            int max = 0;
            int employer = 0;
            for (int i = 0; i < vector.length; i++) {
                int total = vector[i][0] + vector[i][1] + vector[i][2] + vector[i][3];
                if (i == 0) {
                    max = total;
                } else if (total > max) {
                    max = total;
                    employer = i;
                }
            }
            System.out.println("El salario mayor de los empleados es: " + max);
            return employer + 1;
        } catch (Exception e) {
            System.err.println("Aborted system. Error public static int salary_"
                    + "max(int [][] vector) " + e.toString());
            return 0;
        }
    }

    public static int salary_min(int[][] vector) {
        // 
        try {
            int min = 0;
            int employer = 0;
            for (int i = 0; i < vector.length; i++) {
                int total = vector[i][0] + vector[i][1] + vector[i][2] + vector[i][3];
                if (i == 0) {
                    min = total;
                } else if (total < min) {
                    min = total;
                    employer = i;
                }
            }
            System.out.println("resutado: " + min);
            return employer + 1;
        } catch (Exception e) {
            System.err.println("Aborted system. Error public static int salary_"
                    + "min(int [][] vector) " + e.toString());
            return 0;
        }
    }

    public static void create_file(int[][] vector) {
        // This function create file in the program
        try {
            PrintWriter archivo = new PrintWriter("c:/\\Users\\santiago/pago de trabajadores.txt", "UTF-8");
            archivo.println("This file was create automatic by JAVA");
            for (int i = 0; i < vector.length; i++) {
                archivo.println("Numero de trabajador es: " + (1 + i) + "\n el "
                        + "pago de el trabajador es: " + myVector[i][0] + "\n el "
                        + "pago de el trabajador es: " + myVector[i][1]
                        + "\n el pago de el trabajador es: " + myVector[i][2] + " "
                        + "\n el pago de el trabajador es: " + myVector[i][3]);
            }
            for (int[] vector1 : vector) {
                archivo.println("-------Totals------");
                archivo.println("Salario minimo: " + salary_max(vector));
                archivo.println("Salario maximo: " + salary_min(vector));
                archivo.println("Promedio 1 : " + show_average(vector) + " "
                        + "promedio 2:" + show_average2(vector)
                        + " promendio 3: " + show_average3(vector) + " "
                        + "promedio 4: " + show_average4(vector));
                archivo.println("Mayor de 5000000: " + show_max_20000000(vector));
                archivo.println("The programmer is: Santiago Arias Mancilla. ");
                archivo.println("The date is: 24/11/2019");
                archivo.close();
            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.err.println("Aborted system. Error public static void create"
                    + "_file(int [][] vector) " + e.toString());
        }
    }
}
