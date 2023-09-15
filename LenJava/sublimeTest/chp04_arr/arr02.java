public class arr02{
		/**
		 * 地址拷贝（浅拷贝【对象】）
		 * @param args [description]
		 */
	public static void main(String[] args) {
			int n1=10,n2;
			n2=n1;
			System.out.println("n1="+n1+"\tn2="+n2+"\n");
			double arr1[]={1,2,3},arr2[];
			arr2=arr1;					//指向arr1的内存
			System.out.println("<<<<<< 初始的arr1 >>>>>>");
			for (int i=0;i<arr1.length ;i++ ) {
				System.out.print(arr1[i]+"\t");
			}
			arr2[0]=10;					//此时arr1的值也会发生变化
			System.out.println("\n\n<<<<< arr2[0]=10后的arr1 >>>>>>>>");
			for (int i=0;i<arr2.length ;i++ ) {
				System.out.print(arr2[i]+"\t");
			}
	}
}