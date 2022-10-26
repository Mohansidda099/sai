package mohan;

public class UnarExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x=10;
	int y=10;
	System.out.println(x);//10
	System.out.println(x++);//10//post increment
	System.out.println(x);//11
	System.out.println(++x);//12 // pre increment 
	System.out.println(y);//10
	System.out.println(y--);//10
	System.out.println(y);//9
	System.out.println(--y);//8
	System.out.println(x++ + ++x);//11+11
	System.out.println(y++ + y++); // 11+10
		}

}
