package AutomatedEmails;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class AutomatedEmails {

    public static void sendEmail() {
        // Sender's email and password
        final String username = "<SENDER EMAIL>"; // Update with your SMTP email
        final String password = "<SMTP PASSWORD>"; // Update with your SMTP password

        // Recipient's email address
        String to = "<RECIPIENT EMAIL>";

        // Set properties for the email session
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // Update with your SMTP server
        props.put("mail.smtp.port", "587"); // Update with your SMTP server port

        // Create a session with the provided properties
        Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

        try {
            // Create a MimeMessage object 
            Message message = new MimeMessage(session);

            // Set sender and recipient email addresses
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            // Set email subject and content
            message.setSubject("Subject");
            message.setText("Enter text here.");

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        sendEmail();
    }
}
