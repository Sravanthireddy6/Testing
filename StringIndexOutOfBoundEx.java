public class StringIndexOutOfBoundEx {
    public static void main(String[] args) {
    	String name="sam";
    	System.out.println(name.charAt(0));
    	System.out.println(name.charAt(1));
    	System.out.println(name.charAt(2));
    	try {
        	System.out.println(name.charAt(10));
    	}
    	catch(Exception ae)
    	{
    		System.out.println(ae);
    	}
    	
    }
}