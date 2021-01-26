package mongzzu;
interface Po{
	void pr(int a,String b);
	void pr(String b);
}
class Point implements Po{
	public void pr(int a,String b) {
		System.out.println(a+" "+b);
	}
	public void pr(String b) {
		System.out.println(b);
	}
}
class java0126 {
	public void main(String[] args) {
		Po p=new Point();
		p.pr(30000,"java");
		p.pr("python");
	}

}

