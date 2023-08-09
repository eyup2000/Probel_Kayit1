package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Kurum_Birim_Page {
    public Kurum_Birim_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
