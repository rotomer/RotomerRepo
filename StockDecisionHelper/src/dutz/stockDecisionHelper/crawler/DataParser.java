/**
 * 
 */
package dutz.stockDecisionHelper.crawler;

import dutz.stockDecisionHelper.common.Info;


public interface DataParser {

	
	Info ParseInfo(String responseStr);
	
}
