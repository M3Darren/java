public class yangHuiTriangle{
	public static void main(String[] args) {
		int arr[][]=new int[5][];
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=new int[i+1];
			for (int j=0;j<arr[i].length ;j++ ) {
				if(j==0 || j==arr[i].length-1){
					arr[i][j]=1;
				}else{
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	
		
	}
}