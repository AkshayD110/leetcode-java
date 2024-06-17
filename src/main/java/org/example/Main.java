package org.example;


public class Main {
    public static void main(String[] args) {

        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int output=containerWithMostWater.maxAreaTwoPointer(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(output);
    }
}