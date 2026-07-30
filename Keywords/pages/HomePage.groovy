package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import components.HeaderComponent
import components.FooterComponent
import components.SidebarComponent


public class HomePage {
	
	HeaderComponent header = new HeaderComponent()
	FooterComponent footer = new FooterComponent()
	SidebarComponent sidebar = new SidebarComponent()
}
