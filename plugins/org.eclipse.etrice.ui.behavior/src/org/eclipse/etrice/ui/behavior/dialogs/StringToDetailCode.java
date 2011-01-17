package org.eclipse.etrice.ui.behavior.dialogs;

import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.etrice.core.room.DetailCode;
import org.eclipse.etrice.core.room.RoomFactory;

public class StringToDetailCode extends Converter {

	public StringToDetailCode() {
		super(String.class, DetailCode.class);
	}

	@Override
	public Object convert(Object fromObject) {
		if (fromObject instanceof String) {
			String code = (String) fromObject;
			// TODOHRR: make work also for UNIX/Mac line endings
			String[] cmds = code.split("\r\n");
			DetailCode dc = RoomFactory.eINSTANCE.createDetailCode();
			for (int i = 0; i < cmds.length; i++) {
				dc.getCommands().add(cmds[i]);
			}
			// trim last command if empty
			if (cmds[cmds.length-1].isEmpty())
				dc.getCommands().remove(cmds.length-1);
			return dc;
		}
		return null;
	}

}
