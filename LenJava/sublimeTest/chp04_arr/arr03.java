import java.util.Scanner;
public class arr03{
	/**
	 * ��������
	 * @param args [description]
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double arr[]={1,2,3};
		char flag;
		do{
		double tmp[]=new double[arr.length+1];
		for (int i=0;i<arr.length ;i++ ) {
			tmp[i]=arr[i];
		}
		System.out.println("�������������ݣ�");
		tmp[tmp.length-1]=scan.nextInt();
		arr=tmp;
		for (int j=0;j<arr.length ;j++ ) {
			System.out.print(arr[j]+"\t");
		}
		System.out.println("�Ƿ�������ݣ���y/n��");
		flag=scan.next().charAt(0);
	}while(flag=='y');
	}
}