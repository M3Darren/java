public class string_detail{
	public static void main(String[] args) {
		//��������--->string
		int a=123;
		float b=123f;
		double c=123.4;
		String d1=a+"";
		String d2=b+"";
		String d3=c+"";
		System.out.println("�����ַ����ͣ�");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		//string--->��������
		int n1=Integer.parseInt(d1);
		float n2=Float.parseFloat(d2);
		double n3=Double.parseDouble(d3);
		System.out.println("���ǻ����ͣ�");
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

		//ȡ���ַ�����ĳһ���ַ�
		char s=d1.charAt(2);//ȡ���������ַ���Ĭ�ϴ�0��ʼ���
		System.out.println(s);
	}
}