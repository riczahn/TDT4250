
import org.junit.jupiter.api.Test;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import static org.assertj.core.api.Assertions.assertThat;


 class ExampleTestSuiteOne  {
	@Test
	 void Testcase1() {
		var httpRequest0 = new HttpPost("https://api.ionos.com/cloudapi/v5/datacenters?pretty=true&depth=0");
		httpRequest0.setHeader("Accept", "application/json");
		httpRequest0.setHeader("Authentication", "dGVzdHVzZXI6cGFzc3dvcmQ=");
		httpRequest0.setHeader("Content-Type", "application/json");
		String body0 = "{\"properties\":{\"location\":\"us/las\"}}";
		httpRequest0.setEntity(new StringEntity(body));
		var response0 = HttpClients.createDefault().execute(httpRequest);
		assertThat(response0.getCode()).isIn(202);
		
		
		var httpRequest1 = new HttpGet("https://api.ionos.com/cloudapi/v5/datacenters/{datacenterId}?pretty=true&depth=0");
		httpRequest1.setHeader("Accept", "application/json");
		httpRequest1.setHeader("Authentication", "dGVzdHVzZXI6cGFzc3dvcmQ=");
		var response1 = HttpClients.createDefault().execute(httpRequest);
		assertThat(response1.getCode()).isIn(200, 202);
		
		
	}
	
}
