package com.harmellaw;

import com.harmellaw.investigation.PoliceInvestigationDetails;
import com.harmellaw.investigation.PreChargeDecisionCase;

public class PreChargeDecisionService {
    public PreChargeDecisionCase receiveRequestForPreChargeDecision(PoliceInvestigationDetails policeInvestigationDetails) {
        return new PreChargeDecisionCase(policeInvestigationDetails.pncId, policeInvestigationDetails.suspects);
    }
}
