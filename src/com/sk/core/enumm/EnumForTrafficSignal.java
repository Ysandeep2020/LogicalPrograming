package com.sk.core.enumm;

public class EnumForTrafficSignal {

	enum TraficSignal {
		RED("stop"), GREEN("go "), YELLOW("go slow");

		String action;

		// getter method
//		public String getAction() {
//			return action;
//		}

		private TraficSignal(String action) {
			this.action = action;
		}
	}

	public static void main(String[] args) {
		TraficSignal[] signals = TraficSignal.values();
		for (TraficSignal signal : signals) {
			System.out.println("Signal is " + signal.name() + " so Please " + signal.action);
		}

	}
}
