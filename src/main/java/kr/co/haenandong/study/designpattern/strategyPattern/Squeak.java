package kr.co.haenandong.study.designpattern.strategyPattern;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("삑");
	}

}
