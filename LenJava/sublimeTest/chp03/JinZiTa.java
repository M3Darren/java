public class JinZiTa{
	public static void main(String[] args) {
		//��ӡ������
		//		*
		//	   ***
		//	  *****
		//	 *******
		for(int i=1;i<5;i++){
			//��ӡÿ�пո�
			for(int k=1;k<5-i;k++){
				System.out.print(" ");
			}
			//��ӡ*
			for (int j=1;j<=2*i-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//����
		for (int i=1;i<=7 ;i++ ) {
			if(i<=7/2+1){
				for (int k=1;k<=7/2+1-i ; k++) {
					System.out.print(" ");
				}
				for (int j=1;j<=2*i-1 ;j++ ) {
					System.out.print("*");
				}
				
			}else{
				for (int k=1;k<=i-7/2-1 ;k++ ) {
					System.out.print(" ");
				}
				for (int j=1;j<=2*(7-i)+1 ; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		//��ӡ���Ľ�����
		//		*
		//	   * *
		//	  *   *
		//	 *******
		 for(int i=1;i<5;i++){
			//��ӡÿ�пո�
			for(int k=1;k<5-i;k++){
				System.out.print(" ");
			}
			//��ӡ*
			for (int j=1;j<=2*i-1 ; j++) {
				if(j==1 || j==2*i-1 || i==4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}