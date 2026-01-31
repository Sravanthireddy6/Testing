public class NumberFormatEx {
    public static void main(String[] args) {
    	String name="sam";
    	try {
    		int i=Integer.parseInt(name);
    		
    	}
    	catch(Exception ae) {
    		System.out.println(ae);
    	}
    }
}