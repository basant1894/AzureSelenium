package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {
	
	@Test
	@Parameters({"MyName"})
	public void test(String name){
		        //(@Optional("Basant") String name){ 
		       // u can used this type also,if u r commented <parameter> tag in xml file
		System.out.println("My Name is : "+name);
	}

}
