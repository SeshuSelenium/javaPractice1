package actoins;

public class Cons {
	int x;
	int y;
	
	Cons(){
		this.x=10;
		this.y=20;
		
	}
	
	Cons(int p, int q){
		x=p;
		y=q;
	}
	 public void m1(int apple, int balls) {
		 x=apple;
		 y=balls;
		 System.out.println(x +" : apples");
		 System.out.println(y +" : balls");
		 int total = x+y;
		 System.out.println("x = " +x+ ": y =  " +y);
		 System.out.println("total : " + total);
	 }
	
	
	void display() {
		System.out.println("x = " +x+ ": y =  " +y);
	}
	
	public static void main(String[] args) {
//		Cons c1 = new Cons(50, 75);
//		c1.display();
		Cons c = new Cons();
		
		c.m1(60, 40);
		c.display();
		
	}
	
	
	
}
