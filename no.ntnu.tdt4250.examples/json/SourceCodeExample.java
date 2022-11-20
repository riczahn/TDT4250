import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class SourceCodeExample {

  private HttpClient httpClient;

  @BeforeEach
  public void setUp() {
    httpClient = HttpClients.createDefault();
  }

  @Test
  void whateverTest() throws IOException {
    HttpPost httppost = new HttpPost("https://api.predic8.de:443/shop/customers/");
    String body = "{\"firstname\": \"some\", \"lastname\": \"User\"}";
    httppost.setEntity(new StringEntity(body));
    httppost.setHeader("Content-Type", "application/json");

    var response = httpClient.execute(httppost);

    assertThat(response.getCode()).isIn(200);
  }

}
