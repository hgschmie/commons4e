//$Id$
package org.jiayun.commons4e.internal.lang.generators;

import org.eclipse.jdt.core.IType;
import org.eclipse.swt.widgets.Shell;


/**
 * @author jiayun
 */
public interface ILangGenerator {

    void generate(Shell parentShell, IType objectClass);
}
