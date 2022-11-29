package private packagename;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.assertj.core.api.Assertions.assertThat;


class TestClass  {
	@Test
	private void CreateandGetTeacher {
		HttpClient httpClient = HttpClients.createDefault();
		var httpRequest = new HttpPost("https://api.ntnu.no/teachers");
		String body = "{"name": "Leonardo Montecchi"}";
		var response = httpClient.execute(httpRequest);
		assertThat(response.getCode()).isIn(201);
		
		HttpClient httpClient = HttpClients.createDefault();
		var httpRequest = new HttpGet("https://api.ntnu.no/teachers/{teacherId}");
		var response = httpClient.execute(httpRequest);
		assertThat(response.getCode()).isIn(200);
		
	}
	
}
