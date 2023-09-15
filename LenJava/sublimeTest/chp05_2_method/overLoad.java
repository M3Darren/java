public class overLoad{
	/**
	 * ·½·¨ÖØÔØ
	 * @param args [description]
	 */
	public static void main(String[] args) {
		Oload o=new Oload();
		o.sum(1,2);
		System.out.println(o.sum('A'));
	}
}
class Oload{
	public void sum(int a,int b){
		System.out.println(a+b);
	}
	public char sum(char c){
		return (char)(c+32);
	}
}