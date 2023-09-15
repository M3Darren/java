public class ArithmeticOperations{
	public static void main(String[] args) {
		System.out.println(10/4);//两数均为整型,结果还是整型
		System.out.println(10.0/4);//有一个数为double，结果为2.5
		double a=10/4;
		System.out.println(a);//结果为2.0，计算结果为整数，后赋值给变量a


		/**取模运算
		* 10 % -3 = 1
		* -10 % 3 = -1
		*取模结果的正负与前面一个数有关
		*/
		System.out.println(-10%3);

		/**
		 * 自增自减
		 * 面试题，讲出为什么
		 */
		int i=1,k=1;
		// 当相同变量出现时会创建临时变量tmp
		i=i++;//1(1)tmp=i;(2)i=i+1;(3)i=tmp;
		k=++k;//2(1)k=k+1;(2)tmp=k;(3)k=tmp;
		System.out.println(k);
	}
}