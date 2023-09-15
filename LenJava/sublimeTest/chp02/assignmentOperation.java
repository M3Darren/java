public class assignmentOperation{
	public static void main(String[] args) {
		/**
		 * 复合运算：+=，-=，*-，/=，%=
		 * 此时会发生强制类型转换
		 */
		byte a=1;
		a+=2;//运算过程等价a=a+2，但是a+=2会类型转换a=(byte)(a+2);
		a=a+2;//此时报错，因为byte,short,char运算会自转为int型
		System.out.println(a);//3
	}
}