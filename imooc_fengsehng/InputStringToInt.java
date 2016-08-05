/*
	Implement atoi to convert a string to an integer.
	作者： fengsehng
	链接：http://www.imooc.com/article/11283
	来源：慕课网
	本文原创发布于慕课网 ，转载请注明出处，谢谢合作！
*/
import java.util.Scanner;

public class InputStringToInt
{
	public static void main(String[] args)
	{
		System.out.println("plz input a Integer:");
		Scanner in = new Scanner(System.in);
		String inStr = in.nextLine();
		int outInt = Solution.myAtoi(inStr);
		System.out.println("String:\"" + inStr + "\" --> Int:" + outInt);
	}
	public static class Solution {
		public static int myAtoi(String str) {
			//首先判断空值
			if(str == null){
				return 0;
			}
			//去掉空格的情况
			str = str.trim();
			if(str.length() == 0){
				return 0;
			}
			int sign = 1;
			int index = 0;
			if(str.charAt(index) == '+'){
				index++;
			}else if(str.charAt(index) == '-'){
				index++;
				sign = -1;
			}
			//取得数字部分，遇到溢出和非数字退出
			long number = 0;
			//System.out.println("---index:string---");
			for(;index < str.length();index++){
				if(str.charAt(index) < '0' || str.charAt(index) > '9'){
					break;
				}
				//System.out.println(index + ":" + str.charAt(index));
				number = number *10 + (str.charAt(index) - '0');
				//System.out.println("number:" + number);
				if(number >= Integer.MAX_VALUE){
					break;
				}
			}
			if(number * sign >= Integer.MAX_VALUE){
				return Integer.MAX_VALUE;
			}
			if(number * sign <= Integer.MIN_VALUE){
				return Integer.MIN_VALUE;
			}
			return (int)number*sign;
		}
	}
}
