package pkg;
import java.util.Queue;
import java.util.LinkedList;

public class MainProducerConsumerDemo {
	private static final Queue<Integer> buffer = new LinkedList();
//	public static int items=0;
	private static int itemCount=0;
	public static final int bufferSize=1;
	public static final int maxItems=15;
	
	
	public static class Producer implements Runnable{
		public void run() {
			while(true) {
				synchronized(buffer) 
				{
					while(buffer.size()==bufferSize) {
						try 
						{
							Thread.sleep(1500);
							buffer.wait();
						}
						catch(InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}
					int item = itemCount++;
					buffer.add(item);
					System.out.println("Produced "+ item);
					buffer.notifyAll();
					if(item==maxItems) {
						break;
					}
				}
			}
		}	
	}

	
	public static class Consumer implements Runnable{
		public void run() {
			while(true) {
				synchronized(buffer) {
					while(buffer.isEmpty()) {

							try 
							{
								Thread.sleep(500);
								buffer.wait();
							}
							catch(InterruptedException e) {
								Thread.currentThread().interrupt();
							}
						
					}
					int item = buffer.poll();
					System.out.println("Consumed "+ item);
					buffer.notifyAll();
					if(item==maxItems) {
						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread pd = new Thread(new Producer());
		Thread cd = new Thread(new Consumer());
		pd.start();
		cd.start();
		try 
		{
			pd.join();
			cd.join();
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		
	}
	
}
