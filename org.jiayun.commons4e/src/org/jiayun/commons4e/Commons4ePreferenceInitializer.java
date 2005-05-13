//$Id$
package org.jiayun.commons4e;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.jiayun.commons4e.internal.ui.preferences.PreferenceConstants;

/**
 * @author jiayun
 */
public class Commons4ePreferenceInitializer extends
        AbstractPreferenceInitializer {

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
     */
    public void initializeDefaultPreferences() {
        PreferenceConstants.initializeDefaultValues();
    }

}
