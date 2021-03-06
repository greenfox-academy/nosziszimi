package date;

/**
 * Created by Nóra on 2017. 04. 20..
 */
public interface BirthdayCalculatorWithLocalDate <T>{
  T parseDate(String str);

  String printMonthAndDay(T date);

  boolean isAnniversaryToday(T date);

  int calculateAgeInYears(T birthday);

  int calculateDaysToNextAnniversary(T date);
}
