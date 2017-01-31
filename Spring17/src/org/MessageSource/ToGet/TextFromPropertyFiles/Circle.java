package org.MessageSource.ToGet.TextFromPropertyFiles;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	private Point center;
	@Autowired
	private MessageSource messagesource;

	public Point getCenter() {
		return center;
	}
	public MessageSource getMessagesource() {
		return messagesource;
	}
	public void setMessagesource(MessageSource messagesource) {
		this.messagesource = messagesource;
	}
	@Resource(name="pointC")

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void drawing() {
		System.out.println(this.messagesource.getMessage("drawing.circle",null, "Default Greeting message", null));
		System.out.println(this.messagesource.getMessage("circle.print", new Object[]{center.getX(),center.getY()},"Default Point Message", null));
		System.out.println(this.messagesource.getMessage("greeting", null,"Default greeting", null));
		
	}
	@PostConstruct
	public void InitializingCircle(){
		System.out.println("Circle bean is initialized");
	}
	@PreDestroy
	public void DestroyingCircle(){
		System.out.println("Circle bean is destroyed");
	}

}
