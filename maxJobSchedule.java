package commonQuestions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class maxJobSchedule {	
	//Similar dp on coins https://www.youtube.com/watch?v=Y0ZqKpToTic
	
	public static void main(String args[]) throws IOException{
		task t1 = new task(2,5,6);
		task t2 = new task(7,9,2);
		task t3 = new task(5,8,11);
		task t4 = new task(6,7,4);
		task t5 = new task(1,3,5);
		task t6 = new task(4,6,5);
		
		//Creating a list of tasks
		ArrayList<task> tasks = new ArrayList<task>();
		tasks.add(t1);
		tasks.add(t2);
		tasks.add(t3);
		tasks.add(t4);
		tasks.add(t5);
		tasks.add(t6);
		
		//printTasks(tasks);
		Collections.sort(tasks, new Comparator<task>() {
			
			public int compare(task tf, task ts) {
				if(tf.end < ts.end){
					return -1;
					
				} else if(tf.end > ts.end){
					return 1;
					
				} else if(tf.start < ts.start){
					return -1;
					
				} else {
				return 0;
			}}});	
		printTasks(tasks);
		System.out.println("----------------");
		//maxTasks(tasks);
		maxTasksWeighted(tasks);
		//printTasks(tasks);
	}
	
	//Print the list of tasks
	public static void printTasks(ArrayList<task> tasks){		
		for(task t : tasks){
			System.out.println(t.start+" "+t.end);
		}
	}
	
	//List maximum tasks that can be done
	//No weights
	//Greedy approach
	public static void maxTasks(ArrayList<task> tasks){

		ArrayList<task> finalTasks = new ArrayList<task>();
		finalTasks.add(tasks.get(0));
		for(int i=1; i<tasks.size() ; i++){
			boolean flag = false;
			for(int j=0; j<finalTasks.size(); j++) {
				if(overlaps(finalTasks.get(j), tasks.get(i))){
							flag = true;
				}
			}
			if(!flag){
				finalTasks.add(tasks.get(i));
			}
		}
		
		printTasks(finalTasks);
	}
	
	//Weighted
	//if(donotoverlp(i,j)) then profit[i] = max(profit[i], profit[j]+tasks.get(i).profit) 
	public static void maxTasksWeighted(ArrayList<task> tasks){
		int[] profit = new int[tasks.size()];
		
		for(int i=0; i<tasks.size(); i++) {
			profit[i] = tasks.get(i).profit;		
		}
		
		for(int i=1; i<tasks.size(); i++) {
			for(int j=0 ; j<i; j++) {
				if(overlaps(tasks.get(j), tasks.get(i))) {
					//continue
				} else {
						//Keep track of jobs added with max profit
						profit[i] = Math.max(profit[i],tasks.get(i).profit+profit[j]);
					}
				}
				
			}
		
		for(int i=0; i<profit.length; i++) {
			System.out.print(profit[i]+" ");
		}
	}
	
	//See if overlaps
	public static boolean overlaps(task tf, task ts){
		//int max = Math.max(tf.start, ts.start);
		if(ts.start >= tf.start && ts.start < ts.end) {
			//System.out.println("true");
			return true;			
		}else {
			//System.out.println("false");
			return false;
		}
	}

}


class task{
	
	int start;
	int end;
	int profit;
	
	public task(int s, int e, int p){
		this.start = s;
		this.end = e;	
		this.profit = p;
	}
}
