package demo;

import org.testng.annotations.Test;


//@Test(groups={"AllClassTests"})
//if u want to execute all test then u can use this in testng.xml file
public class TestNGGroupsDemo {
	
	@Test(groups={"sanity"}) //@Test(groups={"windows.sanity"}) 
	                        // if u wana run for a specific platform also then use it in testng.xml file as "windows.*"
	public void test1(){
		System.out.println("This is Test 1");
	}
	@Test(groups={"sanity","smoke"})
	public void test2(){
		System.out.println("This is Test 2");
	}
	@Test(groups={"sanity","regression"})
	public void test3(){
		System.out.println("This is Test 3");
	}
	@Test(groups={"regression"})
	public void test4(){
		System.out.println("This is Test 4");
	}

}
