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
		System.out.println("������Per���f1����");
	}
	public void f2(){
		System.out.println("���ñ���f1������");
		f1();
	}
	public void f3(){
		System.out.println("����Cat���g1������");
		Cat xde=new Cat();
		xde.g1();
	}
}
class Cat{
	public void g1(){
		System.out.println("������Cat���g1����");
	}
}