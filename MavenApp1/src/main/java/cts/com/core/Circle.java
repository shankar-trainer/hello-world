package cts.com.core;

public class Circle {

	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float circleArea() {
        return (float) (Math.PI*radius*radius);
	}    
	
	
	
}
