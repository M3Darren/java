import java.util.Scanner;
public class Daffodil{
	public static void main(String[] args) {
		int daff,a,b,c;
		char flag;
		Scanner scan=new Scanner(System.in);
		do{
			System.out.println("请输入一个三位数：");
			daff=scan.nextInt();
			a=daff%10;
			b=daff/10%10;
			c=daff/100;
			if(daff==a*a*a+b*b*b+c*c*c){
				System.out.println(daff+"是水仙花数");
			}else{
				System.out.println(daff+"不是水仙花数");
		}
		System.out.println("是否继续》》》》（y/n）：");
		flag=scan.next().charAt(0);
	}while(flag=='y');
	System.out.println("程序退出》》》》》");
}
}