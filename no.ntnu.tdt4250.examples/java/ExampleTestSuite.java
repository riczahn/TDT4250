package private ;

import org.junit.jupiter.api.Test;


class ExampleTestSuite  {
	@Test
	private void CreateandGetTeacher {
		HttpClient httpClient = HttpClients.createDefault();
		var httpRequest = new HttpPost("https://api.ntnu.no/teachers");
		String body = "{"name": "Leonardo Montecchi"}";
		httpRequest.setEntity(new StringEntity(body));
		httpRequest.setHeader("Content-Type", "application/json";
		httpRequest.setHeader("Accept", "application/json";
		var response = httpClient.execute(httpRequest);
		assertThat(response.getCode()).isIn(201);
		
		;
		HttpClient httpClient = HttpClients.createDefault();
		var httpRequest = new HttpGet("https://api.ntnu.no/teachers/{teacherId}");
		httpRequest.setHeader("Accept", "application/json";
		var response = httpClient.execute(httpRequest);
		assertThat(response.getCode()).isIn(200);
		
		;
	}
	@Test
	private void CreateandGetTeacherAgain {
		HttpClient httpClient = HttpClients.createDefault();
		var httpRequest = new HttpPost("https://api.ntnu.no/teachers");
		String body = "{"name": "Leonardo Montecchi"}";
		httpRequest.setEntity(new StringEntity(body));
		httpRequest.setHeader("Content-Type", "application/json";
		httpRequest.setHeader("Accept", "application/json";
		var response = httpClient.execute(httpRequest);
		assertThat(response.getCode()).isIn(201);
		
		;
		HttpClient httpClient = HttpClients.createDefault();
		var httpRequest = new HttpGet("https://api.ntnu.no/teachers/{teacherId}");
		httpRequest.setHeader("Accept", "application/json";
		var response = httpClient.execute(httpRequest);
		assertThat(response.getCode()).isIn(200);
		
		;
	}
	
}
