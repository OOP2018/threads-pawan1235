
public class SubtractTask implements Runnable{
	private Counter couter;
	private int limit;
	public SubtractTask(Counter counter, int limit) {
		this.couter = counter;
		this.limit = limit;
	}
	
	public void run() {
		for(int i = 1 ;i <= limit ; i++) {
			this.couter.add(-i);
//			System.out.println("Done"+Thread.currentThread().getName());
		}
	}
}
