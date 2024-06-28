package stringBufferStringBuilder;

public class StirngBufferBuilderDelete {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Good Morning India");
		System.out.println("Before deleting value: "+sb);
		sb.delete(5, 12);
		System.out.println("After deleting value: "+sb);
	}

}
