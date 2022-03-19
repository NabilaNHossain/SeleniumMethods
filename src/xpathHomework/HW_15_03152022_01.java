package xpathHomework;

public class HW_15_03152022_01 {
/*Tag with a single attribute:
 * formula: //html tag[@attribute name='attribute value']
 //select[@id='gh-cat']
//a[@class='is-active']
//label[@class='-oneX-dropdown__floatingLabel get-quote_select-product-label -oneX--floatUp']
//select[@id='popDropdown']
//input[@id='quote-main-zip-code-input']*/
	
/*Tag with inner text:
 * formula://html tag[text()='inner text value']
 * 	//a[text()='Track a claim']
 * //button[text()='Find an agent']
 * //a[text()='View more resources']
 * //a[text()='Go paperless']
 * //span[text()='Log in']
 */
	
	/*Tag with multiple attribute with or logic:
	 * formula: //html tag[@attribute name='attribute value' or  @attribute name='attribute value'] 
	 * //input[@id='aa-search-field' or @name='name="q']
	 * //a[@id='join-button' or @class='header-button']
	 * //a[@class='feature-call call-to-action' or href='/i18n/plan-travel/travel-deals-and-offers.jsp']
	 * //button[@id='plan-travel-expander' or href='#plan' ]
	 * //div[@class='nav-bar-menu nav-bar-menu-0 rotatesvg' or @aria-label='back to top']
	 */
	
	/*Tag with multiple attribute with and logic:
	 * formula://html tag[@attribute name='attribute value' and @attribute name='attribute value'] 
	 //a[@id='jq-flightStatus' and  @class='ui-tabs-anchor']
	 //input[@id='flightSearchForm.button.reSubmit' and @class='btn btn-fullWidth]
	//a[@class='js-dropdown-trigger' and @href='#']
	//a[@id='linkRebookTrip' and @class='btn-link btn-blue']
	//a[@class='navigation__item__title' and @href='https://www.cmcsa.com/investors']
	 */
	
	/*Tag with inner text using contains:
	 * formula://html tag[contains(text(),'inner text partial or complete value') 
	 * //p[contains(text(),'The CDC recommends a single booster dose for anyone 12 and')]
	 * //p[contains(text(),'Pfizer’s da')]
	 * //div[contains (text(),'Select your region above for local information.')]
	 * //h1[contains(text(),' Disc')]    
	 * //p[contains(text(),'You can')]
	  */
	
	/*Tag with attribute and using contains:
	 * formula://html tag[contains(@attribute,'attribute value')] 
	 * //a[contains(@class,'textual-display fake-btn fake-btn--secondary transparent')]
	 * //h1[contains(@class,'textual-display sell-home__page-ti')]
	 * //section[contains(@id,'text_cards_v2_1')]
	 * //a[contains(@id,'flex_ad_dedkh0bussj')]
	 * //a[contains(@id,'flex_ad_ncysui659')]
	 */
	
	/* Normalize-space:
	 * formula://html tag[normalize-space(text())='attribute value']
	 * //button[normalize-space(text())='Next article']
	 * //a[normalize-space(text())='Browse the Drug Encyclopedia']
	 * //a[normalize-space(text())='Browse the Health Encyclopedia']
	 *(//a[normalize-space(text())='Find a doctor or location'])[2]
	 *(//a[normalize-space(text())='Shop plans'])[2]
	 */
 
	/*Starts with text:
	 * formula://html tag[starts-with(text(),'attribute value')]
	 * //div[starts-with(text(),'A bitt')]
	 * //div[starts-with(text(),'Ayanna Lloy')]
	 * //p[starts-with(text(),'Entry restrictions and COVID-19 travel requirements for countries around the world.')]
	 * //a[starts-with(text(),'Travel flexibility')]
	 * //p[starts-with(text(),'Book q')]
	 * */
	
	/*Starts with attribute:
	 * formula://html tag[starts-with(@attributes,'attribute value']
	 * //a[starts-with(@class,'btn-link btn-blue full')]
	 * //a[starts-with(@id,'linkC')]
	 * //a[starts-with(@id,'log-')]
	 * (//a[starts-with(@id,'join-button')])[2]
	 * //button[starts-with(@id,'t')]
	 * */
}
