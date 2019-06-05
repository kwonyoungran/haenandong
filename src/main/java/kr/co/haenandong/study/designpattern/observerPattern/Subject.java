package kr.co.haenandong.study.designpattern.observerPattern;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
