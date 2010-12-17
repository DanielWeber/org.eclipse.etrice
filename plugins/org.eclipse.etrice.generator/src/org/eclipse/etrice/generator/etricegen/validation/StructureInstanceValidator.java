/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen.validation;


import org.eclipse.emf.common.util.EList;
import org.eclipse.etrice.generator.etricegen.ActorInstance;
import org.eclipse.etrice.generator.etricegen.BindingInstance;
import org.eclipse.etrice.generator.etricegen.ConnectionInstance;
import org.eclipse.etrice.generator.etricegen.InterfaceItemInstance;
import org.eclipse.etrice.generator.etricegen.PortInstance;
import org.eclipse.etrice.generator.etricegen.SAPInstance;
import org.eclipse.etrice.generator.etricegen.SPPInstance;
import org.eclipse.etrice.generator.etricegen.ServiceImplInstance;

/**
 * A sample validator interface for {@link org.eclipse.etrice.generator.etricegen.StructureInstance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StructureInstanceValidator {
	boolean validate();

	boolean validateInstances(EList<ActorInstance> value);
	boolean validatePorts(EList<PortInstance> value);
	boolean validateSaps(EList<SAPInstance> value);
	boolean validateSpps(EList<SPPInstance> value);
	boolean validateServices(EList<ServiceImplInstance> value);
	boolean validateBindings(EList<BindingInstance> value);
	boolean validateConnections(EList<ConnectionInstance> value);
	boolean validateAllContainedInstances(EList<ActorInstance> value);
	boolean validateOrderedIfItemInstances(EList<InterfaceItemInstance> value);
}
