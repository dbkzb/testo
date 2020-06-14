package it10;

public class Concurrency extends Thread implements Runnable{
	static final String HIP = "hip";
	static final String HOP = "hop";
	String word;
	int delay;
	public static void main(String[] args) throws Exception {
		Thread t=new Thread(new Concurrency(Concurrency.HIP, 100));
		Thread t2=new Concurrency(Concurrency.HOP, 500);
		t.start();
		t2.start();
		Thread.sleep(5000);
		t.interrupt();
	}
	public Concurrency(String word, int delay) {
		super();
		this.word = word;
		this.delay = delay;
	}
	@Override
	public void run() {
		try {
			while (true) {
				
				System.out.println(this.word+' ');
				try {
					Thread.sleep(this.delay);
				}catch(InterruptedException e) {
					System.out.println("Thread Exception");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("unexpected Error");
			e.getCause();
		}
		
	}
}
