public class Scope{
	/**
	 * ×÷ÓÃÓò
	 * @param args [description]
	 */
	public static void main(String[] args) {
		Sp s=new Sp();
		s.s2();
		s.s3();
		System.out.println(s.v);
	}
}
class Sp{
	int v=1;
	public void s1(){
		int n=1;
		System.out.println(n);
	}
	public void s2(){
		v=10;	System.out.println(v);
	}
	public void s3(){
		System.out.println(v);
	}
	
}