package Server;

import java.util.Arrays;

public class Methods {
    public String addition(String nombre, double altura, double peso){
        double imc =(peso / (altura * altura));
        return "Hola " + nombre + "\n" + " tu IMC es: " + imc;
    }

    public String addition2(double num1, double num2, double num3, double num4, double num5){
        double product = (num1 * num2 * num3 * num4 * num5);
        double suma = (num1 + num2 + num3 + num4 + num5);
        double promedio = (num1 + num2 + num3 + num4 + num5 / 5);
        return "Hola, el producto es: " + product + "\n"
                + " la suma es: " + suma + "\n"
                + " el promedio es: " + promedio;
    }

    public int addition3 (int num11, int num22){
        int i;
        int suma1= 0;
        for (i = num11; i < num22; i++){
                num11 = num11+1;
                suma1 = suma1+num11;
        }
        return suma1;
    }
}