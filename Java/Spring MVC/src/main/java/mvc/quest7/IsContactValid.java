package mvc.quest7;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy= ContactValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsContactValid {
	
	String message() default "Contact should be numeric and exactly 10 digits";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
