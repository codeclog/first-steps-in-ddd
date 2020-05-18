package com.harmellaw.investigation;

import com.harmellaw.investigation.PNCId;
import com.harmellaw.investigation.Suspect;

import java.util.HashSet;
import java.util.Set;

public class PoliceInvestigationDetails {

    public PNCId pncId;
    public Set<Suspect> suspects = new HashSet<>();

    public PoliceInvestigationDetails(PNCId aPncId, Suspect aSuspect) {
        if (aPncId == null) throw new IllegalArgumentException("You must provide a PNC Id");
        if (aSuspect == null) throw new IllegalArgumentException("You must provide a suspect");

        this.pncId = aPncId;
        this.suspects.add(aSuspect);
    }
}
