package com.bootcamp.micro;

import com.bootcamp.micro.controllers.MicroController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class MicroApplicationTests {
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	@Autowired
	private MicroController controller;

	@DisplayName("Controlador no nulo")
	@Test
	void controllerNoNulo() {
		assertThat(controller).isNotNull();
	}

	@DisplayName("Controlador nulo")
	@Test
	void controllerNulo() {
		//assertThat(controller).isNull();
	}

	@DisplayName("Servicio responde")
	@Test
	void getBootcamp() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/v1/bootcamp",
				String.class)).contains("Bootcamp DevOps");
	}
}
