ppackage com.ccsi;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour3(16));
    }
    public static boolean isPowerOfFour1(int num){
        if(num<0)return false;
        while(num%4==0)num/=4;
        return num==1;
    }
    public static boolean isPowerOfFour2(int num){
        if(num<0)return false;
        while((num&3)==0)num>>>=2;
        return num==1;
    }
    //powerOfTwo的衍生，4的n次方，1出现的位置是1，3，5，7....;也是对......01010101取与不会等于0；
    public static boolean isPowerOfFour3(int num){
        if(num<0)return false;
        return (num&(num-1))==0&&((num&0x55555555)!=0);
    }
}
