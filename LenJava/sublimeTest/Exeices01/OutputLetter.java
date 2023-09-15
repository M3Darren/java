public class OutputLetter{
	public static void main(String[] args) {
		char c=97;
		while (c<='z') {
			System.out.print(c++ +" ");

		}
		System.out.println();
		c-=33;
		while (c>='A') {
			System.out.print(c-- +" ");

		}
	}
}