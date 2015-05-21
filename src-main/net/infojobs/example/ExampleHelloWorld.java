package net.infojobs.example;

import javax.annotation.Resource;

/**
 * Hello world example for unit testing purposes
 * 
 * @author ramonrius
 */
public class ExampleHelloWorld {
	
	@Resource
	private ExampleExternalService exampleExternalService;
	
	/**
	 * Returns a String sayin Hi to the name defined by the {@link ExampleExternalService}
	 * @return String
	 */
	public String sayHi(){
		return "Hi " + this.exampleExternalService.getName() + "!";
	}
	
}
