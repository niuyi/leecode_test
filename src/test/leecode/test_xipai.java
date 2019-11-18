package test.leecode;

import java.util.Random;

/**
 * Created by xiaomi on 2019/10/31.
 */
public class test_xipai {

    public static final void random(int[] array){
        int size = array.length;

        for(int i = 0 ; i < size ; i++){
            int index = new Random().nextInt(size);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        for(int i : array){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        random(array);
    }
}
