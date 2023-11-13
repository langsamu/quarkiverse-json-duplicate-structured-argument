# Quarkiverse Logging JSON: Property pollution reproducer



## To reproduce

```shell script
./mvnw verify
```

Look for the string `Something from resource` in log output.

## Details
The following code
https://github.com/langsamu/quarkiverse-json-duplicate-structured-argument/blob/14611a1146a05d95d147378958787249e7752f81/src/main/java/com/example/DefaultResource.java#L16-L28

produces the following log output which is illegal JSON due to duplicate property names:
```json
{
	"timestamp": "2023-11-13T16:46:28.178Z",
	"sequence":45,
	"loggerClassName": "org.jboss.logging.Logger",
	"loggerName": "com.example.DefaultResource",
	"level": "INFO",
	"message": "Something from resource",
	"threadName": "executor-thread-1",
	"threadId":100,
	"hostName": "circulationsolo",
	"processName": "JUnitStarter",
	"processId":10188,
	"timestamp": "timestamp from resource",
	"sequence": "sequence from resource",
	"loggerClassName": "loggerClassName from resource",
	"loggerName": "loggerName from resource",
	"level": "level from resource",
	"message": "message from resource",
	"threadName": "threadName from resource",
	"threadId": "threadId from resource",
	"hostName": "hostName from resource",
	"processName": "processName from resource",
	"processId": "processId from resource",
	"else": "else from resource"
}
```
