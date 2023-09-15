public class twoDimensional{
	public static void main(String[] args) {
		//Êä³ö
		//1
		//2 2
		//3 3 3
		int arr[][]=new int[3][];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=new int[i+1];
			for (int j=0;j<arr[i].length ;j++ ) {
				arr[i][j]=i+1;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}