public class varParameter{
	/**
	 * 可变参数
	 * @param args [description]
	 */
	public static void main(String[] args) {
		Varp v=new Varp();
		System.out.println(v.score("jack",60,91));
	}
}
class Varp{
	public String score(String name,double... score){
		double sum=0;
		for (int j=0;j<score.length ;j++ ) {
			sum+=score[j];
		}
		return name+"总共有"+score.length+"门课；总成绩为："+sum;
	}
}