package test.leecode;

import java.util.HashSet;

/**
 * Created by xiaomi on 2019/10/28.
 */
public class test_2 {

    public static final int longestSub(String str){
        char[] chars = str.toCharArray();
        int max = 0;

        for(int i = 0 ; i < chars.length; i++){
            for(int j = i + 1 ; j <= chars.length ; j++){
                if(allUnique(chars, i, j)){
                    max = Math.max(j - i, max);
                }
            }
        }

        return max;
    }

    public static final boolean allUnique(char[] array, int start, int end){

        HashSet<Character> sets = new HashSet<>();

        while(start < end){
            char c = array[start];
            if(sets.contains(c)){
                return false;
            }

            sets.add(c);
            start++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestSub("abcabcbb"));
        System.out.println(longestSub("bbbbbb"));
        System.out.println(longestSub("pwwkew"));
        System.out.println(longestSub("abcd"));
    }
}
