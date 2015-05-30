/*
 * Copyright 2013 Ambud Sharma
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.2
 */
package org.ambud.marauder.source.pcap.layer4;

import java.io.DataInput;
import java.io.IOException;

import org.ambud.marauder.source.pcap.layer3.NetworkLayer;

public interface TransportLayer {
	
	public static enum TRANSPORT_LAYER_TYPE {
		UDP,
		TCP;		
	}

	public short getSourcePort();
	public short getDestinationPort();
	public void decode(DataInput di, NetworkLayer parent) throws IOException;
	public NetworkLayer getParent();
	
}
