package domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("leg")
public class LegImpl implements Leg{
	
	private String type;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void move() {
		System.out.println("Moving leg: "+type);
	}

}
