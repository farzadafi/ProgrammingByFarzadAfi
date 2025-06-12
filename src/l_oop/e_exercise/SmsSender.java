package l_oop.e_exercise;

public class SmsSender implements MessageSender{

    @Override
    public void sendMessage(String receiver, String message) {
        System.out.println(message + " send to" + receiver + " with sms");
    }
}
