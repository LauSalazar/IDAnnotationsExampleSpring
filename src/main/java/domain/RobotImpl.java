package domain;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("robot")
public class RobotImpl implements Robot{
	
	@Autowired(required=true)
	@Qualifier("head")
	private Head head;
	
	@Autowired(required=true)
	@Qualifier("armConcret")
	private Arm leftArm;
	
	@Autowired(required=true)
	@Qualifier("armConcret")
	private Arm rigthArm;
	
	@Autowired(required=true)
	@Qualifier("leg")
	private Leg leftLeg;
	
	@Autowired(required=true)
	@Qualifier("leg")
	private Leg rigthLeg;
	
	@PostConstruct
	public void initTypes() {
		((ArmImpl) leftArm).setType("left");
		((ArmImpl) rigthArm).setType("rigth");
		((LegImpl) leftLeg).setType("left");
		((LegImpl) rigthLeg).setType("rigth");
		
	}
	
	public void move() {
		head.move();
		leftArm.move();
		rigthArm.move();
		leftLeg.move();
		rigthLeg.move();
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Arm getLeftArm() {
		return leftArm;
	}

	public void setLeftArm(Arm leftArm) {
		this.leftArm = leftArm;
	}

	public Arm getRigthArm() {
		return rigthArm;
	}

	public void setRigthArm(Arm rigthArm) {
		this.rigthArm = rigthArm;
	}

	public Leg getLeftLeg() {
		return leftLeg;
	}

	public void setLeftLeg(Leg leftLeg) {
		this.leftLeg = leftLeg;
	}

	public Leg getRigthLeg() {
		return rigthLeg;
	}

	public void setRigthLeg(Leg rigthLeg) {
		this.rigthLeg = rigthLeg;
	}
}
