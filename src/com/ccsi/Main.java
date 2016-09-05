package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int n=16;
        System.out.println(isPowerOfFour(n));
    }
    //Given an integer(signed 32 bits),write a function to check whether ita power of 4
    public static boolean isPowerOfFour(int num){
       while(num!=0){
            if(num==1) return true;
            if((num&3)!=0)return false;     //判断余数是否为零。
            num>>>=2;
        }
        return false;
    }
}
