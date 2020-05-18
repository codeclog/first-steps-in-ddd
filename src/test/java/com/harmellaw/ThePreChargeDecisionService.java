package com.harmellaw;

import com.harmellaw.investigation.PoliceInvestigationDetails;
import com.harmellaw.investigation.PreChargeDecisionCase;
import com.harmellaw.investigation.PreChargeDecisionService;
import com.harmellaw.investigation.Suspect;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThePreChargeDecisionService {

    private PreChargeDecisionService thePreChargeDecisionService;
    private PNCId pncId;
    private Suspect suspect;
    private PoliceInvestigationDetails policeInvestigationDetails;

    @BeforeEach
    public void setup() {
        thePreChargeDecisionService = new PreChargeDecisionService();
        pncId = new PNCId("AN-ID");
        suspect = new Suspect();
        policeInvestigationDetails = new PoliceInvestigationDetails(pncId, suspect);
    }

    @Test
    public void shouldCreateAPreChargeDecisionCaseWhenReceivingAPcdRequest() {
        PreChargeDecisionCase pcdCase = thePreChargeDecisionService.receiveRequestForPreChargeDecision(policeInvestigationDetails);

        assertEquals(pncId, pcdCase.pncId);
        assertEquals(policeInvestigationDetails.suspects, pcdCase.getSuspects());
    }
}
