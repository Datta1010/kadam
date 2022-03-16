package Com.Utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Com.BaseLayer.BaseClass;

public class ActionsClass extends BaseClass {

	public static Actions action;

	public static void rightclick(WebElement wb) {

		action = new Actions(driver);
		action.contextClick(wb).build().perform();
	}

	public static void DoubleClick(WebElement wb) {
		action.doubleClick(wb).build().perform();

	}

	public static void DragAndDrop(WebElement src, WebElement target) {
		action.dragAndDrop(src, target).build().perform();
	}

	public static void moverToElement(WebElement wb) {
		action.moveToElement(wb).build().perform();
	}

	public static void release(WebElement wb) {
		action.release(wb).build().perform();
	}

	public static void moveDoun(WebElement wb) {
		action.click(wb).keyDown(Keys.SHIFT).sendKeys("selenium testing").build().perform();
	}

	public static void moveToEnd() {
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	}

}
