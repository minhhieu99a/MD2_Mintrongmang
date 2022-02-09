package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr ={4,5,9,15,31,2,1,8};
        int min =minValue(arr);
        System.out.println("The smallest element in the array is: " + min);
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min>array[i]){
                min=array[i];
            }
        }return min;
    }
}
