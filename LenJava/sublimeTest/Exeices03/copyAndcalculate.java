public class copyAndcalculate{
	public static void main(String[] args) {
		int[] arr={12,2,44,3,1};
		Mix m=new Mix();
		int[] marr=m.copyArr(arr);
		System.out.println("====New arr:=======");
		for (int i=0;i<marr.length ;i++ ) {
			System.out.print(marr[i]+"\t");
		}
		System.out.println();
		//����Բ���ܳ������
		Mix m1=m;
		m1.radius=12;
		m1.circleperimeter();
		m1.circlearea();
		//�Ӽ��˳�
		Mix m2=m;
		m2.caleadd(1,2);
		m2.calesub(3,2);
		m2.calemul(2,3);
		m2.calediv(1,2);

	}
}
class Mix{
	public int[] copyArr(int[] arr){
		int[] Newarr=new int[arr.length];
		for (int i=0;i<arr.length ;i++ ) {
			Newarr[i]=arr[i];
		}
		return Newarr;
	}
	double radius;
	public void circleperimeter(){
		System.out.println("circleperimeter:"+2*3.4*radius);
	}
	public void circlearea(){
		System.out.println("circlearea"+3.14*radius*radius);
	}

	public void caleadd(double m,double n){//�ӷ�
		System.out.println("AddResult: "+(m+n));
	}
	public void calesub(double m,double n){//����
		System.out.println("SubResult: "+(m-n));
	}
	public void calemul(double m,double n){//�˷�
		System.out.println("MulResult: "+(m*n));
	}
	public void calediv(double m,double n){//����
		if(n==0){
			System.out.println("��������Ϊ0������");
		}
		System.out.println("DivResult: "+m/n);

	}
}