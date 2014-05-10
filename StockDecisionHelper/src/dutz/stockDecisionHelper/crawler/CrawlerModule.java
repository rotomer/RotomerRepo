package dutz.stockDecisionHelper.crawler;

import com.google.inject.AbstractModule;

public class CrawlerModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		 /*
	      * This tells Guice that whenever it sees a dependency on a TransactionLog,
	      * it should satisfy the dependency using a DatabaseTransactionLog.
	      */
	    bind(GuidGenerator.class).to(BasicGuidGenerator.class);

	     /*
	      * Similarly, this binding tells Guice that when CreditCardProcessor is used in
	      * a dependency, that should be satisfied with a PaypalCreditCardProcessor.
	      */
	    bind(DataParser.class).to(BasicDataParser.class);
	}

}
