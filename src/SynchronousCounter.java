/**
 * Subclass of counter with synchronize method
 * @author Pawan Intawongsa
 *
 */
public class SynchronousCounter  extends Counter{
	@Override
	public synchronized void add(int amount) {
		super.total += amount;
		
	}
}
