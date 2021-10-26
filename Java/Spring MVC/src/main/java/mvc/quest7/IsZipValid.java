package mvc.quest7;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy= ZipValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsZipValid {
	
	String message() default "Zipcode does not belong to the city selected or it is invalid";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
