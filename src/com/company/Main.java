package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int s = 1;
        do {
            Scanner entrada = new Scanner(System.in);
            int valor;
            String tipo;
            System.out.println("Que conversion necesita hacer?");
            System.out.println("1. Masa (Kg-lb)");
            System.out.println("2. Distancia (Km-mi)");
            int opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Cuanto desea convertir?");
                    valor = entrada.nextInt();
                    System.out.println("Que desea convertir?");
                    System.out.println("1. Kg a Lb");
                    System.out.println("2. Lb a Kg");
                    opc = entrada.nextInt();
                    switch (opc) {
                        case 1:
                            tipo = "Lb";
                            masa(valor, tipo);
                            break;
                        case 2:
                            tipo = "Kg";
                            masa(valor, tipo);
                        default:
                            // System.out.println("No existe");
                    }
                    break;
                case 2:
                    System.out.println("Cuanto desea convertir?");
                    valor = entrada.nextInt();
                    System.out.println("Que desea convertir?");
                    System.out.println("1. Km a Mi");
                    System.out.println("2. Mi a Km");
                    opc = entrada.nextInt();
                    switch (opc) {
                        case 1:
                            tipo = "Mi";
                            distancia(valor, tipo);
                            break;
                        case 2:
                            tipo = "Km";
                            distancia(valor, tipo);
                        default:
                            //   System.out.println("No existe");
                    }
                    break;
                default:
                    System.out.println("No existe");
            }
            System.out.println("Desea repetir?");
            System.out.println("1. Si");
            System.out.println("2. No");
            s = entrada.nextInt();
        } while (s != 2);
    }

    public static void masa(int a, String b) {
        double resultado;
        if (b == "Lb") {
            resultado = a / 2.2;
            System.out.println("Se ha convertido: " + a + " kg a " + resultado + " " + b);
        } else {
            resultado = a * 2.2;
            System.out.println("Se ha convertido: " + a + " Lb a " + resultado + " " + b);
        }
    }

    public static void distancia(int c, String d) {
        double resultado;
        if (d == "Mi") {
            resultado = c / 1.60934;
            System.out.println("Se ha convertido: " + c + " Km a " + resultado + " " + d);
        } else {
            resultado = c * 1.60934;
            System.out.println("Se ha convertido: " + c + " Mi a " + resultado + " " + d);
        }
    }
}
