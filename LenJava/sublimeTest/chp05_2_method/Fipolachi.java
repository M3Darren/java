public class Fipolachi{
	public static void main(String[] args) {
		F f1=new F();
		System.out.println(f1.fb(7));
	}
}
class F{
	public int fb(int n){
		if(n==1 || n==2){
			return 1;
		}else{
			return fb(n-1)+fb(n-2);
		}
	}
}