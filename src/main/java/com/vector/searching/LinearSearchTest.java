package com.vector.searching;

import java.security.SecureRandom;
import java.util.Scanner;

public class LinearSearchTest {
    public static int linearSearch(int[] data,int searchKey) {
        for(int i =0;i<data.length;i++) {
            if(data[i]==searchKey)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] datas = new int[10];
        for(int i=0;i<10;i++) 
            datas[i]= 10+ random.nextInt(120);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("[ ");
        for(int data : datas)
            System.out.printf("%d ",data);
        System.out.printf("]");
        
        System.out.println();
        System.out.print("Enter a number to search:");
        int searchKey = scanner.nextInt();

        System.out.println("Index of key : " + linearSearch(datas, searchKey));
        scanner.close();
    }
}
