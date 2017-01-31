package org.MessageSource.ToGet.TextFromPropertyFiles;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
		context.registerShutdownHook();
		Shape shape= (Shape) context.getBean("circle");
		shape.drawing();
		// AS we are printing the same message in Circle class so i will comment it here
		//System.out.println(context.getMessage("greeting", null,"default greeting", null));
		/* it takes four parameters, first is the name of the message,
		 *  2nd is the parameter messages, 3rd is the default message
		 * if the original message is not shown and 4th is the locale.*/

	}

}
