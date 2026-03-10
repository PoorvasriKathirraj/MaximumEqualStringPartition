//package com.stringprobelm;

//import java.util.Scanner;

package com.stringprobelm;

import java.util.Scanner;

public class MaxPiecesString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.next();

        int[] count = new int[26];

   
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            count[c - 'a']++;
        }

        int ans = 0;
        for(int i = 0; i < 26; i++){
            if(count[i] > 0){
                if(ans == 0)
                    ans = count[i];
                else
                    ans = gcd(ans, count[i]);
            }
        }

        System.out.println("Maximum pieces: " + ans);

    }

    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}