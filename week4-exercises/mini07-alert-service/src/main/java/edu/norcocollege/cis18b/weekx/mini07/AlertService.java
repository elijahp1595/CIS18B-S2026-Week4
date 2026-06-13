package edu.norcocollege.cis18b.weekx.mini07;

public class AlertService {
    private final AlertRepository repository;
    private final AlertValidator validator;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
        this.validator = new AlertValidator();
    }

    public void processAlert(Alert alert)
            throws InvalidAlertException, AlertStorageException, AlertProcessingException {
        try {
            validator.validate(alert);
            repository.save(alert);
        } catch (InvalidAlertException | AlertStorageException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new AlertProcessingException("Unexpected error while processing alert.", ex);
        }
    }
}