package com.example;

import static io.quarkiverse.loggingjson.providers.KeyValueStructuredArgument.kv;

import io.quarkus.logging.Log;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/")
class DefaultResource {
    @GET
    @Produces
    public String get() {
        Log.infov("Something from resource",
                kv("timestamp", "timestamp from resource"),
                kv("sequence", "sequence from resource"),
                kv("loggerClassName", "loggerClassName from resource"),
                kv("loggerName", "loggerName from resource"),
                kv("level", "level from resource"),
                kv("message", "message from resource"),
                kv("threadName", "threadName from resource"),
                kv("threadId", "threadId from resource"),
                kv("hostName", "hostName from resource"),
                kv("processName", "processName from resource"),
                kv("processId", "processId from resource"),
                kv("else", "else from resource"));

        return "Sent something to logs";
    }
}
