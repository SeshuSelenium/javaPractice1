package room.share;

public class RecursiveExample2 {
	static int count = 0;
	int n = 0;

	 public static String p(String str)
	    {
	        if (str.isEmpty())
	            return str;
	        //Calling Function Recursively
	        return p(str.substring(1)) + str.charAt(0);
	    }
	
	public static void main(String[] args) {
		String p = p("anil");
		System.out.println(p);
		
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(10/0);
			System.out.println(3);
		}catch (Exception e) {
			System.out.println(4);
			System.out.println(e);
			System.out.println(5);
			
		}finally {
			System.out.println(6);
			System.out.println("finally");
			System.out.println(7);
			
		}
		
		System.out.println(8);
		
		
		
	}
}