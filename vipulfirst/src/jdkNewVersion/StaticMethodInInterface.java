package jdkNewVersion;

interface A{
	static void show() {
		System.out.println("I am Interface method");
	}
}
public class StaticMethodInInterface {

	public static void main(String[] args) {
		A.show();
	}

}
