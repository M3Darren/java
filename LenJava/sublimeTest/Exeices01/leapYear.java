import java.util.Scanner;
public class leapYear{
	public static void main(String[] args) {
		int year;
		char flag;
		Scanner scan=new Scanner(System.in);
		do{
		System.out.println("��������ݣ�");
		year=scan.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}
		System.out.println("<<<<�Ƿ��������y/n��:");
		flag=scan.next().charAt(0);
			}while(flag=='y');
			System.out.println("�����˳�>>>>>>>>>>>>>>");
	}
}