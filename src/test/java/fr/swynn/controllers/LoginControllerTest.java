package fr.swynn.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class LoginControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    void renderLoginView_shouldRender_loginView() throws Exception {
        // GIVEN a request to the root URL
        // WHEN the request is made
        // THEN the login view should be rendered

        mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andExpect(MockMvcResultMatchers.view().name("login"))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void handleLoginSubmit_shouldPerformAction_conenctionView() throws Exception {
        // GIVEN a request to the login submit URL with form data
        // WHEN the request is made
        // THEN perform the desired action

        mockMvc.perform(MockMvcRequestBuilders.post("/connection")
            .param("email", "test@mail.com")
            .param("password", "testPassword"))
            .andExpect(MockMvcResultMatchers.view().name("success"))
            .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
