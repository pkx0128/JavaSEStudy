package JavaLangDemo;

public class JavaLangDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		Integer[] someints = new Integer[1000]; 
		System.out.println("totalMemory is:"+rt.totalMemory());
		
		long mem1,mem2;
		mem1 = rt.freeMemory();
		System.out.println("freeMemory is:"+mem1);
		
		rt.gc();
		
		mem1 = rt.freeMemory();
		System.out.println("freeMemory is:"+mem1);
		
		for(int i=0; i<1000;i++) {
			someints[i]=new Integer(i);
		}
		mem2 = rt.freeMemory();
		System.out.println("freeMemory is:"+mem2);
		System.out.println("Memory use is :"+(mem1-mem2));
		
		for(int i=0;i<1000;i++) {
			someints[i]= null;
		}
		rt.gc();
		mem1 = rt.freeMemory();
		System.out.println("freeMemory is :"+mem1);
		
	}

}
