package parameterReplace;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParameterReplaceTest {

	/**
	 * Tests clean text without # 22222
	 */
	@Test
	public void testStringWithoutParameter() {
		assertEquals("this is test", ParameterReplace.replace("this is test"));
	}
	
	@Test
	public void testStringWithParameter() throws Exception {
		assertEquals("where  1 = 1 and 1=1 and 1=# and 1=1", ParameterReplace.replace("where  1 = #col_parametr# and 1=#COL_PARAMETR# and 1=# and 1=1"));
	}

}
