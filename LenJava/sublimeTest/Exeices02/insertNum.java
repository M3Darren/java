public class insertNum{
	public static void main(String[] args) {
		int arr[]={10,12,23,56};
		/*int num=2,i;
		int tmp[]=new int[arr.length+1];
		for ( i=0;i<arr.length ;i++ ) {
			if(arr[i]<num){
				tmp[i]=arr[i];
			}else{
				
				break;
			}
		}
		for (int j=tmp.length-1;j>i ;j-- ) {
			tmp[j]=arr[j-1];
		}
		tmp[i]=num;
		for (int k=0;k<tmp.length ;k++ ) {
			System.out.print(tmp[k]+"\t");
		}*/
		//2
		int num=232,indexs=-1;
		for (int i=0;i<arr.length ;i++ ) {
			if(arr[i]>=num){
				indexs=i;
				break;
			}
		}
		if(indexs==-1)indexs=arr.length;
		int tmp[]=new int[arr.length+1];
		for (int i=0,j=0;i<tmp.length ;i++ ) {
			if(i!=indexs){
				tmp[i]=arr[j];
				j++;
			}else{
				tmp[i]=num;
			}
			System.out.print(tmp[i]+"\t");
		}
	}
}