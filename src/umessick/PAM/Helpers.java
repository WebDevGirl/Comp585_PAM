/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umessick.PAM;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author uam65345
 */
public class Helpers {
    
    public static Date getDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }
    
}
