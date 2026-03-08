package com.promit.wordchecker;
import java.util.ArrayList;
public class WordChecker
{
/** Initialized in the constructor and contains no null elements */
private static ArrayList<String> wordList;

public static void main(String args[])
{
    wordList = new ArrayList<String>();
    wordList.add("catch");
    wordList.add("bobcat");
    wordList.add("catchacat");
    wordList.add("cat");
    wordList.add("at");
    
    ArrayList<String > test = createList("cat");

    for (String string : test) {
        System.out.println("Output from function"+ string);
    }
}
/**
* Returns true if each element of wordList (except the first) contains the previous
* element as a substring and returns false otherwise, as described in part (a)
* Precondition: wordList contains at least two elements.
* Postcondition: wordList is unchanged.
*/
public static boolean isWordChain()
{ 
    for (int i = 0; i < wordList.size(); i++) {
        if (i > 0) {
            if (!(wordList.get(i)).contains(wordList.get(i-1))) {
            return false;
            }
        }
    }
    return true;
}
/**
* Returns an ArrayList<String> based on strings from wordList that start
* with target, as described in part (b). Each element of the returned ArrayList has had
* the initial occurrence of target removed.
* Postconditions: wordList is unchanged.
* Items appear in the returned list in the same order as they appear in wordList.
*/
public static ArrayList<String> createList(String target) {
 
   ArrayList<String> temp = new ArrayList<String>();
   for (String word : wordList) {
      if (word.startsWith(target)) {
        int index = word.indexOf(target);
        String subString = word.substring(index+target.length());
         temp.add (subString);
      }
   }
   return temp;
  }
}