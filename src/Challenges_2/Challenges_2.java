package Challenges_2;

import java.util.Scanner;

public class Challenges_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int i = scan.nextInt();

        System.out.print("Informe um número decimal: ");
        double d = scan.nextDouble();
        scan.nextLine();

        System.out.print("Informe uma Frase: ");
        String s = scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
