package Challenges_6;

import java.io.*;
import java.util.Scanner;

public class challenges_6 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++)
        {
            int result=n*i;
            System.out.println(n+" x "+i+" = "+result);
        }
    }

}
