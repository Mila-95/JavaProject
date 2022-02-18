package Project;

public class NumberFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Swap 2 strings without a temporary variable
		System.out.println("-----------------");
		System.out.println("Before Swapping Strings");
		String w="Wow";
		String o="Ok";
		System.out.println(w+" "+o);
		System.out.println("After Swapping Strings");
		w=w+o;
		o=w.substring(0,w.length()-o.length());
		w=w.substring(o.length());
		System.out.println(w+" "+o);
	}
}