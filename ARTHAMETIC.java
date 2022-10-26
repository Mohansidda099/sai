package mohan;

public class ARTHAMETIC {
		public int sum (int a,int b)
		{
			return a+b;
		}
		public int sub (int a,int b)
		{
			return a-b;
		}
		public int mul (int a,int b)
		{
			return a*b;
		}
		public int div (int a,int b)
		{
			return a/b;
		}
		public int rem (int a,int b)
		{
			return a%b;
		}
		public static void main(String[] args) {
			ARTHAMETIC t=new ARTHAMETIC();
			System.out.println(t.sum(23,23));
			System.out.println(t.sub(24,12));
			System.out.println(t.mul(3,3));
			System.out.println(t.div(369,39));
			System.out.println(t.rem(27,9));
		}
}



