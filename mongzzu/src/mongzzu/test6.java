package mongzzu;
abstract class Ab{
	abstract int total(int a[]);
}
class Cd extends Ab{
	int sum=0;
	int total(int a[]) {
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
}
public class test6 {
	
	public static void main(String[] args) {
		Ab c=new Cd();//��ĳ����
		System.out.println(c.total(new int[] {1,2,3,4,5}));
		//total �Լ��� �迭�� 1,2,3,4,5 ���� ���� �޴� �Լ�
	}

}
