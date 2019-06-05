package kr.co.haenandong.study.designpattern.strategyPattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyVehavior(new FlyRocketPowerd());
		model.performFly();
	
	}
	

}
