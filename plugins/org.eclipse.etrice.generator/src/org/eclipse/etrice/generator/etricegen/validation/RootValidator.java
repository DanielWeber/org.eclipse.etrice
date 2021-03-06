/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.etrice.generator.etricegen.validation;


import org.eclipse.etrice.core.room.ActorClass;
import org.eclipse.etrice.core.room.DataClass;
import org.eclipse.etrice.core.room.ProtocolClass;
import org.eclipse.etrice.core.room.RoomModel;
import org.eclipse.etrice.generator.etricegen.ExpandedActorClass;
import org.eclipse.etrice.generator.etricegen.SubSystemInstance;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.etrice.generator.etricegen.Root}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RootValidator {
	boolean validate();

	boolean validateSubSystems(EList<SubSystemInstance> value);

	boolean validateComponents(EList<SubSystemInstance> value);
	boolean validateModels(EList<RoomModel> value);
	boolean validateXpActorClasses(EList<ExpandedActorClass> value);
	boolean validateUsedDataClasses(EList<DataClass> value);
	boolean validateUsedProtocolClasses(EList<ProtocolClass> value);
	boolean validateUsedActorClasses(EList<ActorClass> value);
	boolean validateUsedRoomModels(EList<RoomModel> value);
}
