package parameterReplace;

public class ParameterReplace {

	public static String replace(String inString) {
	
		return inString.replaceAll("#.*?#","1");
	}

}
