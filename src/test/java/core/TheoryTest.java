package core;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest {

	@DataPoints
	public static String[] s_array() {
		return new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	                                 }

	@Theory
	public void test_01(String first, String second) {
		System.out.print(first + second +"\n");
		Assume.assumeThat(first + second, is("zz"));                                                                 
	}
	@Theory
	public void test_02(String first, String second, String third) {
		System.out.print(first + second + third + "\n");
		Assume.assumeThat(first + second + third, is("zzz"));                                                                 
	}@Theory
	public void test_03(String first, String second, String third, String forth) {
		System.out.print(first + second + third + forth + "\n");
		Assume.assumeThat(first + second + third + forth, is("zzzz"));                                                                 
	}
}
