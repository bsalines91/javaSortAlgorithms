package javaapplication5;
import java.util.*;
/**
 * Bubble Sort
 *
 * @author  Brandon Salines
 * @version 1
 */


public class BubbleSort
{   public static void main(String[] args){
      int size = 10000;
      int [] array = new int [size];
      Random rand = new Random();
      
      //Add items to array
      for (int i = 0; i < array.length; i ++){
          array[i] = rand.nextInt(100) + 1;
        }
      
   
        
      bubbleSort(array);   
   }
   
   public static void bubbleSort (int a []) {
       int numPair = a.length;
       boolean swapped = true;
       int toSwap = 0;
       int iterations = 1;
       while (swapped){
           numPair = numPair -1;
           swapped = false;
           
           for (int i = 0; i < numPair; i++){
               if (a[i] > a [i+1]){
                   swapped = true;
                   toSwap = a[i];
                   a[i] = a[i+1];
                   a[i+1] = toSwap;
                }
            }
        
           
           iterations = iterations +1;
           
      }
   }

}
