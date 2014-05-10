/**
 * 
 */
package dutz.stockDecisionHelper.crawler;

import javax.inject.Inject;


public class BasicGuidGenerator implements GuidGenerator {

	@Inject
	public BasicGuidGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see dutz.stockDecisionHelper.crawler.GuidGenerator#geneateGuid()
	 */
	@Override
	public long geneateGuid() {
		// TODO Auto-generated method stub
		return 9;
	}

}
