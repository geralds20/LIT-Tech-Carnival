package io.littechcarnival.cucumber.stepdefs;

import io.littechcarnival.LitTechCarnivalApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = LitTechCarnivalApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
