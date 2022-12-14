package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListAllItemRemovePage{
	WebDriver driver;
	public ListAllItemRemovePage(WebDriver driver) {
		this.driver=driver;
		
	}
	//list item data
		String item1="Lucy";
		String item2="Khusi";
		String item3="Gracy";
		
		//Define WebElements
				@FindBy(how = How.NAME,using="allbox") WebElement TOGGLEALL_ELEMENT;
				@FindBy(how = How.NAME,using="data") WebElement LIST_ITEM_ELEMENT;
				@FindBy(how = How.XPATH,using="/html/body/div[4]/input[2]") WebElement ADD_LIST_ITEM_ELEMENT;
				@FindBy(how = How.XPATH,using="/html/body/div[3]/input[1]") WebElement REMOVE_BUTTON_ELEMENT;

				public void addListItem() {
					LIST_ITEM_ELEMENT.sendKeys(item1);
					ADD_LIST_ITEM_ELEMENT.click();

					LIST_ITEM_ELEMENT.sendKeys(item2);
					ADD_LIST_ITEM_ELEMENT.click();
					LIST_ITEM_ELEMENT.sendKeys(item3);
					ADD_LIST_ITEM_ELEMENT.click();
				}

				public void clickToggleAll() {
					TOGGLEALL_ELEMENT.click();
				}
				public void removeAll() {
					REMOVE_BUTTON_ELEMENT.click();
				}
				public void validateRemoveAll() {
					Assert.assertFalse(driver.getPageSource().contains(item1));
					Assert.assertFalse(driver.getPageSource().contains(item2));
					Assert.assertFalse(driver.getPageSource().contains(item3));

				}
}
