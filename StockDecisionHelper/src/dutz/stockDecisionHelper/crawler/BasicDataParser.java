/**
 * 
 */
package dutz.stockDecisionHelper.crawler;

import java.util.Date;

import javax.inject.Inject;

import dutz.stockDecisionHelper.common.Info;


public class BasicDataParser implements DataParser {

	private GuidGenerator _guidGenerator;

	@Inject
	public BasicDataParser(GuidGenerator guidGenerator) {
		_guidGenerator = guidGenerator;
	}
	
	/* (non-Javadoc)
	 * @see dutz.stockDecisionHelper.crawler.DataParser#ParseInfo(java.lang.String)
	 */
	@Override
	public Info ParseInfo(String responseStr) {
		Info result = new Info();
		
		result.setId(_guidGenerator.geneateGuid());
		result.setRecordDate(new Date());
		
		return result;
	}

}
