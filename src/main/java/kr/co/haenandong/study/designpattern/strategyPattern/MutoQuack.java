package kr.co.haenandong.study.designpattern.strategyPattern;

public class MutoQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<<조용~>>");
	}

}
