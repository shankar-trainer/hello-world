package com.montran.bean;

public class Sweets {

	private int sweetsId;
	private String sweetsName;
	private float sweetsCost;

	public Sweets(int sweetsId, String sweetsName, float sweetsCost) {
		super();
		this.sweetsId = sweetsId;
		this.sweetsName = sweetsName;
		this.sweetsCost = sweetsCost;
	}

	@Override
	public String toString() {
		return "Sweets [sweetsId=" + sweetsId + ", sweetsName=" + sweetsName + ", sweetsCost=" + sweetsCost + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalise called ");
		super.finalize();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Sweets) {
			Sweets sweets = (Sweets) obj;
			if (this.sweetsId == sweets.sweetsId && this.sweetsName == sweets.sweetsName
					&& this.sweetsCost == sweets.sweetsCost)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Sweets sweets1 = new Sweets(7665677, "jalebi", 200);
		Sweets sweets2 = new Sweets(7665677, "jalebi", 200);

		System.out.println(sweets1);
		System.out.println(sweets2);

		System.out.println(sweets1.equals(sweets2));

		sweets1 = null;
		Runtime.getRuntime().gc();
		
		// Object obj=new Object();
		 //System.out.println(obj instanceof Sweets);
		 
	}

}
