public class obj02{
	public static void main(String[] args) {
		Per man=new Per();
		man.f2();
		System.out.println("===============");
		man.f3();
	}
}
class Per{
	public void f1(){
		System.out.println("这里是Per类的f1方法");
	}
	public void f2(){
		System.out.println("调用本类f1方法：");
		f1();
	}
	public void f3(){
		System.out.println("调用Cat类的g1方法：");
		Cat xde=new Cat();
		xde.g1();
	}
}
class Cat{
	public void g1(){
		System.out.println("这里是Cat类的g1方法");
	}
}