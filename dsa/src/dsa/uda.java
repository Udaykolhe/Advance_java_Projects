package dsa;

public class uda {
	void fun(int n) {
		if(n>0) {
			fun(n/3);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		
		uda u = new uda();
		u.fun(27);

	}

}
