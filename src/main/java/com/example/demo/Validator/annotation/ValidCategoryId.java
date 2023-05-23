package com.example.demo.Validator.annotation;


import com.example.demo.Validator.ValidCategoryIdValidator;
import jakarta.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import jakarta.validation.Payload;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ValidCategoryIdValidator.class)
@Documented
public @interface ValidCategoryId {
    String message() default "Invalid Category ID";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
