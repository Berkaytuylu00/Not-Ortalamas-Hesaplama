package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik,fizik, tarih, turkce, kimya, muzik,ortalama;
        Scanner inputMat = new Scanner(System.in);
        //Matematik notunu hesaplar
        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik=inputMat.nextInt();
        //System.out.println("Matematik Notunuz : " + matematik);

        System.out.println("-------------------------");

        //Fizik notunu hesaplar
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik=inputMat.nextInt();
        //System.out.println("Fizik Notunuz : " + fizik);

        System.out.println("-------------------------");

        //Tarih notunu hesaplar
        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih=inputMat.nextInt();
        //System.out.println("Tarih Notunuz : " + tarih);

        System.out.println("-------------------------");

        //Türkçe notunu hesaplar
        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce=inputMat.nextInt();
        //System.out.println("turkce Notunuz : " + turkce);

        System.out.println("-------------------------");

        //Kimya notunu hesaplar
        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya=inputMat.nextInt();
        //System.out.println("Kimya Notunuz : " + kimya);

        System.out.println("-------------------------");

        //Müzik notunu hesaplar
        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik=inputMat.nextInt();
        //System.out.println("Müzik Notunuz : " + muzik);

        System.out.println("-------------------------");
        
        //Ortalamayı hesaplar
        ortalama =(matematik+fizik+kimya+tarih+turkce+muzik)/6;
        System.out.println("Not ortalamanız : " +ortalama);
    }
}
