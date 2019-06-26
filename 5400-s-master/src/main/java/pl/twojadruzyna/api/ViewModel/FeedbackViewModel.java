package pl.twojadruzyna.api.ViewModel;

import lombok.Data;
import pl.twojadruzyna.model.validator.PhoneNumberValidator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
public class FeedbackViewModel {
    @NotEmpty
    private String author;
    @Email
    private String email;
    @PhoneNumberValidator
    private String phoneNumber;
    @NotBlank
    private String content;

}
