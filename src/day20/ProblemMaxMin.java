package day20;

import java.util.Scanner;

public class ProblemMaxMin {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int max=0;
            int min=0;

            int [] sayilar = new int[10];

            for(int i = 0; i < 10; i++)
            {
                System.out.print((i+1) + ". sayıyı giriniz: ");
                sayilar[i] = input.nextInt();
                if(i == 0) {
                    max = sayilar[i];
                    min = sayilar[i];
                }
                if(sayilar[i] > max) {
                    max = sayilar[i];
                }
                if(sayilar[i] < min) {
                    min = sayilar[i];
                }
            }
            System.out.println("En büyüyk sayı = " +max);
            System.out.println("En küçük sayı = " + min);
        }
    }

