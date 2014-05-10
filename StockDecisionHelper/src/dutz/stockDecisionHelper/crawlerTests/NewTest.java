package dutz.stockDecisionHelper.crawlerTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;
import dutz.stockDecisionHelper.common.*;
import dutz.stockDecisionHelper.crawler.*;

public class NewTest {
  @Test
  public void MockitoFirstTest() {
	  
	  // arrange:
	  GuidGenerator guidGeneratorMock = mock(GuidGenerator.class);
	  when(guidGeneratorMock.geneateGuid()).thenReturn((long) -5);
	  	  
	  DataParser target = new BasicDataParser(guidGeneratorMock);
	  
	  Info result;
	  long expected = -5;
	  
	  // act:
	  result = target.ParseInfo("");
	  
	  // assert:
	  Assert.assertEquals(result.getId(), expected);
  }
}
