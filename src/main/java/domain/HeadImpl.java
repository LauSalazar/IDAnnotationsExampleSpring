package domain;

import org.springframework.stereotype.Component;

@Component("head")
public class HeadImpl implements Head{

	public void move() {
		System.out.println("Moving head");
	}

}
