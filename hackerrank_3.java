import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'isPower' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    static boolean isPowerOfTwo(int n) 
{ 
    if(n==0) 
    return false; 
  
return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
       (int)(Math.floor(((Math.log(n) / Math.log(2))))); 
} 

    public static List<Integer> isPower(List<Integer> arr) {
    // Write your code here
    //int[] avr=new int[arr.size()];
    List<Integer> lit=new ArrayList<Integer>();
    for(int ij=0;ij<arr.size();ij++){
        int el=arr.get(ij);
        if(isPowerOfTwo(el)){
            //avr[ij]=1;
            lit.add(1);
        }
        else{
            //avr[ij]=0;
            lit.add(0);
        }
    }
    return lit;
    }

}

public class Solution {