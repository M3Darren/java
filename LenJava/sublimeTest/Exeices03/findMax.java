public class findMax{
	public static void main(String[] args) {
		double[] arr={12,2,33,56,1.2,1,2.1};
		Find f=new Find();
		Double result=f.max(arr);
		if(result!=null){
			System.out.println("max:"+result);
		}else{
			System.out.println("enter error");
		}
	}
}
class Find{
	public Double max(double[] arr){//这里的Double为封装类，double为基本数据类型
		int index=0;
		if(arr!=null && arr.length>0){
			for (int i=1;i<arr.length ; i++) {
			if(arr[index]<arr[i])index=i;
		}
		return arr[index];
	}else{
		return null;
	}
	}
}