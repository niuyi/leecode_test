package test.leecode;

/**
 * Created by xiaomi on 2019/10/28.
 */
public class test_5 {

    public static final String  longestSub(String str){
        char[] chars = str.toCharArray();
        int max = 0;
        int start = 0;
        int end = 0;

        for(int i = 0 ; i < chars.length; i++){
            for(int j = i + 1 ; j < chars.length ; j++){
                if(isLoop(chars, i, j)){
                    if(j -i > max){
                        max = (j - i);
                        start = i;
                        end = j;
                    }
                }
            }
        }

        return str.substring(start, end + 1);
    }

    private static boolean isLoop(char[] chars, int i, int j) {
        while(i < j){
            if(chars[i++] != chars[j--]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestSub("babad"));
        System.out.println(longestSub("cbbd"));
    }
}
