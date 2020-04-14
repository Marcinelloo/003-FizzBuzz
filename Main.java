package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i=1; i<101; i++){
            String result = "";
            if(i%15==0){
                result = "FizzBuzz";
            }
            else if(i%5==0){
                result = "Buzz";
            }
            else if(i%3==0){
                result = "Fizz";
            }
            System.out.println(i+" "+result);
        }
    }
}
