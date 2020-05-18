package com.harmellaw.prosecution;

import com.harmellaw.CriminalCase;
import com.harmellaw.investigation.PNCId;
import com.harmellaw.investigation.PoliceInvestigationDetails;

import java.util.HashMap;
import java.util.Map;

public class CrownProsecutionService {

    private Map<PNCId, PoliceInvestigationDetails> investigationsPendingAllocation = new HashMap<>();
    private Map<PNCId, CriminalCase> casesAwaitingDecisionAppraisal = new HashMap<>(); // TODO: Need to make this terminology appear in the Domain Expert Statement

    // TODO: this makes the immutable copy. (Why a copy? because we want it in our shape not the police's to make coming to a decision easier.)
    // TODO: put something in the Domain Expert Statement about "we shuffle this around to make it easier for us to evaluate" - say what is our need and how it differs from theirs
    // TODO: this shuffling is because they are looking at it from the perspective of it being a criminal case _in the future_
    public void requestPreChargeDecisionRegarding(PoliceInvestigationDetails policeInvestigationDetails) {
        investigationsPendingAllocation.put(policeInvestigationDetails.pncId, policeInvestigationDetails);
    }

    public CriminalCase translatePoliceInvestigationIntoCase(PoliceInvestigationDetails policeInvestigationDetails) {
        // TODO: make this a builder (one of the first things to do in the second course?)
        casesAwaitingDecisionAppraisal.put(policeInvestigationDetails.pncId, new CriminalCase(policeInvestigationDetails));

        return casesAwaitingDecisionAppraisal.get(policeInvestigationDetails.pncId);
    }
}
