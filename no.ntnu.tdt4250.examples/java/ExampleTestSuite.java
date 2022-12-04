package private ;

import org.junit.jupiter.api.Test;


class ExampleTestSuite  {
	@Test
	private void CreateandGetTeacher {
		HttpClient httpClient = HttpClients.createDefault();
		var httpRequest0 = new HttpPost("https://api.ntnu.no/teachers");
		String body0 = "{"name": "Leonardo Montecchi"}";
		httpRequest0.setEntity(new StringEntity(body));
		httpRequest0.setHeader("Content-Type", "application/json"
		httpRequest0.setHeader("Accept", "application/json"
		var response0 = httpClient.execute(httpRequest);
		assertThat(response0.getCode()).isIn(201);
		
		
		HttpClient httpClient = HttpClients.createDefault();
		var httpRequest1 = new HttpGet("https://api.ntnu.no/teachers/{teacherId}");
		httpRequest1.setHeader("Accept", "application/json"
		var response1 = httpClient.execute(httpRequest);
		assertThat(response1.getCode()).isIn(200);
		
		
	}
	@Test
	private void CreateandGetTeacherAgain {
		HttpClient httpClient = HttpClients.createDefault();
		var httpRequest0 = new HttpPost("https://api.ntnu.no/teachers");
		String body0 = "{"name": "Leonardo Montecchi"}";
		httpRequest0.setEntity(new StringEntity(body));
		httpRequest0.setHeader("Content-Type", "application/json"
		httpRequest0.setHeader("Accept", "application/json"
		var response0 = httpClient.execute(httpRequest);
		assertThat(response0.getCode()).isIn(201);
		
		
		HttpClient httpClient = HttpClients.createDefault();
		var httpRequest1 = new HttpGet("https://api.ntnu.no/teachers/{teacherId}");
		httpRequest1.setHeader("Accept", "application/json"
		var response1 = httpClient.execute(httpRequest);
		assertThat(response1.getCode()).isIn(200);
		
		
	}
	
}
