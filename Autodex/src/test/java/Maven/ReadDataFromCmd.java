package Maven;

import org.testng.annotations.Test;

public class ReadDataFromCmd {
	@Test
	public void readData() {
		String URL=System.getProperty("url");
		System.out.println(URL);
		String Browser=System.getProperty("Browser");
		System.out.println(Browser);
	 
	}

}
