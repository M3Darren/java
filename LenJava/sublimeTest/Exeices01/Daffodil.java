import java.util.Scanner;
public class Daffodil{
	public static void main(String[] args) {
		int daff,a,b,c;
		char flag;
		Scanner scan=new Scanner(System.in);
		do{
			System.out.println("������һ����λ����");
			daff=scan.nextInt();
			a=daff%10;
			b=daff/10%10;
			c=daff/100;
			if(daff==a*a*a+b*b*b+c*c*c){
				System.out.println(daff+"��ˮ�ɻ���");
			}else{
				System.out.println(daff+"����ˮ�ɻ���");
		}
		System.out.println("�Ƿ��������������y/n����");
		flag=scan.next().charAt(0);
	}while(flag=='y');
	System.out.println("�����˳�����������");
}
}