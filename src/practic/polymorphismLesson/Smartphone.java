package practic.polymorphismLesson;

public class Smartphone extends MobilePhone{

    public Smartphone(String number) {
        super(number);
    }


    void makeCall (String targetNumber, String appName) {
        System.out.println("Звоним из приложения " + appName);
        System.out.println("Набираем номер " + targetNumber);
        System.out.println("Привет!");
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}
