package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class APoliceInvestigation {

    @BeforeEach
    public void setup() {
        // Setup to run before each test
    }

    @Test
    public void shouldHaveAtLLeastOneSuspect() {
        Suspect aSuspect = new Suspect();
        PoliceInvestigation anInvestigation = new PoliceInvestigation(aSuspect);
        assertFalse(anInvestigation.suspects.isEmpty());
    }
    
    @Test
    public void cantHaveZeroSuspects() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            PoliceInvestigation anInvestigation = new PoliceInvestigation(null);
        });

        assertTrue(exception.getMessage().contains("You must provide a suspect"));
    }

    // TODO: Suspects must have one or more offences
    // TODO: should have some evidence
    // TODO: should have some witness statements
    // TODO: Suspects might have prior convictions
    // TODO: should have a PNC Id

    @Test
    public void shouldBeSomething() {
        // Make assertions
    }

    @Test
    public void shouldDoSomethingElse_whenSomethingHappens() {
        // Make assertions
    }

}
