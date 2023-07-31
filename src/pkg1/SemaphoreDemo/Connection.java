package src.pkg1.SemaphoreDemo;

import java.util.concurrent.Semaphore;

public class Connection {
    private static final Connection INSTANCE = new Connection();
    private int noOfConnections;

    private Connection() {
    }

    private final Semaphore semaphore = new Semaphore(10, true);

    public void connect() {
        try {
            semaphore.acquire();
            synchronized (this) {
                noOfConnections++;
                System.out.println("No of Connection :" + noOfConnections);
            }

            Thread.sleep(2000);

            synchronized (this) {
                noOfConnections--;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }

    }

    public static Connection getConnection() {
        return INSTANCE;
    }
}
