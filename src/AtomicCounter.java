import java.util.concurrent.atomic.AtomicLong;
/**
 * Subclass of Counter using AtomicLong
 * @author Pawan Intawongsa
 *
 */
public class AtomicCounter extends Counter {
	private AtomicLong total;
	/**
	 * Initialize AtomicCounter
	 */
	public AtomicCounter() {
		total = new AtomicLong();
	}
	/**
	 * Add amount to it's parent total
	 */
	public void add(int amount) {
		total.getAndAdd(amount);
	}
	
	/**
	 * Return total
	 * @return total
	 */
	public long get() {
		return total.get();
	}
}
