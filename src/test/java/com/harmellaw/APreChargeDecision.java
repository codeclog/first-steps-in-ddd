package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.harmellaw.CriminalOffence.*;
import static com.harmellaw.CriminalOffence.ARMED_ROBBERY;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class APreChargeDecision {

    PreChargeDecision myPreChargeDecision;

    @BeforeEach
    public void setup() {
        myPreChargeDecision = new PreChargeDecision();
    }

    // TODO: isRequestedByThePolice
    // TODO: collectsAdvice
    // TODO: collectsReminders
    //

    @Test
    public void shouldRecordAlternativeCharge_AdviceAgainstSuspects() {

        Suspect mySuspect = new Suspect();
        Advice myAdvice = new Advice(ARMED_ROBBERY, DANGEROUS_DRIVING, "Greatly increased chance of conviction.");

        myPreChargeDecision.recordAlternateChargeAdvice(mySuspect, myAdvice);

        assertNotNull(myPreChargeDecision.alternateChargeAdvice.get(mySuspect));
    }

    @Test
    public void shouldRecordDisclosureManagementReminders() {
        // Make assertions
    }
}
