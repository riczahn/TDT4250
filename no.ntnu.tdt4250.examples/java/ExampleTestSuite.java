
import org.junit.jupiter.api.Test;


 class ExampleTestSuite  {
	@Test
	 void CreateandGetTeacher() {
		var httpRequest0 = new HttpPost("https://api.ntnu.no/teachers");
		httpRequest0.setHeader("Content-Type", "application/json");
		httpRequest0.setHeader("Accept", "application/json");
		String body0 = "{"name": "Leonardo Montecchi"}";
		httpRequest0.setEntity(new StringEntity(body));
		var response0 = HttpClients.createDefault().execute(httpRequest);
		assertThat(response0.getCode()).isIn(201);
		
		
		var httpRequest1 = new HttpGet("https://api.ntnu.no/teachers/{teacherId}");
		httpRequest1.setHeader("Accept", "application/json");
		var response1 = HttpClients.createDefault().execute(httpRequest);
		assertThat(response1.getCode()).isIn(200);
		
		
	}
	@Test
	 void CreateandGetTeacherAgain() {
		var httpRequest0 = new HttpPost("https://api.ntnu.no/teachers");
		httpRequest0.setHeader("Content-Type", "application/json");
		httpRequest0.setHeader("Accept", "application/json");
		String body0 = "{"name": "Leonardo Montecchi"}";
		httpRequest0.setEntity(new StringEntity(body));
		var response0 = HttpClients.createDefault().execute(httpRequest);
		assertThat(response0.getCode()).isIn(201);
		
		
		var httpRequest1 = new HttpGet("https://api.ntnu.no/teachers/{teacherId}");
		httpRequest1.setHeader("Accept", "application/json");
		var response1 = HttpClients.createDefault().execute(httpRequest);
		assertThat(response1.getCode()).isIn(200);
		
		
	}
	
}
