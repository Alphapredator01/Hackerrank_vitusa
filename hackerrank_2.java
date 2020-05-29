import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'balancedSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int leftsum(int a,List<Integer> arr){
        int lsum=0;
        for(int el=0;el<a;el++){
            lsum+=arr.get(el);
        }
        return lsum;
    }
    public static int rightsum(int a,List<Integer> arr){
        int rsum=0;
        for(int er=a+1;er<arr.size();er++){
            rsum+=arr.get(er);
        }
        return rsum;
    }
    public static int balancedSum(List<Integer> arr) {
    // Write your code here
        int l=0;
        int r=0;
        int fin=0;
        for(int ij=0;ij<arr.size();ij++){
            l=rightsum(ij, arr);
            r=leftsum(ij, arr);
            if(l==r){
                fin=ij;
                break;
            }
        }
        return fin;
    }

}
public class Solution {