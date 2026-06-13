package edu.norcocollege.cis18b.weekx.mini09;

public class LoggingAlertHandlerDecorator implements AlertHandler {
    private final AlertHandler wrapped;

    public LoggingAlertHandlerDecorator(AlertHandler wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void handle(Alert alert) {
        // TODO: Print a message before delegating.
        // TODO: Call the wrapped handler.
        // TODO: Print a message after delegating.
        System.out.println("LOG: Alert received");
        wrapped.handle(alert);
        System.out.println("LOG: Alert processed");
    }
}
