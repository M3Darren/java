import java.util.Scanner;
public class JudgmentInteger{
	public static void main(String[] args) {
		Scanner myscan=new Scanner(System.in);
		char flag;
		do{
				System.out.println("请输入整数：");
				int con=myscan.nextInt();
				if(con>0)System.out.println("大于0");
				else if(con<0)System.out.println("小于0");
				else System.out.println("等于0");
				System.out.println("是否继续（y/n）：");
			    flag=myscan.next().charAt(0);
		}while(flag=='y');
		




		System.out.println("程序结束》》》");
	}
}