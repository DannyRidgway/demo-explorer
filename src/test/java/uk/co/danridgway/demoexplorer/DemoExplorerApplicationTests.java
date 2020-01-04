package uk.co.danridgway.demoexplorer;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

// Controllers
import uk.co.danridgway.demoexplorer.index.IndexController;

@WebMvcTest(controllers = IndexController.class)
class DemoExplorerApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void index() throws Exception {
		mockMvc.perform(get("/index.html")).andExpect(status().isOk());
	}
}
