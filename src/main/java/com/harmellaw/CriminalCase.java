package com.harmellaw;

import com.harmellaw.investigation.PNCId;
import com.harmellaw.investigation.PoliceInvestigationDetails;
import com.harmellaw.investigation.Suspect;

import java.util.Collections;
import java.util.Set;

public class CriminalCase {

    public final PNCId pncId;
    public final Set<Suspect> suspects;

    // TODO: BOOM THIS BLOWS UP! - We need to do this at the right time in the exercise.
    // TODO: It will create a bunch of knock-on refactoring. We want people to follow us.  The work of this is _the exercise after this._
    // TODO: We could have more than one constructor - but this CASE is _mutable_.
    // TODO: we need to go back to the Domain Expert and ask them about this problem
    public CriminalCase(PoliceInvestigationDetails policeInvestigationDetails) {
        this.pncId = policeInvestigationDetails.pncId;
        // TODO: check this will really be unmodifiable
        this.suspects = Collections.unmodifiableSet(policeInvestigationDetails.suspects);
    }


}
