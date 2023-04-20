/**
 * 
 */
package com.example.test;
import java.util.*;
/**
 * @author CQ927DW
 *
 */
public class MemoryUsage {

	/**
	 * @param args
	 */
  //just performing the fibonacci calculation
	static long fibo(long l)
	{
		 return (long) ((Math.pow(((1+ Math.sqrt(5))/2),l)-(Math.pow(((1- Math.sqrt(5))/2),l)))/ Math.sqrt(5));
		//we use this formula instead of the normal because using the normal formula for big range increases the complexity due to recursive tree and pc can't calculate or it will take alot of time
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range's limit");
		System.out.println("Memory usage at start="+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())/(1000*1000)+"MB");
		long l=sc.nextLong();
		ArrayList<Long> list = new ArrayList<>();
		for(long i =0;i<=l;i++)
		{
		System.out.println(i);
		list.add(fibo(i));
		}
		System.out.println(list);
		System.out.println("Memory usage after="+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())/(1000*1000)+"MB");
		System.gc();//forcefully performing java garbage collection
		System.out.println("Memory usage after using GC="+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory())/(1000*1000)+"MB");
	}

	}


