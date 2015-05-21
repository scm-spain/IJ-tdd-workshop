package net.infojobs.example;

import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


/**
 * Unit test for ExampleHelloWorld to show the basics of JUnit with mockito
 * 
 * @author ramonrius
 * 
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleHelloWorldTest {
	
	@Mock private ExampleExternalService exampleExternalService;
	
	@InjectMocks private ExampleHelloWorld exampleHelloWorld;
	
	@Before
	public void setUp(){
		System.out.println("Setting up test");
		
		when(this.exampleExternalService.getName()).thenReturn("Your_name");
	}
	
	@Test
	public void testHi(){
		System.out.println("Executing test");
		Assert.assertEquals("Hi Your_name!",this.exampleHelloWorld.sayHi());
	}
	
	@After
	public void cleanUp(){
		System.out.println("Finishing test");
	}
}
