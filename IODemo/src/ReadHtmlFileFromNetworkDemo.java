import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ReadHtmlFileFromNetworkDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com");
			
			HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
			InputStream is = httpsURLConnection.getInputStream();
			
			int data = is.read();
			while (data != -1) {
				System.out.print((char) data);
				
				data = is.read();
			}
			
			is.close();
			httpsURLConnection.disconnect();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 
	}

}
