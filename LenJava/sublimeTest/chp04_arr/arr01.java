public class arr01{
	/**
	 * ֵ��������������󡿣�
	 * @param args [description]
	 */
	public static void main(String[] args) {
		double arr1[]={1,2,3};
		double arr2[]=new double[arr1.length];//�������µ��ڴ�
		
		for (int i=0; i<arr1.length ;i++ ) {
			arr2[i]=arr1[i];
		}
		System.out.println("<<<< ��ʼarr1 >>>>");
		for (int j=0;j<arr1.length ;j++ ) {
			System.out.print(arr1[j]+"\t");
		}
		arr2[0]=10;							//��ʱarr2��ֵ�����ı�
		System.out.println("\n\n<<<< arr2[0]=10���arr1 >>>>");
		for (int j=0;j<arr2.length ;j++ ) {
			System.out.print(arr1[j]+"\t");
		}
	}
}