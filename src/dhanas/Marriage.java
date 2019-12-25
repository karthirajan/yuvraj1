package dhanas;

public class Marriage {
	
	public static Marriage mrg=null;
	
	private Marriage() {
		
	}
	
	public static Marriage getInstance() {
		if(mrg==null) {
			mrg=new Marriage();
		}
		return mrg;

	}
	
	public void girlName() {
		System.out.println("priya");
	}
	
	public static void main(String[] args) {
		Marriage m=new Marriage();
		System.out.println(m);
	}

}
