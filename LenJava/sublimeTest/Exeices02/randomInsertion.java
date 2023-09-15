public class randomInsertion{
	public static void main(String[] args) {
		double arr[]=new double[10],sum=0,index_8=-1,max,min;
		int maxIndex=0,minIndex=0;
		for (int i=0;i<arr.length ; i++) {
			arr[i]=Math.random()*100+1;
			sum+=arr[i];
			if(arr[i]==8){
				index_8=i;
			}
		}
		System.out.println("<<<< arr[] >>>>");
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\n");
		}
		max=arr[0];
		min=arr[0];
		for (int j=1;j<arr.length ;j++ ) {
			if((arr[j]-max)>0){
				max=arr[j];
				maxIndex=j;
			}
			if((arr[j]-min)<0){
				min=arr[j];
				minIndex=j;
			}
		}
		System.out.println("最大值下标："+maxIndex);
		System.out.println("最小值下标："+minIndex);
		if (index_8==-1) {
			System.out.println("没有数字8");
		}else{
			System.out.println("数字8的下标为："+index_8);
		}

	}
}