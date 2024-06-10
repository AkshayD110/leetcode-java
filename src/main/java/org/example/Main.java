package org.example;


public class Main {
    public static void main(String[] args) {

        RemoveElement removeElement = new RemoveElement();
        int output = removeElement.removeElement(new int[]{3,2,2,3}, 2);
        System.out.println(output);
    }
}