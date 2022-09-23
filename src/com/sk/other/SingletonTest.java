package com.sk.other;

class MyRunning implements Cloneable {

	private static MyRunning myRunning = null;
	public static Object get;

	private MyRunning() throws Exception {
		if (myRunning != null) {
			throw new Exception("Object already created ");
		}
	}

	public static MyRunning getMyRunning() throws Exception {
		// make Thead safe
		if (myRunning == null)
			return myRunning = new MyRunning();
		else
			return myRunning;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return myRunning;
	}

}

public class SingletonTest {

	public static void main(String[] args) throws Exception {
		MyRunning obj1 = MyRunning.getMyRunning();
		MyRunning obj2 = MyRunning.getMyRunning();

		System.out.println(obj1.hashCode() + ": " + obj2.hashCode());
	}
}
