package com.CameronPugh.RestAPILOTR;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RestApiLotrApplicationTests {

	@Autowired
	private MockMvc mockMvc ;

	@Test
	public void getsAllRestaurants() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/restaurants/")
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}
	@Test
	public void getsSingleRestaurants() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/restaurants/6")
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}
	@Test
	public void getsSingleRestaurantsMenu() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/restaurants/6/menu")
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}
	@Test
	public void getsSingleRestaurantsStaff() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/restaurants/6/staff")
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();
	}

}
