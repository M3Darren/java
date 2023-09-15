public class basicParameter{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("未调用前a,b："+a+","+b);
		Bpar par=new Bpar();
		par.swap(a,b);
		System.out.println("main调用Bpar的swap方法后a,b："+a+","+b);
	}
}
class Bpar{
	public void swap(int a, int b){
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("swap方法内a,b："+a+","+b);
	}
}
