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
     * Complete the 'maxTrailing' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int lsum(int a,List<Integer> arr){
        int[] ar=new int[arr.size()];
        for(int i=0;i<a;i++){
            if(arr.get(a)>arr.get(i)){
                ar[i]=arr.get(a)-arr.get(i);
            }
        }
        Arrays.sort(ar);
        return(ar[(ar.length)-1]);
    }
    public static int maxTrailing(List<Integer> arr) {
    // Write your code here
    int[] ar1=new int[arr.size()];
    for(int j=1;j<arr.size();j++){
        ar1[j]=lsum(j, arr);
    }
    //int max = Collections.max(Arrays.asList(avr)); 
    int gel=0;
    Arrays.sort(ar1);
    gel=ar1[(ar1.length)-1];
    if(gel==0){
        return -1;
    }
    else{
        return gel;
    }
    }

    }

public class Solution {