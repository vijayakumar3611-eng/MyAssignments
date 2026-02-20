package week3.day2;

public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println("opening incognito");
	}
	public void clearCache() {
		System.out.println("clearing cache");

	}
	public static void main (String[] args) {
		Chrome ch = new Chrome();
		ch.openURL();
		ch.clearCache();
		ch.openIncognito();
		ch.closeBrowser();
		ch.navigateBack();
	}
}
