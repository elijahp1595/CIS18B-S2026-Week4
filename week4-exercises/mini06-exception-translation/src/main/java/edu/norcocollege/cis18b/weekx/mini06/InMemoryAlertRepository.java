package edu.norcocollege.cis18b.weekx.mini06;

public class InMemoryAlertRepository implements AlertRepository {
    @Override
    public void save(Alert alert) throws AlertStorageException {
        try {
            throw new RuntimeException("Database connection failed");
        } catch (RuntimeException ex) {
            throw new AlertStorageException("Failed to save alert", ex);
        }
    }
}
