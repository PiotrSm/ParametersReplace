package parameterReplace;

public class paraTest {
	
	public static final String EXAMPLE_TEST = "This is my small example ,"
		      + "string which I'm going to " + "use for pattern matching .";
	
	public static final String MY_TEST_STRING = "this#anystring# is #anystring2jk#test";
	
	public static final String MY_TEST_SELECT = "where  1 = #col_parametr# and 1=#COL_PARAMETR# and 1=# and 1=1";

	public static void main(String[] args) {
	 String outString =ParameterReplace.replace(MY_TEST_STRING);
	 	System.out.println(outString);
	 	
//	 	System.out.println(EXAMPLE_TEST.matches("\\w.*"));
//	    String[] splitString = (EXAMPLE_TEST.split("\\s+"));
//	    System.out.println(splitString.length);// should be 14
//	    for (String string : splitString) {
//	      System.out.println(string);
//	    }
//	    // replace all whitespace with tabs
//	    System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));	
	 	
	 	System.out.println(MY_TEST_STRING.matches(".*#.*"));
	 	System.out.println(MY_TEST_STRING.replaceAll("#.*?#","1"));
	 	System.out.println(MY_TEST_SELECT.replaceAll("#.*?#","1"));
	 	
	 // Removes whitespace between a word character and . or ,
	 	String pattern = "(\\w)(\\s+)([\\.,])";
	 	System.out.println(EXAMPLE_TEST.replaceAll(pattern, "$1$3"));
	 	
	 // Extract the text between the two title elements
	 	pattern = "(?i)(<title.*?>)(.+?)(</title>)";
	 	String updated = EXAMPLE_TEST.replaceAll(pattern, "$2"); 
	 	System.out.println(updated);
	}

}
