package thread;

class Film implements Runnable {

	Thread thread;

	public Film(String name) {

		this.thread = new Thread(this, name);
	}

	public void start() {

		this.thread.start();
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + " zum " + i + ". Mal");

			try {

				Thread.sleep((int) (Math.random() * 1000));

			} catch (InterruptedException e) {
			}
		}

		System.out.println(Thread.currentThread().getName() + " fertig!");
	}
}
