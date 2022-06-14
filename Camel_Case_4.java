import java.io.*;
import java.util.*;

public class Solution {
/*
Solution
     S=Split     Camel case method-> to Normal
     C=Combine   Normal words -> Camel Case 
     M=Method
     C=Class
     V=Variable
*/
    public static void main(String[] args) throws NoSuchElementException  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner input= new Scanner(System.in);
       while(input.hasNext()){
               String inputString=input.nextLine();
           //S Split
           if(inputString.substring(0,1).equals("S")){                
                System.out.println(typeS(inputString)); 
           //Combine    
           }else{  
               System.out.println(typeC(inputString));         
           }
       }
    }         
    public static String typeS(String word){
         ArrayList<Character> charList = new ArrayList<>();
           char[] upperLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
           'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
           int listIndex=0;
           int index=0; 
           String results="";
           String submit="";
           char[] letters=word.toCharArray();
           ArrayList<Integer> indexHold=new ArrayList<>();
            for(char a:letters){   
                 for(char b:upperLetters){   
                      if(a == b && index > 2){
                          indexHold.add(index);
                          charList.add(index+listIndex,' ');
                          listIndex++;
                       }
                   }index++;
                   charList.add(Character.toLowerCase(a));
                }           
            for(char a: charList){
                       results+=a;
                  }
            if(word.substring(2,3).equals("M")){
                  submit=results.substring(4,results.length()-2).trim();
                }else if(word.substring(2,3).equals("C")){
                  submit=results.substring(5,results.length()).trim();
                }else{
                  submit=results.substring(4,results.length()).trim();
                } 
                return submit;
    }
    public static String typeC(String word){
         ArrayList<Character> charList = new ArrayList<>();
           int index=0; 
           int temp=0;
           String results="";
           String submit="";
           char[] letters=word.toCharArray();
           ArrayList<Integer> indexHold=new ArrayList<>();
            for(char a:letters){       
              if(a == ' '){
                 temp++;
                  if(temp>1){
                    indexHold.add(index-(temp-1));
                  }else{
                    indexHold.add(index);
                       }  
              }else{
                  charList.add(a);
                } index++; 
            }index=0;
                for(char b:letters){  
                  index++;
                  for(int c :indexHold){  
                     if(c==index){
                         charList.set(index,Character.toUpperCase(charList.get(c)));  
                        }
                   }                  
                } 
                  if(word.substring(2,3).equals("C")){
                         charList.set(4,Character.toUpperCase(charList.get(4)));  
                    }        
                 for(char a: charList){                  
                        results+=a;   
                    }
                  if(word.substring(2,3).equals("M")){
                      results+="()";
                    }    
                submit=results.substring(4,results.length()).trim();        
        return submit;
    }

    
}
