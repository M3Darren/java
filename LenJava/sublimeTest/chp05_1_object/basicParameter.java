public class basicParameter{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("δ����ǰa,b��"+a+","+b);
		Bpar par=new Bpar();
		par.swap(a,b);
		System.out.println("main����Bpar��swap������a,b��"+a+","+b);
	}
}
class Bpar{
	public void swap(int a, int b){
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("swap������a,b��"+a+","+b);
	}
}
