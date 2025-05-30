package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com a medida dos lados do triângulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com a medida dos lados do triângulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.printf("Área do triângulo X: %.2f\n", x.area());
        System.out.printf("Área do triângulo Y: %.2f\n", y.area());

        if (x.area() > y.area()) {
            System.out.println("Triângulo X é maior que o triângulo Y");
        } else if (y.area() > x.area()) {
            System.out.println("Triângulo Y é maior que o triângulo X");
        } else {
            System.out.println("Os triângulos são iguais");
        }
    }
}