public class LogicalOperations{
	public static void main(String[] args) {
		/**
		 * 逻辑运算的结果也是boolean型
		 * 1.&&和||短路现象，&和|不会
		 * 2.！ ^
		 */
		int a=1,b=2;
		/**
		 * if(a<0 && ++b<4) 当前者判断为false，出现短路，++b不会执行
		 * if(a<0 & ++b<4)  当前者判断为false，还会往后执行
		 *
		 * if(a<0 || ++b<4)当前者判断为ture，出现短路，++b不会执行
		 * if(a<0 | ++b<4) 当前者判断为ture，继续往后执行
		 */
		
		
	}
}