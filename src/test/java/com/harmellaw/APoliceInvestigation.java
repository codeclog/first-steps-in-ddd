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
    public void canHavePreChargeDecisions() { // this is an assumption as to the max number
        Suspect aSuspect = new Suspect();
        PoliceInvestigation anInvestigation = new PoliceInvestigation(aSuspect);

        assertNull(anInvestigation.preChargeDecision);
    }

    @Test
    public void canHaveOnePreChargeDecisionMaximum() { // this is an assumption as to the max number
        Suspect aSuspect = new Suspect();
        PoliceInvestigation anInvestigation = new PoliceInvestigation(aSuspect);

        PreChargeDecision decision = new PreChargeDecision();
        anInvestigation.setPreChargeDecision(decision);

        assertEquals(anInvestigation.preChargeDecision, decision);
    }


    @Test
    public void cantHaveZeroSuspects() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            PoliceInvestigation anInvestigation = new PoliceInvestigation(null);
        });

        assertTrue(exception.getMessage().contains("You must provide a suspect"));
    }
    
    @Test
    public void shouldBeSomething() {
        // Make assertions
    }

    @Test
    public void shouldDoSomethingElse_whenSomethingHappens() {
        // Make assertions
    }

}
