import java.util.Scanner;
public class JudgmentInteger{
	public static void main(String[] args) {
		Scanner myscan=new Scanner(System.in);
		char flag;
		do{
				System.out.println("������������");
				int con=myscan.nextInt();
				if(con>0)System.out.println("����0");
				else if(con<0)System.out.println("С��0");
				else System.out.println("����0");
				System.out.println("�Ƿ������y/n����");
			    flag=myscan.next().charAt(0);
		}while(flag=='y');
		




		System.out.println("�������������");
	}
}