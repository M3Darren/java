public class quoteParameter{
	public static void main(String[] args) {
		int[] arr={1,2,3};
		System.out.println("��ʼarr");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}
		Qpar par=new Qpar();
		par.modify(arr);
		System.out.println("\n\n����Qpar��modify������arr:");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}
	}
}
class Qpar{
	public void modify(int[] arr){
		arr[0]=100;
		System.out.println("\n\nmodify������arr:");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}
	}
}