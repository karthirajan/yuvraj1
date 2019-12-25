package dhanas;

public class queen {
	private void pub() {
		int a=3;
		int b=7;
		int c=b-a;
		System.out.println(c);
	}
	public void mud()  {
		int a=7;
		int b=7;
		/*if (a<b) {
			System.out.println(a+"   a is lesser");
			//Thread.sleep(10000);
		}*/
		
		if (a>b) {
			System.out.println(b+"   b is lesser");

		}
		else if (a<b)
		{
			System.out.println(a+ " a is lesser");
		}
	
		/*else
		{
			System.out.println("both are same");

		}*/
		System.out.println("if condition completed");

	}



	public static void main(String[] args) throws InterruptedException {
		queen Que = new queen();
		//Que.pub();
		Que.mud();

	}

}
