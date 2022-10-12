package com.vmware.springk8sdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.system.ApplicationPid;

@SpringBootApplication
public class SpringK8sDemoApplication {

	public static void main(String[] args) {
		var springApp = new SpringApplication(SpringK8sDemoApplication.class);
		springApp.addListeners(new ApplicationPidFileWriter());
		springApp.run(args);

	}

}
