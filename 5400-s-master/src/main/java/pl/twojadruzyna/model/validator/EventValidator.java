package pl.twojadruzyna.model.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = EventValidatorImpl.class)
@Target({TYPE, METHOD, FIELD, CONSTRUCTOR, PARAMETER, ANNOTATION_TYPE})
@Retention(RUNTIME)
public @interface EventValidator  {
    String message() default "MyTeam and oppositeTeam are not unique";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

