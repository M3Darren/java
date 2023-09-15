import java.util.Scanner;
public class Keyboadinput{
	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("请输入：姓名\t年龄\t成绩\n");
			String name=scan.next();
			int age=scan.nextInt();
			double score=scan.nextDouble();
			System.out.println("姓名："+name+"\n年龄："+age+"\n成绩："+score);

	} 	
}