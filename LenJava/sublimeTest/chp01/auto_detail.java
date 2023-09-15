public class auto_detail{
	public static void main(String[] args) {
		byte a=10;
		short b=10,c;
		c=a+b;//不合法，两者数据类型混合，会转换int再进行运算
		System.out.println(c);

	}
}