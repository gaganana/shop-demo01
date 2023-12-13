package shop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shop.SupportApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SupportApplication.class })
public class CucumberSpingConfiguration {}
