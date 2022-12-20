package com.vector.sorting;

import java.security.SecureRandom;

public class MergeSort {
    public static void mergeSort(int[] datas) {
        sort(datas,0,datas.length-1);
    }

    private static void sort(int[] datas,int low,int high) {
        if(high-low>=1) {
            int middle1 = (low+high)/2;
            int middle2 = middle1+1;

            sort(datas,low,middle1);
            sort(datas,middle2,high);

            merge(datas,low,middle1,middle2,high);
        }
    }

    private static void merge(int[] datas,int left,int middle1,int middle2,int right) {
        int leftIndex = left;
        int rightIndex = middle2;
        int combinedIndex = left;
        int[] combined = new int[datas.length];

        while(leftIndex <= middle1 && rightIndex <=right) {
            if(datas[leftIndex] >= datas[rightIndex])
                combined[combinedIndex++] = datas[rightIndex++];
            else
                combined[combinedIndex++] = datas[leftIndex++];
        }

        if(leftIndex == middle2)
            while(rightIndex <= right)
                combined[combinedIndex++] = datas[rightIndex++];
        else
            while(leftIndex <=middle1)
                combined[combinedIndex++] = datas[leftIndex++];
        
        for(int i=left;i<=right;i++) {

            datas[i] = combined[i];

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

        mergeSort(datas);
        System.out.println();
        for(int data : datas)
            System.out.printf("%d ",data);
    }
}
