package l_oop.e_exercise;

public class WhatsAppSender implements MessageSender, Loggable{

    @Override
    public void sendMessage(String receiver, String message) {
        System.out.println(message + " send to" + receiver + " with whats app");
    }

    @Override
    public void log() {
        System.out.println("whats app log :)");
    }
}
