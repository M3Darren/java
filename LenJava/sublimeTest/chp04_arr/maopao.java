public class maopao{
	public static void main(String[] args) {
		int arr[]={12,2,34,3,1,55,32,5};
		int tmp;
		for (int i=0;i<arr.length-1 ;i++ ) {
			for (int j=0;j<arr.length-1-i ;j++ ) {
				if(arr[j]>arr[j+1]){
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}
	}
}