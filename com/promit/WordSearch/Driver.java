package com.promit.WordSearch;

public class Driver {

    public static void main(String args[])
    {
        System.out.println("Hello");

        WordSearch testClass= new WordSearch(4,5);
        testClass.fillBlanks();

        System.out.println(testClass.setWordHorizontally(2, 1, "Hi")); 


        System.out.println(testClass.setWordHorizontally(3, 1, "tig")); 
        testClass.printArray();
    }
    
}
