package com.promit.WordSearch;

import java.util.ArrayList;

public class WordSearch {

    private int rows;

    private int columns;

    private String grid[][];

    private ArrayList<String> wordList;

    public WordSearch(int rows, int columns)
    {
        grid = new String[rows][columns];
        wordList= new ArrayList<String>();
    }

    public WordSearch()
    {
        grid = new String[10][10];
        wordList= new ArrayList<String>();
    }

    public boolean setWordHorizontally(int row, int column, String word)
    {
        if(word == null)
            return false;
        
        char[] characters = word.toCharArray();

        if((grid[row].length -(column -1))> word.length())
        {
            for (int i = 0; i <= row ; i++) {
                if (i == row)
                {
                for (int j = 0; j <=column ; j++) {
                    if( j == column){
                        for (int n = 0 ; n < characters.length ; n++)
                        {
                            System.out.println("Inserting the value " + String.valueOf(characters[n]) + "at row " + i +"and column" + j);
                            grid[i][j] = String.valueOf(characters[n]);
                            j ++;    
                        }                            
                    }
                }
                }
              
            }
            wordList.add(word);
            return true;
        }
        else{
            return false;
        }
   }

   public void printArray()
   {
        
    StringBuffer buffer = new StringBuffer();
    for (int i = 0; i < grid.length; i++) {
            buffer = new StringBuffer();
            for (int j = 0; j < grid[i].length; j++) {
                buffer.append(grid [i][j]).append(" " ); 
            }
            System.out.println(buffer.toString());
            
        }
   }

   public void fillBlanks()
   {
        
    for (int i = 0; i < grid.length; i++) {
           
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = "*";
            }
    
            
        }
   }


   

    public ArrayList<String> getWordList()
    {
        return wordList;
    }



    
}
