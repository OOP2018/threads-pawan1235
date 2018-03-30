/**
 * A class for adding number to Counter
 * 
 * @author Pawan Intawongsa
 *
 */
public class AddTask implements Runnable{
	
	private Counter counter;
	private int limit;
	/**
	 * Initialize AddTask
	 * 
	 * @param counter
	 * 				 is Counter we want to count
	 * @param limit
	 * 				is limit of number we want to add
	 */
	public AddTask(Counter counter,int limit) {
		this.counter = counter;
		this.limit = limit;
	}
	/**
	 * Add from 1 to k into this counter
	 */
	public void run() {
		for(int k = 1; k <= limit; k++) {
			this.counter.add(k);
//			System.out.println("Done"+Thread.currentThread().getName());
		}
	}
}
