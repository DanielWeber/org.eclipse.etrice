/*******************************************************************************
 * Copyright (c) 2010 protos software gmbh (http://www.protos.de).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * CONTRIBUTORS:
 * 		Thomas Schuetz and Henrik Rentz-Reichert (initial contribution)
 * 
 *******************************************************************************/

package org.eclipse.etrice.core;

import org.eclipse.etrice.core.naming.RoomFragmentProvider;
import org.eclipse.etrice.core.naming.RoomQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IFragmentProvider;


/**
 * Use this class to register components to be used within the IDE.
 */
public class RoomRuntimeModule extends org.eclipse.etrice.core.AbstractRoomRuntimeModule {

	@Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return RoomQualifiedNameProvider.class;
    }
	
	@Override
	public Class<? extends IFragmentProvider> bindIFragmentProvider() {
		return RoomFragmentProvider.class;
	}
}
