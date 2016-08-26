package afs.syed.java8.stream;

public class TimingUtils {

	private static final double ONE_BILLION  = 1_000_000_000;
	
	public static void timeOperation(Operation op){
		long start = System.nanoTime();
		op.runOperation();
		long end = System.nanoTime();
		
		double elapseTime = (end -start)/ONE_BILLION;
		
		System.out.printf( " Elapse Time:  %.3f Seconds. %n", elapseTime);
	}
}
