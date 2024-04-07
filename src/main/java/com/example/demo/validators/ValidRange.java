package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.io.Console;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {RangeValidator.class})
@Target({ElementType.TYPE, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidRange {
    
    String message() default "Inventory must be between Min and Max.";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
