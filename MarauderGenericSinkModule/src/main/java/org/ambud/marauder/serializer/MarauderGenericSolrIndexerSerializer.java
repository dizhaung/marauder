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
package org.ambud.marauder.serializer;

import org.ambud.marauder.sink.MarauderHBaseSink;
import org.apache.flume.Event;
import org.apache.solr.common.SolrInputDocument;

public class MarauderGenericSolrIndexerSerializer extends
		MarauderBaseSolrIndexerSerializer {

	public MarauderGenericSolrIndexerSerializer(MarauderHBaseSink parentSink, int windowSize) {
		super(parentSink, windowSize);
	}

	@Override
	protected void addAdditionalIndices(SolrInputDocument doc, Event event)
			throws EventProcessingException {
	}

}
