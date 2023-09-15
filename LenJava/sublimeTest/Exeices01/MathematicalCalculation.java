public class MathematicalCalculation{
	public static void main(String[] args) {
		int flag=-1;
		double sum=0;
		for (int i=1;i<=100 ;i++ ) {
			flag=-flag;
			sum+=1.0/i*flag;
		}
		System.out.println(sum);

		System.out.println("1+(1+2)+...+(1+2+...100):");
		int s1=0,s2=0;
		for (int i=1;i<=100;i++ ) {
			s1+=i;
			s2+=s1;
		}
		System.out.println(s2);
	}
}