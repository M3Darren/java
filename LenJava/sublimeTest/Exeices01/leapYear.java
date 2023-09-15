import java.util.Scanner;
public class leapYear{
	public static void main(String[] args) {
		int year;
		char flag;
		Scanner scan=new Scanner(System.in);
		do{
		System.out.println("请输入年份：");
		year=scan.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}
		System.out.println("<<<<是否继续？（y/n）:");
		flag=scan.next().charAt(0);
			}while(flag=='y');
			System.out.println("程序退出>>>>>>>>>>>>>>");
	}
}