/**
 ******************************************************************************
 *
 * @file       uavobjecttemplate.cpp
 * @author     The OpenPilot Team, http://www.openpilot.org Copyright (C) 2010.
 * @brief      Template for an uavobject in java
 *             This is a autogenerated file!! Do not modify and expect a result.
 *             Settings for the @ref VtolPathFollower module
 *
 * @see        The GNU Public License (GPL) Version 3
 *
 *****************************************************************************/
/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package org.openpilot.uavtalk.uavobjects;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openpilot.uavtalk.UAVObjectManager;
import org.openpilot.uavtalk.UAVObject;
import org.openpilot.uavtalk.UAVDataObject;
import org.openpilot.uavtalk.UAVObjectField;

/**
Settings for the @ref VtolPathFollower module

generated from vtolpathfollowersettings.xml
 **/
public class VtolPathFollowerSettings extends UAVDataObject {

	public VtolPathFollowerSettings() {
		super(OBJID, ISSINGLEINST, ISSETTINGS, NAME);
		
		List<UAVObjectField> fields = new ArrayList<UAVObjectField>();
		

		List<String> HorizontalPosPIElemNames = new ArrayList<String>();
		HorizontalPosPIElemNames.add("Kp");
		HorizontalPosPIElemNames.add("Ki");
		HorizontalPosPIElemNames.add("ILimit");
		fields.add( new UAVObjectField("HorizontalPosPI", "(m/s)/m", UAVObjectField.FieldType.FLOAT32, HorizontalPosPIElemNames, null) );

		List<String> HorizontalVelPIDElemNames = new ArrayList<String>();
		HorizontalVelPIDElemNames.add("Kp");
		HorizontalVelPIDElemNames.add("Ki");
		HorizontalVelPIDElemNames.add("Kd");
		HorizontalVelPIDElemNames.add("ILimit");
		fields.add( new UAVObjectField("HorizontalVelPID", "deg/(m/s)", UAVObjectField.FieldType.FLOAT32, HorizontalVelPIDElemNames, null) );

		List<String> VerticalPosPIElemNames = new ArrayList<String>();
		VerticalPosPIElemNames.add("Kp");
		VerticalPosPIElemNames.add("Ki");
		VerticalPosPIElemNames.add("ILimit");
		fields.add( new UAVObjectField("VerticalPosPI", "", UAVObjectField.FieldType.FLOAT32, VerticalPosPIElemNames, null) );

		List<String> VerticalVelPIDElemNames = new ArrayList<String>();
		VerticalVelPIDElemNames.add("Kp");
		VerticalVelPIDElemNames.add("Ki");
		VerticalVelPIDElemNames.add("Kd");
		VerticalVelPIDElemNames.add("ILimit");
		fields.add( new UAVObjectField("VerticalVelPID", "", UAVObjectField.FieldType.FLOAT32, VerticalVelPIDElemNames, null) );

		List<String> VelocityFeedforwardElemNames = new ArrayList<String>();
		VelocityFeedforwardElemNames.add("0");
		fields.add( new UAVObjectField("VelocityFeedforward", "deg/(m/s)", UAVObjectField.FieldType.FLOAT32, VelocityFeedforwardElemNames, null) );

		List<String> MaxRollPitchElemNames = new ArrayList<String>();
		MaxRollPitchElemNames.add("0");
		fields.add( new UAVObjectField("MaxRollPitch", "deg", UAVObjectField.FieldType.FLOAT32, MaxRollPitchElemNames, null) );

		List<String> UpdatePeriodElemNames = new ArrayList<String>();
		UpdatePeriodElemNames.add("0");
		fields.add( new UAVObjectField("UpdatePeriod", "ms", UAVObjectField.FieldType.INT32, UpdatePeriodElemNames, null) );

		List<String> HorizontalVelMaxElemNames = new ArrayList<String>();
		HorizontalVelMaxElemNames.add("0");
		fields.add( new UAVObjectField("HorizontalVelMax", "m/s", UAVObjectField.FieldType.UINT16, HorizontalVelMaxElemNames, null) );

		List<String> VerticalVelMaxElemNames = new ArrayList<String>();
		VerticalVelMaxElemNames.add("0");
		fields.add( new UAVObjectField("VerticalVelMax", "m/s", UAVObjectField.FieldType.UINT16, VerticalVelMaxElemNames, null) );

		List<String> GuidanceModeElemNames = new ArrayList<String>();
		GuidanceModeElemNames.add("0");
		List<String> GuidanceModeEnumOptions = new ArrayList<String>();
		GuidanceModeEnumOptions.add("DUAL_LOOP");
		GuidanceModeEnumOptions.add("VELOCITY_CONTROL");
		fields.add( new UAVObjectField("GuidanceMode", "", UAVObjectField.FieldType.ENUM, GuidanceModeElemNames, GuidanceModeEnumOptions) );

		List<String> ThrottleControlElemNames = new ArrayList<String>();
		ThrottleControlElemNames.add("0");
		List<String> ThrottleControlEnumOptions = new ArrayList<String>();
		ThrottleControlEnumOptions.add("FALSE");
		ThrottleControlEnumOptions.add("TRUE");
		fields.add( new UAVObjectField("ThrottleControl", "", UAVObjectField.FieldType.ENUM, ThrottleControlElemNames, ThrottleControlEnumOptions) );

		List<String> VelocitySourceElemNames = new ArrayList<String>();
		VelocitySourceElemNames.add("0");
		List<String> VelocitySourceEnumOptions = new ArrayList<String>();
		VelocitySourceEnumOptions.add("EKF");
		VelocitySourceEnumOptions.add("NEDVEL");
		VelocitySourceEnumOptions.add("GPSPOS");
		fields.add( new UAVObjectField("VelocitySource", "", UAVObjectField.FieldType.ENUM, VelocitySourceElemNames, VelocitySourceEnumOptions) );

		List<String> PositionSourceElemNames = new ArrayList<String>();
		PositionSourceElemNames.add("0");
		List<String> PositionSourceEnumOptions = new ArrayList<String>();
		PositionSourceEnumOptions.add("EKF");
		PositionSourceEnumOptions.add("GPSPOS");
		fields.add( new UAVObjectField("PositionSource", "", UAVObjectField.FieldType.ENUM, PositionSourceElemNames, PositionSourceEnumOptions) );


		// Compute the number of bytes for this object
		int numBytes = 0;
		ListIterator<UAVObjectField> li = fields.listIterator();
		while(li.hasNext()) {
			numBytes += li.next().getNumBytes();
		}
		NUMBYTES = numBytes;

		// Initialize object
		initializeFields(fields, ByteBuffer.allocate(NUMBYTES), NUMBYTES);
		// Set the default field values
		setDefaultFieldValues();
		// Set the object description
		setDescription(DESCRIPTION);
	}

