//package Myhooks;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.Scenario;
//
//public class AmazonHooks {
//	@Before(order=2)
//	public void setup_url() {
//		System.out.println("launch amazon url");
//	}
//	@Before(order=1)
//	public void setup_browser(Scenario sc) {
//		System.out.println("launch chrome browser");
//		System.out.println(sc.getName());
//	}
//	@After(order=2)
//	public void logout_app(Scenario sc) {
//		System.out.println("logout from the applicaton");
//		System.out.println(sc.getName());
//
//	}
//	@After(order=1)
//	public void teardown_browser() {
//		System.out.println("close the browser");
//	}
//	@BeforeStep
//	public void takescreenshot() {
//		System.out.println("take the screenshot");
//	}
//	@AfterStep
//	public void refreshpage() {
//		System.out.println("refresh the page");
//	}
//
//}
