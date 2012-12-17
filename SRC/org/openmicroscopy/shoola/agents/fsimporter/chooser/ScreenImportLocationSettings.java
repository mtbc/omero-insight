/*
 *------------------------------------------------------------------------------
 *  Copyright (C) 2006-2012 University of Dundee & Open Microscopy Environment.
 *  All rights reserved.
 *
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *------------------------------------------------------------------------------
 */
package org.openmicroscopy.shoola.agents.fsimporter.chooser;

import org.openmicroscopy.shoola.agents.fsimporter.view.Importer;
import org.openmicroscopy.shoola.agents.util.browser.DataNode;

import pojos.GroupData;

/** 
 * Provides cohesion of the import settings when importing screen data.
 * @author Scott Littlewood, 
 * <a href="mailto:sylittlewood@dundee.ac.uk">sylittlewood@dundee.ac.uk</a>
 * @since Beta4.4
 */
public class ScreenImportLocationSettings extends ImportLocationSettings {

	/** Defines the parent screen where data will be imported */
	private DataNode importToScreen;

	/**
	 * Creates a DTO for collating Screen import settings.
	 * @param group The permission group to import data in to
	 * @param screen The screen to import data in to
	 */
	public ScreenImportLocationSettings(GroupData group, DataNode screen)
	{
		super(Importer.SCREEN_TYPE, group);
		
		importToScreen = screen;
	}
	
	/**
	 * @return The screen selected
	 */
	public DataNode getImportLocation() {
		return importToScreen;
	}

	/** Note: should NEVER be called on a screen import,
	 * implemented for initial work, look at refactoring afterwards */
	public DataNode getParentImportLocation() {
		return null; 
	}

	/**
	 * @return Always <false> for a screen as there is no parent object
	 */
	public boolean isParentFolderAsDataset() {
		return false;
	}

}
