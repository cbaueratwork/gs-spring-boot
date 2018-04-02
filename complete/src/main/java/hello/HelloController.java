package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
//	Logging logging = LoggingOptions.getDefaultInstance().getService();
//
//	String logName = "my-log";
//	String text = "The logging worked through Stackdriver!";
//	LogEntry entry = LogEntry.newBuilder(StringPayload.of(text))
//		.setSeverity(Severity.ERROR)
//		.setLogName(logName)
//		.setResource(MonitoredResource.newBuilder("global").build())
//		.build();
//
//	logging.write(Collections.singleton(entry));
//	System.out.printf("This is a log standard out");

        return "Greetings from Spring Boot!";
    }
    
}
