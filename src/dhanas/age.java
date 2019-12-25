package dhanas;

public class age 
{
	
	int n=50;
	int m=80;

	private void pub() {
		
		
		int g;
		int h;
		h=90;
		
		for (int i = 1; i <=n; i=i+2) {
			//System.out.println(i);
			int x=5;
			if (i%x==0) {
				System.out.println(i);
				
				
				
			}
			
		}
	}
	
	age(int x)
	{
		this.n=x;
		//this.m=x;
	System.out.println(m +" " +n +"    constructor called");	
	}
	
	age (String k)
	{
		System.out.println(k+"   constructor called");
	}
	public static void main(String[] args) {
//age ff=new age(50);
age kk=new age("vjhgjgh");



	}

}
