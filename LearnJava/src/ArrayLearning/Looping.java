package ArrayLearning;

public class Looping {

	public static void main(String[] args) {
		 Thread thread1 = new NumberPrinter("Thread 1", 1, 50);
	        Thread thread2 = new NumberPrinter("Thread 2", 51, 100);

	        // Starting the threads
	        thread1.start();
	        thread2.start();
	    }
	}

	class NumberPrinter extends Thread {
	    private String threadName;
	    private int startNumber;
	    private int endNumber;

	    public NumberPrinter(String name, int start, int end) {
	        this.threadName = name;
	        this.startNumber = start;
	        this.endNumber = end;
	    }

	    @Override
	    public void run() {
	        System.out.println(threadName + " started.");

	        for (int i = startNumber; i <= endNumber; i++) {
	            System.out.println(threadName + ": " + i);
	            try {
	                // Adding a short delay for demonstration purposes
	                Thread.sleep(100);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println(threadName + " finished.");
	    }
	
	}
	

