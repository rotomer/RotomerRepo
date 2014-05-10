package dutz.stockDecisionHelper.crawler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;

import dutz.stockDecisionHelper.common.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi"); 
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		 Logger log = LoggerFactory.getLogger(Test.class);
		 log.trace("Hello World!");
		 log.debug("How are you today?");
		 log.info("I am fine.");
		 log.warn("I love programming.");
		 log.error("I am programming.");
		 
		 /*
	     * Guice.createInjector() takes your Modules, and returns a new Injector
	     * instance. Most applications will call this method exactly once, in their
	     * main() method.
	     */
	    Injector injector = Guice.createInjector(new CrawlerModule());

	    /*
	     * Now that we've got the injector, we can build objects.
	     */
	    DataParser dataParser = injector.getInstance(DataParser.class);
	    
	    Info result = dataParser.ParseInfo("");
	    
	    System.out.println("result: " + result.getId());
	
		
	}


}
