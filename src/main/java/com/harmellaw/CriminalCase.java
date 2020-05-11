package com.harmellaw;

import java.util.ArrayList;
import java.util.List;

public class CriminalCase {

    public final PNCId pncId;
    public List<PreChargeDecision> preChargeDecisions;
    public boolean preChargeDecisionRequested = false;
    public boolean preChargeDecisionProvided = false;

    public CriminalCase(PNCId pncId) {
        this.pncId = pncId;
        this.preChargeDecisions = new ArrayList<PreChargeDecision>();
    }


}
