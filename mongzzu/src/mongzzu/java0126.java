package mongzzu;
class Circle{
	int n;
	Circle(int n){
		this.n=n;
	}
	public String toString() {
		return n+" ";
	}
	public boolean equals(Object ob) {
		if(this.n== ((Circle)ob).n){
			return true;
		}
		return false;
	}
class java0126 {

	public void main(String[] args) {
		Circle a=new Circle(30);

        Circle b=new Circle(30);

        System.out.println("������"+a);

        System.out.println("������"+b);

        if(a.equals(b)) {

                   System.out.println("���� ��"); }

        else {

                   System.out.println("�ٸ� ��");} }
	}

}

