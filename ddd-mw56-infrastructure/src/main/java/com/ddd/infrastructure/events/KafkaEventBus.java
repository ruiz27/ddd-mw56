package com.ddd.infrastructure.events;

import com.ddd.sharedkernel.events.ApplicationEvent;
import com.ddd.sharedkernel.events.EventBus;

/**
 * Implementation for kafka connect
 * @author sergio.ruiz
 *
 */
public class KafkaEventBus implements EventBus {

	@Override
	public <E extends ApplicationEvent> void publish(E event) {
		// there should be code here
		
	}

	@Override
	public <E extends ApplicationEvent> void subscribe(String eventType) {
		// there should be code here
		
	}

	@Override
	public <E extends ApplicationEvent> void unsubscribe(String eventType) {
		// there should be code here
		
	}

	@Override
	public <E extends ApplicationEvent> void consume(E event) {
		// there should be code here
		
	}

}
