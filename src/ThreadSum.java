/**
 * Main for starting multithread
 * @author Pawan Intawongsa
 *
 */
public class ThreadSum {
	public static void main(String[] args) {
		final int LIMIT = 100000000;
		Counter counter = new SynchronousCounter();
		runThreads(counter, LIMIT);
	}
	/**
	 * Start multithread 
	 * @param counter
	 * 				 is Counter we want to count
	 * @param limit
	 * 				is the limit of the Counter we want to count
	 */
	public static void runThreads(Counter counter,final int limit) {
		AddTask addTask = new AddTask(counter, limit);
		SubtractTask subTask = new SubtractTask(counter, limit);
		
		Thread thread1 = new Thread(addTask);
		Thread thread2 = new Thread(subTask);
		
		System.out.println("Starting Threads");
		long startTime = System.nanoTime();
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		}catch (InterruptedException e) {
			System.out.println("Threads interrupted");
		}
		double elapsed = 1.0E-9*(System.nanoTime() - startTime);
		System.out.printf("Count 1 to %,d in %.6f sec\n",limit,elapsed);
		
		System.out.printf("Counter total is %d\n",counter.get());
	}
}
