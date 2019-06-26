package pl.twojadruzyna.service.mailSender;

public interface IMailSender {
    void sendEmail(String from, String subject, String content);
}
