public class obj01{
	public static void main(String[] args) {
		Per man=new Per();
		man.age=10;
		int res=man.avg(10,20);
		System.out.println(res);
	}
}

class Per{
	public int age;
	public int avg(int n,int m){
		int k=m+n;
		return k;
	}
}