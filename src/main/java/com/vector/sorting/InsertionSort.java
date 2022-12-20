package com.vector.sorting;

import java.security.SecureRandom;

public class InsertionSort {
    public static void insertionSort(int[] datas) {
        for(int i=1;i < datas.length;i++) {
            int key = datas[i];
            int j = i-1;
            while(j>=0 && datas[j] > key) {    
                datas[j+1] =  datas[j];
                j-=1;
            }
            datas[j+1] = key;
        }        
    }
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] datas = new int[10];
        for(int i=0;i<10;i++) 
            datas[i]= 10+ random.nextInt(120);

        
        for(int data : datas)
            System.out.printf("%d ",data);
        System.out.println();
        insertionSort(datas);
        System.out.println();
        for(int data : datas)
            System.out.printf("%d ",data);
            
    }
}

