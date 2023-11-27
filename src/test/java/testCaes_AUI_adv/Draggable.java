package testCaes_AUI_adv;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		//playwright declaration and creation
		Playwright playwright;
		playwright = Playwright.create();

		Browser browser;
		browser = playwright.chromium()
				.launch(new BrowserType.LaunchOptions().setHeadless(false).setExecutablePath(Paths.get(chromePath)));
		Page page;
		page = browser.newPage();
		page.navigate("https://jqueryui.com");		
		System.out.println(page.title());
		Thread.sleep(2000);
		page.locator("//a[text()='Selectable']").click();
		Thread.sleep(3000);
		//page.locator("//iframe[@class='demo-frame']").click();
//		page.locator("iframe").click();
//		//page.click("//iframe[@class='demo-frame']");
//		Thread.sleep(3000);
//		page.locator("//ol[@id='selectable']/li[1]").click();
//		//page.locator("").click();
		
		
//		page.close();
//		browser.close();
//		playwright.close();
		

	}

}
