package edu.norcocollege.cis18b.weekx.mini08;

public class LogAlertObserver implements AlertObserver {
    @Override
    public void onAlert(Alert alert) {
        // TODO: Print a log message.
        System.out.println("Log entry created for alert: " + alert.message());
    }
}
