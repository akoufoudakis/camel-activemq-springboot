package com.redhat.consulting.examples.camel.activemq.springboot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActivemqMessageRouter extends RouteBuilder {

    public void configure() throws Exception {
        from("jms:queue:queue.src").routeId("msg-route")
                .log("Message: ${body}")
                .to("jms:queue:queue.dest");
    }

}
