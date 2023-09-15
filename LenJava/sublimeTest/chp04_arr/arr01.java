public class arr01{
	/**
	 * 值拷贝（深拷贝【对象】）
	 * @param args [description]
	 */
	public static void main(String[] args) {
		double arr1[]={1,2,3};
		double arr2[]=new double[arr1.length];//开辟了新的内存
		
		for (int i=0; i<arr1.length ;i++ ) {
			arr2[i]=arr1[i];
		}
		System.out.println("<<<< 初始arr1 >>>>");
		for (int j=0;j<arr1.length ;j++ ) {
			System.out.print(arr1[j]+"\t");
		}
		arr2[0]=10;							//此时arr2的值发生改变
		System.out.println("\n\n<<<< arr2[0]=10后的arr1 >>>>");
		for (int j=0;j<arr2.length ;j++ ) {
			System.out.print(arr1[j]+"\t");
		}
	}
}