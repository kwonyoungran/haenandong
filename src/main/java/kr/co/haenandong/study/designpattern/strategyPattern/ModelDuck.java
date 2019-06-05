package kr.co.haenandong.study.designpattern.strategyPattern;

public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("저는 모형 오리입니다.");
	}
	
	
}
