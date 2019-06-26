package pl.twojadruzyna.model.validator;

import pl.twojadruzyna.api.ViewModel.EventViewModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EventValidatorImpl implements ConstraintValidator<EventValidator, EventViewModel> {
    @Override
    public boolean isValid(EventViewModel event, ConstraintValidatorContext constraintValidatorContext) {

        return areBothTeamUnique(event);
    }

    private boolean areBothTeamUnique(EventViewModel event) {

        return !event.getMyTeam().equals(event.getOppositeTeam());
    }

}
