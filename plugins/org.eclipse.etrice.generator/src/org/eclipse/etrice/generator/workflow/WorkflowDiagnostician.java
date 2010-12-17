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

package org.eclipse.etrice.generator.workflow;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.etrice.core.naming.RoomNameProvider;
import org.eclipse.etrice.generator.builder.ILogger;
import org.eclipse.etrice.generator.etricegen.IDiagnostician;


public class WorkflowDiagnostician implements IDiagnostician {

	private ILogger logger;
	private boolean failed = false;

	public WorkflowDiagnostician(ILogger logger) {
		this.logger = logger;
	}
	
	@Override
	public void warning(String msg, EObject source) {
		warning(msg, source, -1);
	}

	@Override
	public void warning(String msg, EObject source, int feature) {
		String location = RoomNameProvider.getLocation(source);
		if (location==null || location.isEmpty())
			logger.logInfo(msg);
		else
			logger.logInfo(msg+" @ "+location);
	}

	@Override
	public void error(String msg, EObject source) {
		error(msg, source, -1);
	}

	@Override
	public void error(String msg, EObject source, int feature) {
		failed  = true;
		String location = RoomNameProvider.getLocation(source);
		if (location==null || location.isEmpty())
			logger.logError(msg, source);
		else
			logger.logError(msg+" @ "+location, source);
	}

	@Override
	public boolean isFailed() {
		return failed;
	}

}
