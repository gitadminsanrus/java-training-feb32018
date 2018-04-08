import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		
		String date = "2018-04-08 12:00:00 PM";
		DateFormat dateInstance = DateFormat.getDateInstance();
		
		try {
			Date parsedDate = dateInstance.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
