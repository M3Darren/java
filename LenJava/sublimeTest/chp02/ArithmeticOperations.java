public class ArithmeticOperations{
	public static void main(String[] args) {
		System.out.println(10/4);//������Ϊ����,�����������
		System.out.println(10.0/4);//��һ����Ϊdouble�����Ϊ2.5
		double a=10/4;
		System.out.println(a);//���Ϊ2.0��������Ϊ��������ֵ������a


		/**ȡģ����
		* 10 % -3 = 1
		* -10 % 3 = -1
		*ȡģ�����������ǰ��һ�����й�
		*/
		System.out.println(-10%3);

		/**
		 * �����Լ�
		 * �����⣬����Ϊʲô
		 */
		int i=1,k=1;
		// ����ͬ��������ʱ�ᴴ����ʱ����tmp
		i=i++;//1(1)tmp=i;(2)i=i+1;(3)i=tmp;
		k=++k;//2(1)k=k+1;(2)tmp=k;(3)k=tmp;
		System.out.println(k);
	}
}