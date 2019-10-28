package test.leecode;

/**
 * Created by xiaomi on 2019/10/28.
 */
public class test_temp {
    public static final boolean test(String str){

        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (i < j){
            if(chars[i++] != chars[j--])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(test("abc"));
        System.out.println(test("abccba"));
    }
}
