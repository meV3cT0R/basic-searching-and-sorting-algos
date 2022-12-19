package com.vector.sorting;

import java.security.SecureRandom;

public class SelectionSortTest {
    public static void selectionSort(int[] datas) {
        int temp =0;
        
        for(int i=0;i<datas.length-1;i++) {
            int min =i;
            for(int j=i+1; j< datas.length;j++) {
                if(datas[j] < datas[min]) min = j;
            }
            temp= datas[i];
            datas[i]= datas[min];
            datas[min] = temp;
        }
    }
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] datas = new int[10];
        for(int i=0;i<10;i++) 
            datas[i]= 10+ random.nextInt(120);
        selectionSort(datas);
        for(int data : datas)
            System.out.println(data);
    }
}