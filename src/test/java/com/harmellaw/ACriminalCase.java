
package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ACriminalCase {

    CriminalCase myCase;

    @BeforeEach
    public void setup() {
        myCase = new CriminalCase(new PNCId("aweds"));
    }

    @Test
    public void shouldRecordThePNCId() {
        assertNotNull(myCase.pncId);
    }

    @Test
    public void shouldHaveAnEmptyPreChargeDecisionSlotWhenFirstCreated() {
        assertFalse(myCase.preChargeDecisionRequested);
        assertFalse(myCase.preChargeDecisionProvided);
        assertTrue(myCase.preChargeDecisions.isEmpty());
    }

    @Test
    public void completedPreChargeDecisionsAreAvailableToThePolice() {
//        myCase.
    }

    
    @Test
    public void shouldDoSomething_whenSomethingElseHappens() {
        // Make assertions
    }
}
