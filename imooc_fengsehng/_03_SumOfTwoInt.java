/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * 作者： fengsehng
 * 链接：http://www.imooc.com/article/11317
 * 来源：慕课网
 * 本文原创发布于慕课网 ，转载请注明出处，谢谢合作！
 */
public class _03_SumOfTwoInt {
    public static void main(String[] args) {
        int a = 3, b = 10;
        int sum1 = getSum1(a, b);
        int sum2 = getSum2(a, b);
        System.out.println("two integer:" + a + ", " + b);
        System.out.println("sum1:" + sum1);
        System.out.println("sum2:" + sum2);
    }
//    异或又被称其为“模2加法“
//    设置变量recipe模拟进位数字，模拟加法的实现过程
    public static int getSum1(int a, int b){
        int r = 0, c = 0, recipe = 1;
        while ((a | b | c) != 0) {
            if (((a ^ b ^ c) & 1) != 0)
                r += recipe;
            recipe <<= 1;
            c = (a & b | b & c | a & c) & 1;
            a >>>= 1;
            b >>>= 1;
        }
        return r;
    }

//    a ^ b,求得结果
//    a & b，求得进位
//    相加
    public static int getSum2(int a, int b){
        while (b != 0){
            int c = a & b; //carry
            a ^= b; //add
            b = c << 1;
        }
        return a;
    }
}
