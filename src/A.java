import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
public static void main(String[] args){
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://pbs.clearhub.tv");
	driver.manage().window().maximize();
//	driver.manage().window().fullscreen(); --Unrecognized command
}
}
