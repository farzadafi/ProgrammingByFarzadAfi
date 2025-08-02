package l_oop.e_exercise;

public class Main {
    public static void main(String[] args) {
        MessageSender whatsAppSender = new WhatsAppSender();
        messageSender(whatsAppSender, "ali", "test");
        System.out.println();

        MessageSender emailMessageSender = new EmailSender();
        messageSender(emailMessageSender, "farzad@gmail.com", "test1");
    }

    private static void messageSender(MessageSender messageSender,
                                      String to,
                                      String message) {
        messageSender.sendMessage(to, message);
    }
}
