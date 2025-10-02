package com.demo;

import java.util.HashMap;
import java.util.Scanner;

public class Encoder {

    public static void main(String[] args){
//        HashMap<Character,Integer> mapper=new HashMap<Character,Integer>();
//        mapper.put('A',65);
//        mapper.put('B',66);
//        just realized how dumb this approach is, as we can just typecast characters into
//        integers
//        for(int i=65;i<=90;i++){
//            System.out.println((char)i);
//        }
//        for(int i=97;i<=122;i++){
//            System.out.println((char)i);
//        }
        String encodedValue="";
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        System.out.println(input);
        //converting the input string to uppercase , as it will be easy to
        //parse the string while decoding, as all the ASCII values of A-Z
        //are 2 digits, contrary to a-z
        for(int i=0;i<input.toUpperCase().length();i++){
            encodedValue=encodedValue+(int)input.charAt(i);
        }
        System.out.println(encodedValue);

        String decodedValue="";
        for(int i=0;i<encodedValue.length();i+=2){
            String singleAlphabet=encodedValue.substring(i,i+2);
            decodedValue=decodedValue+(char)Integer.parseInt(singleAlphabet);
        }
        System.out.println(decodedValue);
    }
}
