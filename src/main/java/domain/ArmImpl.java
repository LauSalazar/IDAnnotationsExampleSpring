package domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("armConcret")
public class ArmImpl implements Arm{
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void move() {
		System.out.println("Moving arm: "+type);
		
	}

}
