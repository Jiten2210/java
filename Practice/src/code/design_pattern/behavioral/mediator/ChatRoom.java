package code.design_pattern.behavioral.mediator;

import java.util.Date;

public interface ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
