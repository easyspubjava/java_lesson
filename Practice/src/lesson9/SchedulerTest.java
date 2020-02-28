package lesson9;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		
		Scheduler scheduler = null;
		
		scheduler = new RoundRobin();
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		System.out.println("==========================");
		scheduler = new LeastJob();
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		System.out.println("==========================");
		scheduler = new PriorityAllocation();
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		
	}
}
