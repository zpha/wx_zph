package org.zpha.commons.processors;

import org.zpha.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {

	public void onMessage(EventInMessage msg);
}

