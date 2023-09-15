public class Break_det{
	public static void main(String[] args) {
		lable1:
		for (int i=0;i<3 ;i++ ) {
			lable2:
			for (int j=0;j<3 ;j++ ) {
				if(i==j)break lable1;//此时退出外层循环
			}
		}
	}
}