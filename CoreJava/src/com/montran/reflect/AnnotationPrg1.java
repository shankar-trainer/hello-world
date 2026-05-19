package com.montran.reflect;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{
}



@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.METHOD})
@interface MyAnno{
	String str() default "Testing";
    int val() default 9000	;
}

//@MyAnno
public class AnnotationPrg1 {

	@MyAnno(str = "hello", val = 88)
	public static void show() throws NoSuchMethodException, SecurityException {
		AnnotationPrg1 prg1=new AnnotationPrg1();
		Class class1 = prg1.getClass();
		
		Method m=class1.getMethod("show");
		MyAnno annotation = m.getAnnotation(MyAnno.class);
		System.out.println(annotation.str()+"  "+annotation.val());
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		show();
	}
}
