/**
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 * For num = 5 you should return [0,1,1,2,1,2].
 * 作者： fengsehng
 * 链接：http://www.imooc.com/article/11287
 * 来源：慕课网
 * 本文原创发布于慕课网 ，转载请注明出处，谢谢合作！
 */
public class _02_CountingBits {
    public static void main(String[] args) {
        int num = 7;
        System.out.println("num:" + num);
        int[] count = countBits(num);
        for (int i = 0; i < count.length ; i++) {
            if (i == 0){
                System.out.print("[" + count[i]);
            } else {
                System.out.print(", " + count[i]);
            }
            if (i == count.length -1){
                System.out.println("]");
            }
        }
    }
            // num:7
            // [0, 1, 1, 2, 1, 2, 2, 3]
            //  0, 1, 2, 3, 4, 5, 6, 7
            //          2+1,  4+1,4+2,4+3
    public static int[] countBits(int num) {
        int[] res = new int[num + 1];
        int pow2 = 1, before = 1;
        for (int i = 1; i <= num; i++) {
            if (i == pow2) {
                before = res[i] = 1;
                pow2 <<= 1;// << 左移运算, *2
            } else {
                res[i] = res[before] + 1;
                before += 1;
            }
        }
        return res;
    }

}
