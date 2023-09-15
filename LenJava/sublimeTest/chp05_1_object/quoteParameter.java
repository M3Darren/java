public class quoteParameter{
	public static void main(String[] args) {
		int[] arr={1,2,3};
		System.out.println("初始arr");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}
		Qpar par=new Qpar();
		par.modify(arr);
		System.out.println("\n\n调用Qpar的modify方法后arr:");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}
	}
}
class Qpar{
	public void modify(int[] arr){
		arr[0]=100;
		System.out.println("\n\nmodify方法内arr:");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}
	}
}