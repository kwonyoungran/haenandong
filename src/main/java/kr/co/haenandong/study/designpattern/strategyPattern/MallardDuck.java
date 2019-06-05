package kr.co.haenandong.study.designpattern.strategyPattern;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	

}
