import java.util.Scanner;
public class arr3_1{
	public static void main(String[] args) {
		double arr[]={1,2,3};
		Scanner scan=new Scanner(System.in);
		char flag;
		do{
			double tmp[]=new double[arr.length-1];
			if(tmp.length>0){
				for (int i=0;i<tmp.length ;i++ ) {
				tmp[i]=arr[i];
			}
			arr=tmp;
			for (int j=0;j<arr.length ;j++ ) {
				System.out.print(arr[j]+"\t");
			}
			System.out.println("是否继续缩小：（y/n）");
			flag=scan.next().charAt(0);
			}else{
			flag='n';
			System.out.println("不可再缩小！！！");
			}
		}while(flag=='y');
		
	}
}