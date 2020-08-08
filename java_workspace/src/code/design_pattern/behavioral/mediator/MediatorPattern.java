package code.design_pattern.behavioral.mediator;

public class MediatorPattern {
    public static void main(String[] args) {
        User user = new User("Jitendra");
        User user1 = new User("Tanuja");

        user.sendMessage("Hi! Tanuja!");
        user1.sendMessage("Hello! Jitendra!");
    }
}
