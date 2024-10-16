package org.practice.leetcode.difficulty.easy;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String[] strArray = Integer.toString(x).split("");
        int length = strArray.length;
        for(int i=0; i< (length/2) ; i++){
            if(!strArray[i].equals(strArray[length-1-i])){
                return false;
            }
        }
        return true;
    }
}
