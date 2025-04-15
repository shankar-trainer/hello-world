package com.packt.legacy.unfavorable.construct.privates;

import com.packt.legacy.unfavorable.construct.constructor.GraphicalInterface;

public class PrivateMethod {
	
	public Object validate(Object arg) {
		if(arg == null) {
			showError("Null input");
		}
		
		return arg;
	}

	private void showError(String msg) {
		GraphicalInterface.showMessage(msg);
	}
}
