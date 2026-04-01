class GmailService implements MessageService {
    @Override
    public void send(String msg) {
        System.out.println("Gmail: " + msg);
    }
}
class NotificationApp {

    private MessageService service;

    public NotificationApp(MessageService service) {
        this.service = service;
    }

    public void notify(String message) {
        service.send(message);
    }
}

public class Main {
    public static void main(String[] args) {

        MessageService gmail = new GmailService();

        NotificationApp app = new NotificationApp(gmail);
        app.notify("Hello DIP!");

    }
}