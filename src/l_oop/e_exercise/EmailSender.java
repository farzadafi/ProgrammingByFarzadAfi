package l_oop.e_exercise;

public class EmailSender implements MessageSender{

    @Override
    public void sendMessage(String receiver, String message) {
        System.out.println(message + " send to" + receiver + " with email");
    }
}
