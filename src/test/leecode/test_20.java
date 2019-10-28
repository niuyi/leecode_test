package test.leecode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by xiaomi on 2019/10/28.
 */
public class test_20 {

    public static final boolean test(String str){
        Deque<String> deque = new ArrayDeque<String>();

        for(char c : str.toCharArray()){
            String s = String.valueOf(c);
            if("([{".contains(s)){
                deque.push(s);
            }else{
                if(deque.size() == 0){
                    return false;
                }

                String last = deque.pop();

                if(
                        (s.equalsIgnoreCase(")") && last.equalsIgnoreCase("("))
                        || (s.equalsIgnoreCase("]") && last.equalsIgnoreCase("["))
                        || (s.equalsIgnoreCase("}") && last.equalsIgnoreCase("{"))){
                            continue;
                }else{
                            return  false;
                }
            }
        }

        return true;

    }


    public static void main(String[] args) {
        System.out.println(test("()"));
        System.out.println(test("()[]{}"));
        System.out.println(test("(]"));
        System.out.println(test("([}]"));
        System.out.println(test("([])"));
    }
}
