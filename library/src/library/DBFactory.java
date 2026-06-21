package library;

/**
 * Simple factory for obtaining the DB connectivity abstraction.
 * Centralises construction so switching implementations is easy.
 */
public class DBFactory {

    public static IDBConnectivity getDB() {
        return new dbConnectivity();
    }

}
