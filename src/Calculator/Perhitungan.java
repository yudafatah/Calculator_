/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author Nine
 */
import java.util.Scanner;
public class Perhitungan{
    public static long faktorial(long x){
    if(x==0) return(1);
    else
        return(x*faktorial(x-1));
    }
    
    public static void main(String[]args){
        Scanner baca = new Scanner(System.in);
        int masuk;
        do{
            System.out.println("PROGRAM PERMUTASI DAN KOMBINASI");
            System.out.println("===============================");
            System.out.println("1. Permutasi");
            System.out.println("2. Kombinasi");
            System.out.println("3. Faktorial");
            System.out.println("4. Perkalian");
            System.out.println("5. Perpangkatan");
            System.out.println("6. Exit");
            System.out.print("Masukkan Pilihan 1-6 => ");
            masuk = baca.nextInt();
            switch(masuk){
                case 1:
                    permutasi();
                    break;
                case 2:
                    kombinasi();
                    break;
                case 3:
                    faktorial();
                    break;
                case 4:
                    perkalian();
                    break;
                case 5:
                    pangkat();
                    break;
            }
        }while(masuk!=6);
    }
    
    public static void permutasi(){
        Scanner baca = new Scanner(System.in);
        long min, n, r, hasil;

        System.out.print("Masukkan nilai n : ");
        n = baca.nextInt();
        System.out.print("Masukkan nilai r : ");
        r = baca.nextInt();
        
        min = n-r;
        n = faktorial(n);
        min = faktorial(min);
        hasil = n/min;
        
        System.out.println("nPr = n!/(n-r)! = "+hasil);
    }
    
    public static void kombinasi(){
        Scanner baca = new Scanner(System.in);
        long min, n, r, hasil;
        
        System.out.print("Masukkan Nilai n => ");
        n = baca.nextInt();
        System.out.print("Masukkan Nilai r => ");
        r = baca.nextInt();
        
        min = n-r;
        n = faktorial(n);
        r = faktorial(r);
        min = faktorial(min);
        hasil = n/(min*r);
        
        System.out.println("nCr = n!/ (n-r)! x r! = "+hasil);
        System.out.println("Hasil kombinasinya adalah = "+hasil);
    }
    
    public static void faktorial(){
        Scanner baca = new Scanner(System.in);
        long i, fak, angka;
        
        System.out.print("Masukkan angka faktorial => ");
        angka = baca.nextInt();
        
        fak=1;
        
        for(i=1;i<=angka;i++){
            fak=fak*i;
        }
        System.out.println("Hasil dari "+angka+"! = "+fak);
    }
    
    public static void perkalian(){
        Scanner baca = new Scanner(System.in);
        long a , b, hasil;
        
        System.out.print("Masukkan angka pertama => ");
        a = baca.nextInt();
        System.out.print("Masukkan angka pertama => ");
        b = baca.nextInt();
        
        hasil = a*b;
        
        System.out.println("Hasil dari "+a+" x "+b+" adalah "+hasil);
    }
    
    public static void pangkat(){
        Scanner baca = new Scanner(System.in);
        long a , b, hasil;
        
        System.out.print("Masukkan angka pertama => ");
        a = baca.nextInt();
        System.out.print("Masukkan angka pangkat => ");
        b = baca.nextInt();
        
        hasil = 1;
        int i = 1;
                
        while(i<=b){
            hasil = hasil*a;
            i++;
        }
        System.out.println(a+" ^ "+b+" = "+hasil);
    }
}