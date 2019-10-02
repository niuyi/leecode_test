package test.leecode;
/*
    实现 strStr() 函数。

    给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

    示例 1:

    输入: haystack = "hello", needle = "ll"
    输出: 2
    示例 2:

    输入: haystack = "aaaaa", needle = "bba"
    输出: -1
    说明:

    当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

    对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。

*/


public class test_28 {

    public static final int strStr(String source, String needle){

        if(source == null || needle == null || source.length() < needle.length()){
            return -1;
        }

        int sourceLength = source.length();
        int needleLength = needle.length();

        int sourceIndex = 0;

        for(int i = 0 ; i < sourceLength - needleLength ; i++){
            sourceIndex = i;
            boolean find = true;
            for(int j = 0 ; j < needleLength ; j++){
                if(source.charAt(sourceIndex + j) != needle.charAt(j)){
                    find = false;
                    break;
                }
            }

            if(find){
                return sourceIndex;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int ret = strStr("hello", "ll");
        System.out.println(ret);

        System.out.println("hello".indexOf(""));

    }
}
