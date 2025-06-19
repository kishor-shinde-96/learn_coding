package FunctionalInterface;

@FunctionalInterface
 interface NotificationService {

    // abstract method for lambda   
    void send(String message);


    // default method
    default void log(String message){
        System.out.println("[LOG]" + message);
    }

    // static utitlity method
    static boolean validate(String message){
        return message != null && !message.trim().isEmpty();
    }

    
}

public class NotificationApp {

    public static void main(String[] args) {

        NotificationService emailNotification = message -> {
             if (NotificationService.validate(message)) {
                System.out.println("Sending Email: " + message);
            } else {
                System.out.println("Invalid message. Email not sent.");
            }
        };

        emailNotification.send("Welcome to the team!");
        emailNotification.log("Email was sent.");
    }

    


}
