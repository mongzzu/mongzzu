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

        System.out.println("반지름"+a);

        System.out.println("반지름"+b);

        if(a.equals(b)) {

                   System.out.println("같은 원"); }

        else {

                   System.out.println("다른 원");} }
	}

}

