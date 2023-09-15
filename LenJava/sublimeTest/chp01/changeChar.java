public class changeChar{
	public static void main(String[] args) {
		// \r转义字符会把光标至行首，不会换行
		System.out.println("changeChar\r滴滴");
		System.out.println("changeChar\r\n滴滴");
		System.out.println("书名\t作者\t价格\n西游记\t罗贯中\t120");
	}
}