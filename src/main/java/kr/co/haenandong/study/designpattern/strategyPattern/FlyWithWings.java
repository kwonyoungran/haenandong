package kr.co.haenandong.study.designpattern.strategyPattern;

public class FlyWithWings implements FlyBehavior{
	public void fly() {
		System.out.println("날고있어요");
	}
}
