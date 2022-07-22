//Create 1 thread that find sum of 1 to 100 and print sum. 
//create 2 thread 1st thread find sum of 1 to 50 and 2nd thread find sum of 51 to 100
//once both the thread find sum then print final sum. 
package task17;

public class ThreadTask1 extends Thread {
	int begin,end;
	static int sum;
	
	
	public ThreadTask1(int begin,int end) {
	this.begin = begin;
	this.end = end;
	this.sum = 0;
	}
	 
	
	// we have 3 thread 
	//	t  tt   main
	public static void main(String[] args) throws InterruptedException {
		ThreadTask1 t1 = new ThreadTask1(1, 50);
		ThreadTask1 t2 = new ThreadTask1(51, 100);
		Thread t = new Thread(t1);
		Thread tt = new Thread(t2);
		t.setPriority(Thread.MAX_PRIORITY);  // set priority for thread and write own logic
		t.join(); // 1st run t thread and all thread are join back side t thread
		t1.start();
		Thread.sleep(500); // sleep main thread
		Thread.yield();
		t2.start();

		int t3 = t1.sum()+t2.sum();
		System.out.println(t3);
	}
	
	
	public void run() {
		for(int i=begin;i<=end;i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
	public int sum() {
		return sum;
	}

}
