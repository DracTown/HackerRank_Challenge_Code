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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     My Code Solution
     */

    public static String timeConversion(String s) {
    // Write your code here
    String results="";
    String AMresults="";
    int time=Integer.valueOf(s.substring(0,2));
    String tZone=s.substring(s.length()-2,s.length());
    if(tZone.equals("PM")){
      if(time!=12){
          time+=12;
            results=String.valueOf(time)+s.substring(2,s.length()-2);
        } else{
            results=String.valueOf(time)+s.substring(2,s.length()-2);   
        } 
    }else if(tZone.equals("AM")&&time!=12){
      if(time<10){
             results="0"+String.valueOf(time)+s.substring(2,s.length()-2);       
       }else{
             results=String.valueOf(time)+s.substring(2,s.length()-2);         
       }    
    }else if(tZone.equals("AM")&&time==12){
            time=0;
            results="0"+String.valueOf(time)+s.substring(2,s.length()-2);    
    }
     return results; 
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
