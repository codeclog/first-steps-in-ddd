package com.harmellaw;

import com.harmellaw.investigation.PNCId;
import com.harmellaw.investigation.PoliceInvestigationDetails;
import com.harmellaw.investigation.Suspect;
import com.harmellaw.prosecution.CrownProsecutionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TheCrownProsecutionService {

    private PNCId myPncId;
    private CrownProsecutionService theCps;
    private Suspect mySuspect;
    private PoliceInvestigationDetails myPoliceInvestigationDetails;

    @BeforeEach
    public void setup() {
        myPncId = new PNCId("AVFRES");
        theCps = new CrownProsecutionService();
        mySuspect = new Suspect();
        myPoliceInvestigationDetails = new PoliceInvestigationDetails(myPncId, mySuspect);
    }

    // TODO: turn this into a test which makes a bit more sense - perhaps re-phrase this bit in the Domain Expert Statement
    @Test
    public void shouldAcceptPreChargeDecisionRequests() {
        theCps.requestPreChargeDecisionRegarding(myPoliceInvestigationDetails); // TODO: the start of this name is a little off

//        assertTrue(theCps.hasAcceptedPcdRequestFor(myPncId)); // TODO: this makes the Service stateful (leave this for this exercise?)
    }

    @Test
    public void receivingPCDRequestsCreatesCasesWithTheCPS() { // TODO: the lack of "criminal" here will be *KEY*

        CriminalCase myCase = theCps.translatePoliceInvestigationIntoCase(myPoliceInvestigationDetails);

        // TODO: WHY ARE THEY DIFFERENT? This "Case" should be immutable as we don't change it (yet)

        assertEquals(myPncId, myCase.pncId);
        assertEquals(myPoliceInvestigationDetails.suspects, myCase.suspects);
    }
}
