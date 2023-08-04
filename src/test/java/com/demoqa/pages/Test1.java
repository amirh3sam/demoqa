package com.demoqa.pages;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {


        System.out.println("-------------ReverseString---------------");

        String myString = "Hello Word";
        String reverseString = "";

        for (int i = myString.length()-1; i >= 0 ; i--) {
           char eachLetter =  myString.charAt(i);
                reverseString+=eachLetter;
        }
        System.out.println(reverseString);

        System.out.println("-------------ReverseString keep order words---------------");


        String myString2 = "Hello Word";

        String reverseString2 = "";
                                                         //chaWord[i].charAt(j)
        String [] chaWord = myString2.split(" "); // { hello,word}

        for (int i = 0; i <= chaWord.length-1; i++) {   // hello word

            for (int j = chaWord[i].length()-1; j >= 0 ; j--) {  // olleh drow

                   reverseString2 += chaWord[i].charAt(j);
            }
            reverseString2 += " ";
        }
        System.out.println(reverseString2.trim());



        System.out.println("----Reversed Sentences with Array---");

        String mySentence = "Hello everyone this is me";
        String reverse = "";

        String[] eachWord = mySentence.split(" ");

        for (int i = eachWord.length-1; i >= 0 ; i--) {

            reverse += eachWord[i] + " ";

        }
        reverse =  reverse.trim();
        System.out.println(reverse);

        System.out.println("--Reversed Sentences and words with Array---");

        String mySentence2 = "Hello everyone this is me";
        String reverse2 = "";

        String[] each = mySentence.split(" ");

        for (int i = each.length-1; i >= 0 ; i--) {
            for (int j = each[i].length()-1; j >= 0 ; j--)
                reverse2 += each[i].charAt(j) ;
                reverse2 += " ";
        }
        reverse2 =  reverse2.trim();
        System.out.println(reverse2);

        System.out.println("----------------Swap number");
        int a = 1;
        int b = 2;
        System.out.println("before swap " + a +" and " + b);
        int temp = 0;
        temp = a;//temp =1
        a = b;  // now a =2
        b = temp; // b =1
        System.out.println("after swap " +a + " and " + b);

        System.out.println("------------secondWay--------------");


        int c = 5;
        int d = 10;
        System.out.println("before swap " + c +" and " + d);
        //Num_1 = Num_1 + Num_2
        c = c + d; // c=15
        //Num_2 = Num_1 - Num_2
        d = c - d; // d =15 - 10 = 5;
        //Num_1 = Num_1 - Num_2
        c = c - d; //c=15-5 => c = 10

        System.out.println("after swap " +c + " and " + d);


        System.out.println("------------Palindrome--------------");
        String str = "madam";
        String strResult = "";// racecar

        for (int i = str.length() - 1; i >= 0; i--) {
                char ch = str.charAt(i);
                strResult += ch + "";
        }
        System.out.println(str.equals(strResult));


        System.out.println("-----Anagram--(Letter are same but word is differrnt -------");
        String str2 = "silent";  // s i l e n t
        String str3 = "listen";
        boolean include = false;

        if(str2.length() != str3.length()) {

                include = false;
        }else {
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                char char1 = str2.charAt(i);// s i l e n t
                char char2 = str3.charAt(j);// l i s t e n

                include = (char1 + "").equals(char2 + "");

                if (include) {
                    include = true;
                    break;
                }
            }
            }

        }
        System.out.println(include);

        System.out.println("---------------------find uniq---------- ");


        String  str5 = "AAAABCCCCESSSSSG";
        String result = "";

        for (int i = 0; i < str5.length(); i++) {

            char ch = str5.charAt(i);

            if(str5.indexOf(ch) == str5.lastIndexOf(ch)){
                result += ch+"" ;
            }
        }
        System.out.println(result);



        System.out.println("-------------remove the duplicate---------- ");


        String  str6 = "AAAEEABCCCCESSSSSG";

        String str7 = "";

        for (int i = 0; i < str6.length(); i++) {

            char eachChar =  str6.charAt(i);
            if(!(str7).contains(eachChar+"")){
                str7 += eachChar;

        }

        }

        System.out.println(str7);

        System.out.println("------------DIGIT/ALPHABET/SPECIAL---------");

                String randomNumber = "AVD@#$ASD3254BGDS";

                String  alphabet = "";
                String number ="";
                String specialCharacter = "";

        for (int i = 0; i <= randomNumber.length()-1; i++) {

            if(Character.isAlphabetic(randomNumber.charAt(i))){

                alphabet+=randomNumber.charAt(i) +"";

            } else if (Character.isDigit(randomNumber.charAt(i))) {

                number += randomNumber.charAt(i);

            }
            else if (!Character.isLetterOrDigit(randomNumber.charAt(i))){

                specialCharacter+=randomNumber.charAt(i) +"";

            }
        }
        System.out.println("specialCharacter = " + specialCharacter);
        System.out.println("number = " + number);
        System.out.println("alphabet = " + alphabet);


    }





}