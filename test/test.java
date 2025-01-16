package test;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String input = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
        String[] split = input.split(",");
        System.out.println(Arrays.toString(split));
    }
}

