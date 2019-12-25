package dhanas;

public class array {

	public void arr()
	{
		int mark[]= new int[6];
		mark[1]=12;
		mark[2]=13;
		mark[4]=34;
		mark[0]=55;
		mark[3]=77;
		int y=mark.length;
		System.out.println(y);

		int temp;
		int nnn;
		String sub[]=new String[5];
		sub[0]="tamil";
		sub[1]="englist";
		sub[2]="maths";
		sub[3]="science";
		sub[4]="social";


		for (int i=0;i <5;i++) {
			//System.out.println(mark[i] +" " +sub[i]);
			
			temp=mark[i];
			nnn=temp;
			mark[5]=temp+nnn;
			//System.out.println(mark[5]);
			
			
			
		}

		mark[5]=77;
		//System.out.println(mark[5]);

	}
	public static void main(String[] args) {
		array ar =new array();
		ar.arr();
	}

}
