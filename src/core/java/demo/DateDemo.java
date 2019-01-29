package core.java.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy hh:mm:ss a");
		System.out.println(sdf.format(d));
	}

}
