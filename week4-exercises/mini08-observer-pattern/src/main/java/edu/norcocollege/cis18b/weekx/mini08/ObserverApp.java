package edu.norcocollege.cis18b.weekx.mini08;

public class ObserverApp {
    public static void main(String[] args) {
        AlertService service = new AlertService();

        // TODO: Register at least two observers.
        // TODO: Process one alert.

        service.addObserver(new EmailAlertObserver());
        service.addObserver(new LogAlertObserver());

        Alert alert = new Alert(1, "Unauthorized login attempt", AlertLevel.CRITICAL);

        service.processAlert(alert);
    }
}
