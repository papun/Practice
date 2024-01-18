package src.synchroniseddemo1;

public class Client {
    public static void main(String[] args) {
        TicketSystem ts = new TicketSystem();
        Thread t1 = new Thread(ts);
        Thread t2 = new Thread(ts);
        Thread t3 = new Thread(ts);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class TicketSystem implements Runnable {
    static int i = 1, j = 2, k = 3;
    int tickets = 3;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("t1")) {
            bookTicket(name, i);
        } else if (name.equals("t2")) {
            bookTicket(name, j);
        } else {
            bookTicket(name, k);
        }
    }

    public synchronized void bookTicket(String name, int wantedTickets) {
        if (wantedTickets <= tickets) {
            System.out.println("Thread " + name + " booked " + wantedTickets + " tickets");
            tickets = tickets - wantedTickets;
        } else System.out.println("No More tickets to book");
    }
}
