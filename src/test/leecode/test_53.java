package test.leecode;

/**
     给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

     示例:

     输入: [-2,1,-3,4,-1,2,1,-5,4],
     输出: 6
     解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     进阶:

     如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。

 */
public class test_53 {

    public static final int findMax(int[] array){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i : array){
            if(sum > 0){
                sum += i;
            }else{
                sum = i;
            }

            max = Math.max(max, sum);
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
