import java.util.Scanner;
public class Keyboadinput{
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("�����룺����\t����\t�ɼ�\n");
			String name=scan.next();
			int age=scan.nextInt();
			double score=scan.nextDouble();
			System.out.println("������"+name+"\n���䣺"+age+"\n�ɼ���"+score);

	} 	
}