package mohan;

public class classdeclaration {
	int a,b;//variable declaration//
	public classdeclaration(int x, int y) {//constructor//
	this.a=x;
	this.b=y;
	}
public int add() {
	int res=a+b;
	return res;
}
/*creating object of class calling the method of Classdeclaration class*/
	public static void main(String[] args) {
		classdeclaration c=new classdeclaration(21,4);
		System.out.println(c.add());

	}

}
