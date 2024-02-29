import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS1 {

	public void doThis() {
		System.out.println("I am here");
	}
	
	@BeforeMethod
	public void beforeRun() {
		System.out.println("Run me first");
		System.out.println("Run me second");
		System.out.println("Run me third");
	}
	
	@AfterMethod
	public void afterRun() {
		System.out.println("Run me last");
		System.out.println("Run me third");
		System.out.println("Run me third");
		System.out.println("Run me third");
	}
}
