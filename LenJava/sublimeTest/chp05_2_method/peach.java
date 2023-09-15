public class peach{
	public static void main(String[] args) {
		Pea p1=new Pea();
		int total1=p1.monkey(1);
		System.out.println(total1);
	}
}
class Pea{
	public int monkey(int day){
		if(day==10){
			return 1;
		}else{
			return (monkey(day+1)+1)*2;
		}
	}
}