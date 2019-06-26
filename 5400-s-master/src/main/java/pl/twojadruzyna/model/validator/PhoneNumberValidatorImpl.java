package pl.twojadruzyna.model.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidatorImpl implements ConstraintValidator<PhoneNumberValidator, String> {
    @Override
    public void initialize(PhoneNumberValidator constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (!s.isEmpty()) {
            return s.matches("^((\\+|00)48)?[0-9]{9}$") || s.matches("^((\\+|00)[0-9]{2})?[0-9]{9,13}$");
        }

        return true;
    }
}