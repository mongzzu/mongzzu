abstract class Profile{
	abstract void add(String name, String id);
	abstract String check(String id);
}
class Person{
	String name, id;
	Person(String n,String i){
		name=n;
		id=i;
	}
	String getname() {
		return name;
	}
	String getid() {
		return id;
	}
}
class Per extends Profile{
	Person ary[];
	int n;
	Per(int n){
		ary=new Person[n];
	}
	void add(String name, String id) {
		ary[n]=new Person(name,id);//ary[n++]µµ °¡´É
		n++;
	}
	String check(String id) {
		for(int i=0;i<n;i++) {
			if(id.compareTo(ary[i].getid())==0) {
				return ary[i].getname();
			}
		}
		return null;
	}
}
public class mongzzu {
	public static void main(String[] args) {
		
		Per p=new Per();
		
		
		
}
}
