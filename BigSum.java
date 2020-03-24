/*
    Sum big Numbers with arrays
*/


import java.util.Scanner;

public class BigSum {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su primer numero");
        String num1 = read.next();
        System.out.println("Ingrese su primer numero");
        String num2 = read.next();
        int tamaño;
        String num1Dividido[], num2Dividido[], numsSumados[];
        if (num1.length() >= num2.length()) {
            tamaño = num1.length() / 4;
        } else {
            tamaño = num1.length() / 4;
        }
        num1Dividido = Almacenar(num1, tamaño);
        num2Dividido = Almacenar(num2, tamaño);
        numsSumados = sumar(num1Dividido,num2Dividido,tamaño);
        for (int i = tamaño; i >= 0; i--) {
            if (numsSumados[i]!="0") {
                System.out.print(numsSumados[i]);
            }
        }
    }

    public static String[] Almacenar(String num, int t) {
        num.trim();
        String almacenado[] = new String[t];
        for (int i = 0; i < t; i++) {
            almacenado[i] = "";
        }
        int index = num.length() - 1;
        for (int i = 0; num.length() > 0; i++) {
            int cant = 0;
            while (num.length() > 0 && cant < 4) {
                almacenado[i] = num.substring(index) + almacenado[i];
                num = num.substring(0, index);
                cant += 1;
                index -= 1;
            }
        }
        return almacenado;
    }

    public static String[] sumar(String[] num1, String[] num2, int t) {
        String Nsumados[] = new String[t + 1];
        Nsumados[t] = "0";
        for (int i = 0; i < t; i++) {
            if (num1[i] != "") {
                Nsumados[i] = num1[i];
            } else {
                Nsumados[i] = "0";
            }
        }
        for (int i = 0; i < t; i++) {
            if (num2[i] != "") {
                int n1 = Integer.parseInt(num2[i]);
                int n2 = Integer.parseInt(Nsumados[i]);
                String sum = Integer.toString(n1+n2);
                if (sum.length()>4) {
                    Nsumados[i] = sum.substring(sum.length()-4);
                    int n3 = Integer.parseInt(Nsumados[i+1]);
                    int n4 = Integer.parseInt(sum.substring(0,sum.length()-4));
                    String sum2 = Integer.toString(n3+n4);
                    Nsumados[i+1] = sum2;
                }else{
                    Nsumados[i]=sum;
                }
            }
        }
        return Nsumados;
    }
}
