public class Recursion{
	public static void main(String[] args) {
		Test t1=new Test();
		
		System.out.println(t1.rec(4));
	}
}
class Test{
	public int rec(int n){
		if(n==1){
			return 1;
		}else{
			return rec(n-1)*n;
		}
	}
}