	/**
	 * Create a Metadata object filled with default values for this object
	 * @return Metadata object with default values
	 */
	public Metadata getDefaultMetadata() {
		UAVObject.Metadata metadata = new UAVObject.Metadata();
    	metadata.flags =
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_ACCESS_SHIFT |
		    UAVObject.Metadata.AccessModeNum(UAVObject.AccessMode.ACCESS_READWRITE) << UAVOBJ_GCS_ACCESS_SHIFT |
		    1 << UAVOBJ_TELEMETRY_ACKED_SHIFT |
		    1 << UAVOBJ_GCS_TELEMETRY_ACKED_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_ONCHANGE) << UAVOBJ_TELEMETRY_UPDATE_MODE_SHIFT |
		    UAVObject.Metadata.UpdateModeNum(UAVObject.UpdateMode.UPDATEMODE_ONCHANGE) << UAVOBJ_GCS_TELEMETRY_UPDATE_MODE_SHIFT;
    	metadata.flightTelemetryUpdatePeriod = 0;
    	metadata.gcsTelemetryUpdatePeriod = 0;
    	metadata.loggingUpdatePeriod = 0;
 
		return metadata;
	}

	/**
	 * Initialize object fields with the default values.
	 * If a default value is not specified the object fields
	 * will be initialized to zero.
	 */
	public void setDefaultFieldValues()
	{
		getField("HorizontalPosPI").setValue(1,0);
		getField("HorizontalPosPI").setValue(0,1);
		getField("HorizontalPosPI").setValue(0,2);
		getField("HorizontalVelPID").setValue(5,0);
		getField("HorizontalVelPID").setValue(0,1);
		getField("HorizontalVelPID").setValue(1,2);
		getField("HorizontalVelPID").setValue(0,3);
		getField("VerticalPosPI").setValue(0.1,0);
		getField("VerticalPosPI").setValue(0.001,1);
		getField("VerticalPosPI").setValue(200,2);
		getField("VerticalVelPID").setValue(0.1,0);
		getField("VerticalVelPID").setValue(0,1);
		getField("VerticalVelPID").setValue(0,2);
		getField("VerticalVelPID").setValue(0,3);
		getField("VelocityFeedforward").setValue(0);
		getField("MaxRollPitch").setValue(20);
		getField("UpdatePeriod").setValue(100);
		getField("HorizontalVelMax").setValue(10);
		getField("VerticalVelMax").setValue(1);
		getField("GuidanceMode").setValue("DUAL_LOOP");
		getField("ThrottleControl").setValue("FALSE");
		getField("VelocitySource").setValue("EKF");
		getField("PositionSource").setValue("EKF");

	}

	/**
	 * Create a clone of this object, a new instance ID must be specified.
	 * Do not use this function directly to create new instances, the
	 * UAVObjectManager should be used instead.
	 */
	public UAVDataObject clone(long instID) {
		// TODO: Need to get specific instance to clone
		try {
			VtolPathFollowerSettings obj = new VtolPathFollowerSettings();
			obj.initialize(instID, this.getMetaObject());
			return obj;
		} catch  (Exception e) {
			return null;
		}
	}

	/**
	 * Static function to retrieve an instance of the object.
	 */
	public VtolPathFollowerSettings GetInstance(UAVObjectManager objMngr, long instID)
	{
	    return (VtolPathFollowerSettings)(objMngr.getObject(VtolPathFollowerSettings.OBJID, instID));
	}

	// Constants
	protected static final long OBJID = 0x973991F6l;
	protected static final String NAME = "VtolPathFollowerSettings";
	protected static String DESCRIPTION = "Settings for the @ref VtolPathFollower module";
	protected static final boolean ISSINGLEINST = 1 > 0;
	protected static final boolean ISSETTINGS = 1 > 0;
	protected static int NUMBYTES = 0;


}
