package com.ddd.transportcontext.routes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.ddd.transportcontext.handler.BeltHandler;
import com.ddd.transportcontext.handler.TransportHandler;

@Configuration
public class TransportTrunckRouter {

	@Bean
	public RouterFunction<ServerResponse> route(TransportHandler greetingHandler) {
		return RouterFunctions.route(
				RequestPredicates.POST("/send").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
				greetingHandler::hello);
	}
	
	@Bean
	public RouterFunction<ServerResponse> routeBelt(BeltHandler greetingHandler) {
		return RouterFunctions.route(
				RequestPredicates.POST("/belt").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
				greetingHandler::hello);
	}
}
