package pl.twojadruzyna.service.mailSender;

import org.springframework.stereotype.Component;

@Component
public class MockMailSender implements IMailSender {

    @Override
    public void sendEmail(String from, String subject, String content) {
        System.out.printf("Mail has been sent from %s \n with subject %s \n" +
                "and content %s", from, subject, content);
    }
}
