package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void  main(String[]args){
        int T;
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Suhu (Der. C) = ");

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        if(T < 0){
            System.out.println("Wujud Air Beku "+T);
        }else if( (0<= T) && (T <= 100)){
            System.out.println("Wujud Air Cair "+T);
        }else if(T > 0){
            System.out.println("Wujud Air Uap/Gas "+T);
        }
    }
}
