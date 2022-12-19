package com.vector.searching;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
    public static int binarySearch(int[] datas,int key) {
        int low=0;
        int high = datas.length -1;
        int middle = (low+high)/2;

        while(high>=low) {

            if(datas[middle]==key)
                return middle;
            
            else if(key < datas[middle])
                high = middle-1;
            else 
                low = middle+1;
            
            middle = (low+high)/2;
        }

        return -1;
    }

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] datas = new int[10];
        for(int i=0;i<10;i++) 
            datas[i]= 10+ random.nextInt(120);

        Arrays.sort(datas);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("[ ");
        for(int data : datas)
            System.out.printf("%d ",data);
        System.out.printf("]");
        
        System.out.println();
        System.out.print("Enter a number to search:");
        int searchKey = scanner.nextInt();

        System.out.println("Index of key : " + binarySearch(datas, searchKey));
        scanner.close();
    }
}