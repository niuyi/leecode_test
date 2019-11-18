package test.leecode;

public class Rate {

    public static final int getTax(int count){
        if(count >= 960000){
            return (int)(count*0.45 - 181920);
        }else if(count >= 660000){
            return (int)(count*0.35 - 85920);
        }else if(count >= 420000){
            return (int)(count*0.3 - 52920);
        }else if(count >= 300000){
            return (int)(count*0.25 - 31920);
        }else if(count >= 144000){
            return (int)(count*0.2 - 16920);
        }else if(count >= 36000){
            return (int)(count*0.1 - 2520);
        }else{
            return (int)(count * 0.03);
        }
    }

    private static final int getIncome(int count){
        return (count - getTax(count));
    }

    public static void main(String[] args) {
        for(int i = 0 ; i < 20 ; i++){
            double up = 1 + i*0.05;
            getMax(up);
        }
    }

    private static void getMax(double up) {
        int total = (int)(2850000 * 0.9);

        int max = 0;
        int max_1 = 0;
        int max_2 = 0;
        int max_i = 0;

        for(int i = 1 ; i < total ; i++){
            int in1 = getIncome(i);
            int in2 = getIncome((int)((total - i)*up));

            if(in1 + in2 > max){
                max = (in1 + in2);
                max_1 = in1;
                max_2 = in2;
                max_i = i;
            }
        }

        System.out.println("################ up:" + up + "  #######################");
        System.out.println("max: " + max);
        System.out.println("max_i: " + max_i);

        System.out.println("max_1: " + max_1);
        System.out.println("max_2: " + max_2);
        System.out.println("#######################################");
    }
}