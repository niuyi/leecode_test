package test.leecode;

/**
 * Created by xiaomi on 2019/10/28.
 */
public class test_33 {

    public static final int search(int[] array, int start, int end, int target){
        if(end == start)
            return array[start] == target ? start : -1;

        int mid = start + (end - start)/2;
        if(array[mid] == target){
            return mid;
        }

        if(target < array[mid]){
            return search(array, start, mid - 1, target);
        }else{
            return search(array, mid + 1, end, target);
        }

    }

    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,4,5,6,7};
        System.out.println(search(array, 0, array.length, 5));
        System.out.println(search(array, 0, array.length, 7));
        System.out.println(search(array, 0, array.length, 0));
        System.out.println(search(array, 0, array.length, 3));
    }
}
