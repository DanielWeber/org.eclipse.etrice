/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen.validation;


import org.eclipse.etrice.core.room.Port;
import org.eclipse.etrice.generator.etricegen.BindingInstance;
import org.eclipse.etrice.generator.etricegen.PortKind;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.etrice.generator.etricegen.PortInstance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PortInstanceValidator {
	boolean validate();

	boolean validatePort(Port value);
	boolean validateKind(PortKind value);
	boolean validateBindings(EList<BindingInstance> value);
}
