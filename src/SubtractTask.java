/**
 * Subtract number form Counter
 * @author Pawan Intawongsa
 *
 */
public class SubtractTask implements Runnable{
	private Counter couter;
	private int limit;
	/**
	 * Initialize SubtractTask
	 * @param counter
	 * 				 is Counter we want to subtract
	 * @param limit
	 * 				is limit of number we want to subtract
	 */
	public SubtractTask(Counter counter, int limit) {
		this.couter = counter;
		this.limit = limit;
	}
	
	/**
	 * Subtract from 1 to k from this counter
	 */
	public void run() {
		for(int i = 1 ;i <= limit ; i++) {
			this.couter.add(-i);
//			System.out.println("Done"+Thread.currentThread().getName());
		}
	}
}
