

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TutorialListenerContainer {
	public static void main(String[] args) {
		//This will  load the our listener Testing
		ApplicationContext c1 = new ClassPathXmlApplicationContext("Rabbt-listener-contet.xml");
		
	}
}
