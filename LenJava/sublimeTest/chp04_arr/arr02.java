public class arr02{
		/**
		 * ��ַ������ǳ���������󡿣�
		 * @param args [description]
		 */
	public static void main(String[] args) {
			int n1=10,n2;
			n2=n1;
			System.out.println("n1="+n1+"\tn2="+n2+"\n");
			double arr1[]={1,2,3},arr2[];
			arr2=arr1;					//ָ��arr1���ڴ�
			System.out.println("<<<<<< ��ʼ��arr1 >>>>>>");
			for (int i=0;i<arr1.length ;i++ ) {
				System.out.print(arr1[i]+"\t");
			}
			arr2[0]=10;					//��ʱarr1��ֵҲ�ᷢ���仯
			System.out.println("\n\n<<<<< arr2[0]=10���arr1 >>>>>>>>");
			for (int i=0;i<arr2.length ;i++ ) {
				System.out.print(arr2[i]+"\t");
			}
	}
}