package g2z.springframework.SpringPracticeDI;

import g2z.springframework.SpringPracticeDI.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPracticeDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringPracticeDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
