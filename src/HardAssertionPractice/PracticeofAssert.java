package HardAssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticeofAssert {
	@Test
	public void asserprac() {
		SoftAssert soft = new SoftAssert();
		String s="Hi";
		String s1="Hello";
		String s3=null;
		soft.assertEquals(s, s1);
		System.out.println(s);
		soft.assertNull(s3);
		
	}
	
	

}
