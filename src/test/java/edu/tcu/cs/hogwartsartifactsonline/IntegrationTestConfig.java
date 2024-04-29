package edu.tcu.cs.hogwartsartifactsonline;

import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@AutoConfigureMockMvc
@Tag("integration")
@ActiveProfiles("dev")
public class IntegrationTestConfig {
}