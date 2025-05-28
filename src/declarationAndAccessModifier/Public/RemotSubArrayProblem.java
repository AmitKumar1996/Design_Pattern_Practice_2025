// Given a sequence of numbers, give me the longest ascending contiguous subarray.
// In the array {11,21,2,6,3,5,6,8,13}, the result should be {3,5,6,8,13}
package declarationAndAccessModifier;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
   // ArrayList<String> strings = new ArrayList<String>();
    // strings.add("Hello, World!");
    // strings.add("Welcome to CoderPad.");
    // strings.add("This pad is running Java " + Runtime.version().feature());

    // for (String string : strings) {
    //   System.out.println(string);
    // }

       int[] A={11,21,2,6,3,5,6,8,13};

       int n=A.length;
       int start=0;
       int end=0;
      //  int mstart=0;

      //  int mend=0;
       int curLength=1;
       int maxLength=1;
       

       for(int i=1;i<n;i++){
        

        if(A[i-1]<A[i] ){ // 11 21 
          curLength++;
        }
        else{

          curLength=1;
          start=i;




        }
        if(maxLength<curLength){
          maxLength=curLength;
        }



       }

      // System.out.print(maxLength);  // 5
// {11,21,2,6,3,5,6,8,13}


//int[] ans={maxLength};

      for(int i=start;i<start+maxLength;i++){
       
        
       System.out.print(A[i]+" "); 


        

      }



  }
}
