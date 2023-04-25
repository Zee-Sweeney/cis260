import java.util.Scanner;
import java.lang.Math;
import java.util.*;
import java.util.Arrays;
public class ERA {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    int size;
    System.out.println("How long do you want array 1 to be?");
    size = num.nextInt();
    int[] arr1= new int [size];
    for (int i = 0; i < arr1.length; i++) {
         arr1[i] = (int)(Math.random()*100+1); 
         System.out.print(arr1[i] + " "); 
       }     
    System.out.println("\nHow long do you want array 2 to be?");
    size = num.nextInt();
    int[] arr2= new int [size];
    for (int i = 0; i < arr2.length; i++) {
         arr2[i] = (int)(Math.random()*100+1); 
         System.out.print(arr2[i] + " "); 
       }  
       
  sort objSort = new sort();
  objSort.minToMax(arr1);
  System.out.println("\nSorted array 1: " + arr1);


    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}