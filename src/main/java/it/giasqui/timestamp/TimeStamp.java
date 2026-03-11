package it.giasqui.timestamp;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");

    public static void main(String[] args) {

        //method 1
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Method 1 - " + timestamp);

        //method 2 - via Date
        Date date = new Date();
        System.out.println("Method 2 - " + new Timestamp(date.getTime()));

        //method 3 - return number of milliseconds since January 1, 1970, 00:00:00 GMT
        System.out.println("Method 3 - " + timestamp.getTime());

        //method 4 - format timestamp
        System.out.println("Method 4 - " + sdf.format(timestamp));    
        
    }

    public static String timeStamp() {

    	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String timeStamp = sdf.format(timestamp);
        return timeStamp;
        
    }

    
}