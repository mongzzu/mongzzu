package mongzzu;
class Music extends Thread{
	String a;
	Music(String a){this.a=a;}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(a);
		}
	}
}
class Movie implements Runnable{
	String a;
	Movie(String a){this.a=a;}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(a);
		}
	}
}
class java0126 {
	public static void main(String[] args) {
		
		Music m=new Music("���� ���");
		m.start();
		
		Movie m1=new Movie("��ȭ ���");
		Thread t=new Thread(m1);
		t.start();
		
		try {
			m.join();
			t.join();
		}catch(Exception e) {}
	}
}

