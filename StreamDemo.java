package afs.syed.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author TSyed
 *
 */
public class StreamDemo {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a1", "a2", "b1", "b2", "c3", "c2", "d3", "d4", "d2");
		
		myList.stream().forEach(s->System.out.println(s));
		System.out.println("--------------------------");
		
		myList.stream().findFirst().ifPresent(System.out::println);
		
		
//		myList.stream().forEach(System.out::println);
//		
//		
//		myList.stream().filter(s->s.contains("1")).forEach(System.out::println);
//		
//		myList.stream().filter(s->s.startsWith("d")).map(String::toUpperCase).sorted().forEach(System.out::println);
//		
//		
//		
//		
//		
//		for(int i=3; i<8; i++) {
//		      int size = (int)Math.pow(10, i);
//		      System.out.printf("Sorting array of length %,d.%n", size);
//		      TimingUtils.timeOperation(()->sortArray(size));
//		    }
	}
	/**
	 * 
	 * @param  length
	 * @return Array Of Double
	 */
	public static double[] randomNums(int length) {
	    double[] nums = new double[length];
	    for(int i=0; i<length; i++) {
	      nums[i] = Math.random();
	    }
	    return(nums);
	  }
	
	/**
	 * 
	 * @param length
	 */
	public static void sortArray(int length) {
	    double[] nums = randomNums(length);
	    Arrays.sort(nums);
	  }

}
