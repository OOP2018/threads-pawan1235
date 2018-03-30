import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * A subclass of counter using ReentrantLock
 * @author Pawan Intawongsa
 *
 */
public class CounterWithLock extends Counter {
	private Lock lock = new ReentrantLock();
	/**
	 * Lock before calling parent's add method and the unlock
	 */
	public void add(int amount) {
		try{
			lock.lock();
			super.add(amount);
		}finally {
			lock.unlock();
		}
	}
	
}
