package com.ddd.sharedkernel.events;

public interface EventBus {

	<E extends ApplicationEvent> void publish(E event);
	
	<E extends ApplicationEvent> void consume(E event);

    <E extends ApplicationEvent> void subscribe(String eventType);

    <E extends ApplicationEvent> void unsubscribe(String eventType);
}
