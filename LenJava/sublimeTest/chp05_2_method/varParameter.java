public class varParameter{
	/**
	 * �ɱ����
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
		return name+"�ܹ���"+score.length+"�ſΣ��ܳɼ�Ϊ��"+sum;
	}
}