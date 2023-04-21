package ru.otus.spring.kafkasender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.otus.spring.kafkasender.service.HandleInOut;
import ru.otus.spring.kafkasender.service.KafkaSender;

@SpringBootApplication
public class KafkaSenderApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(KafkaSenderApplication.class, args);

		KafkaSender kafkaSender = ctx.getBean(KafkaSender.class);

		String msg = "hello kafka!!!";

		kafkaSender.send(msg);

		ctx.getBean(HandleInOut.class).outAndVk("Message has been sent: " + msg);
	}

}
