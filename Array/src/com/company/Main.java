package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("inserisci il numero di numeri del primo array: ");
        int n = a.nextInt();
	    int array[];
        array = new int [n];
        for(int i = 0; i < n; i++){
            System.out.println("inserisci il "+(i+1) +" numero: ");
            array[i] = a.nextInt();
        }
        for(int j = 0; j < array.length; j++){
            System.out.println("posizione : "+(j+1)+ " = "+array[j]);
        }
        ruotaAvanti(array);
        System.out.println("Array ruotato a destra di 1");
        for(int y = 0; y < array.length; y++){
            System.out.println("posizione : "+(y+1)+ " = "+array[y]);
        }
        scambiaMeta(array);
        System.out.println("\nSCAMBIA META': ");
        for(int q = 0; q < array.length; q++){
            System.out.println("posizione : "+(q+1)+ " = "+array[q]);
        }
        System.out.println("\ninserisci il numero di numeri del secondo array: ");
        int x = a.nextInt();
        int array1[];
        array1 = new int [x];
        for(int e = 0; e < x; e++){
            System.out.println("inserisci il "+(e+1) +" numero: ");
            array1[e] = a.nextInt();
        }
        for(int w = 0; w < array1.length; w++){
            System.out.println("posizione : "+(w+1)+ " = "+array1[w]);
        }
        int array2[];
        array2 = new int[n+x];
        array2 = concatenaArray(array, array1);
        System.out.println("\nCONCATENAZIONE DEI 2 ARRAY");
        for(int z = 0; z < array2.length; z++){
            System.out.println("posizione : "+(z+1)+ " = "+array2[z]);
        }
    }

    public static void ruotaAvanti(int[] array) {
        int vet = array[array.length-1];
        for(int i = array.length-1; i>0; i--){
            array[i] = array[i-1];
        }
        array[0] = vet;
    }

    public static void scambiaMeta(int[] array){
        int n = array.length/2;
        int j = array.length-n;
        for (int i = 0; i < n; i++) {

            int t = array[i];
            array[i] = array[j];
            array[j] = t;
            j++;
        }
    }

    public static int[] concatenaArray(int[] array1, int[] array2){
        int array[];
        array = new int [array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            array[i] = array1[i];
        }
        int y = 0;
        for(int j = array1.length; j < array.length; j++){
            array[j] = array2[y];
            y++;
        }
        return array;
    }
}
