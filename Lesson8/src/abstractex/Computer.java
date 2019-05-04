package abstractex;

public abstract class Computer {

	public abstract void Display();
	public abstract void Typing();
	public void turnOn()
	{
		System.out.println("전원을 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("전원을 끕니다.");
	}
}
