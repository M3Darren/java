public class string_detail{
	public static void main(String[] args) {
		//基本类型--->string
		int a=123;
		float b=123f;
		double c=123.4;
		String d1=a+"";
		String d2=b+"";
		String d3=c+"";
		System.out.println("这是字符串型：");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		//string--->基本类型
		int n1=Integer.parseInt(d1);
		float n2=Float.parseFloat(d2);
		double n3=Double.parseDouble(d3);
		System.out.println("这是基本型：");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

		//取出字符串中某一个字符
		char s=d1.charAt(2);//取出第三个字符，默认从0开始编号
		System.out.println(s);
	}
}