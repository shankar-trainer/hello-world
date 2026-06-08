package com.example.accessingdatamysql.model;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

// This Interface is a costum validation of validate an Email 
// Annotated (used) in the Model "PersonEntity" and implemented in the Java file ValidEmailValidator
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = com.example.accessingdatamysql.model.ValidEmailValidator.class)
@Documented
public @interface ValidEmail {

	String message() default "Not a valid Email";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	int min() default 5;
	int max() default 25;
}
