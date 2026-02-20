package week3.day2;

public class Edge extends Chrome {
	public void takeSnap() {
		System.out.println("Taking Snap");
	}
	public void clearCokkies() {
		System.out.println("Clearing Cookies");
	}
	public static void main(String[] args) {
		Edge eg = new Edge();
		System.out.println(eg.browserName);
		System.out.println(eg.browserVersion);
		eg.takeSnap();
		eg.clearCokkies();
		eg.clearCache();
		eg.navigateBack();
		eg.openIncognito();
		eg.openURL();
		eg.closeBrowser();
	}
}
