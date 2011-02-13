/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen.validation;


/**
 * A sample validator interface for {@link org.eclipse.etrice.generator.etricegen.InstanceBase}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InstanceBaseValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validatePath(String value);
	boolean validateObjId(int value);

	boolean validateThreadId(int value);
}
