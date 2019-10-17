package test.leecode;

/**
 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

 说明:

 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 示例:

 输入:
 nums1 = [1,2,3,0,0,0], m = 3
 nums2 = [2,5,6],       n = 3

 输出: [1,2,2,3,5,6]

 */
public class test_88 {

    public static final void merge(int[] num1, int m, int[] num2, int n){
        int total = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while(total >= 0 && i >= 0 && j >= 0){
            if(num1[i] > num2[j]){
                num1[total] = num1[i];
                i--;
            }else{
                num1[total] = num2[j];
                j--;
            }

            total--;
        }

        if(j >= 0){
            for(int k = 0 ; k <= j ;k++){
                num1[k] = num2[k];
            }
        }
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{11,12,100,0,0,0};
        int[] num2 = new int[]{2,5,6};
        merge(num1, 3, num2, 3);

        for(int i : num1){
            System.out.print(i + ",");
        }
    }
}
