package id.co.askrindo.kmkpen.utils;

import org.joda.time.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by User on 16/01/2018.
 */
public class DateUtils {
    private DateUtils() {
    }

    public static String format(Date date, String pattern){
        DateFormat df = new SimpleDateFormat(pattern);
        return df.format(date);
    }

    public static String format(Date date, String pattern, Locale locale){
        DateFormat df = new SimpleDateFormat(pattern, locale);
        return df.format(date);
    }


    public static Date parse(String dateStr, String pattern) throws ParseException {
        DateFormat df = new SimpleDateFormat(pattern);
        Date result = null;

        result = df.parse(dateStr);

        return result;
    }

    public static Date parse(String dateStr, String pattern, Locale locale){
        DateFormat df = new SimpleDateFormat(pattern, locale);
        Date result = null;

        try {
            result = df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static String formatDateRegister(Date date){
        return format(date, "yyyyMM");
    }

    public static String formatDateBri(Date date){
        return format(date, "yyyyMMdd");
    }

    public static Date parseDateBri(String dateStr) throws ParseException {
        return parse(dateStr, "yyyyMMdd");
    }

    public static String formatDateMandiri(Date date){
        return format(date, "dd/MM/yyyy");
    }

    public static Date parseDateMandiri(String dateStr) throws ParseException {
        return parse(dateStr, "dd/MM/yyyy");
    }

    public static String generateTahun(){

        Calendar dateNow = Calendar.getInstance();

        Integer tempTahun = dateNow.get(Calendar.YEAR);
        String tahun = tempTahun.toString();

        return tahun;
    }

    public static Date getNow(){
        DateTime dateTime = new DateTime();
        return dateTime.toDate();
    }

    public static String get2DigitYear(Date date){
        return  format(date, "yy");
    }

    public static int getDays(Date start, Date end){
        DateTime awal = new DateTime(start);
        DateTime akhir = new DateTime(end);

        int days = Days.daysBetween(awal, akhir).getDays();

        return days;
    }

    public static int getNowMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return  calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * mencari selisih jumlah hari kalendar antara tanggal awal dan tanggal akhir
     * @param start
     * @param end
     * @return
     */
    public static int getDaysBetween(Date start, Date end){
        if (start == null || end == null) return 0;
        LocalDate dateStart = LocalDate.fromDateFields(start);
        LocalDate dateEnd = LocalDate.fromDateFields(end);

        DateTime start1 = new DateTime(dateStart.getYear(), dateStart.getMonthOfYear(), dateStart.getDayOfMonth(), 0, 0, 0, 0);
        DateTime end1 = new DateTime(dateEnd.getYear(),dateEnd.getMonthOfYear(),dateEnd.getDayOfMonth(), 0, 0, 0, 0);

        return Days.daysBetween(start1,end1).getDays();
    }

    /**
     * mencari selisih jumlah tahun antar tanggal awal dan tanggal akhir
     * @param start
     * @param end
     * @return
     */
    public static int getYearsBetween(Date start, Date end){
        if (start == null || end == null) return 0;
        LocalDate dateStart = LocalDate.fromDateFields(start);
        LocalDate dateEnd = LocalDate.fromDateFields(end);

        DateTime start1 = new DateTime(dateStart.getYear(), dateStart.getMonthOfYear(), dateStart.getDayOfMonth(), 0, 0, 0, 0);
        DateTime end1 = new DateTime(dateEnd.getYear(),dateEnd.getMonthOfYear(),dateEnd.getDayOfMonth(), 0, 0, 0, 0);

        return Years.yearsBetween(start1, end1).getYears();
    }

    /**
     * mencari selisih jumlah bulan antar tanggal awal dan tanggal akhir
     * @param start
     * @param end
     * @return
     */
    public static int getMonthsBetween(Date start, Date end){
        if (start == null || end == null) return 0;
        LocalDate dateStart = LocalDate.fromDateFields(start);
        LocalDate dateEnd = LocalDate.fromDateFields(end);

        DateTime start1 = new DateTime(dateStart.getYear(), dateStart.getMonthOfYear(), dateStart.getDayOfMonth(), 0, 0, 0, 0);
        DateTime end1 = new DateTime(dateEnd.getYear(),dateEnd.getMonthOfYear(),dateEnd.getDayOfMonth(), 0, 0, 0, 0);

        return Months.monthsBetween(start1, end1).getMonths();
    }

    /**
     * mencari selisih jumlah tahun dan jumlah hari antara tanggal awal dan tanggal akhir
     * @param start
     * @param end
     * @return Integer[], index 0 is jmlTahun, index 1 is sisaJmlHari
     */
    public static Integer[] yearsAndDaysBetween(Date start, Date end){

        int jmlTahun = 0; int sisaJmlHari = 0;
        Calendar tglMulaiProrata = Calendar.getInstance();
        if (end.after(start)) {
            jmlTahun = getYearsBetween(start, end);
            tglMulaiProrata.setTime(start);
            tglMulaiProrata.set(Calendar.YEAR, (start.getYear()+1900) + jmlTahun);
            sisaJmlHari = getDaysBetween(tglMulaiProrata.getTime(), end);
            if (sisaJmlHari<0)
                sisaJmlHari = 0;
        }
        return new Integer[]{jmlTahun,sisaJmlHari};
    }

    /**
     * apakah tanggal awal setelah tanggal akhir
     * @param start
     * @param end
     * @return
     */
    public static Boolean isAfter(Date start, Date end){
        if (start == null || end == null) return Boolean.FALSE;
        LocalDate dateStart = LocalDate.fromDateFields(start);
        LocalDate dateEnd = LocalDate.fromDateFields(end);

        DateTime start1 = new DateTime(dateStart.getYear(), dateStart.getMonthOfYear(), dateStart.getDayOfMonth(), 0, 0, 0, 0);
        DateTime end1 = new DateTime(dateEnd.getYear(),dateEnd.getMonthOfYear(),dateEnd.getDayOfMonth(), 0, 0, 0, 0);

        return start1.isAfter(end1);
    }

    /**
     * apakah tanggal awal sebelum tanggal akhir
     * @param start
     * @param end
     * @return
     */
    public static Boolean isBefore(Date start, Date end){
        if (start == null || end == null) return Boolean.FALSE;
        LocalDate dateStart = LocalDate.fromDateFields(start);
        LocalDate dateEnd = LocalDate.fromDateFields(end);

        DateTime start1 = new DateTime(dateStart.getYear(), dateStart.getMonthOfYear(), dateStart.getDayOfMonth(), 0, 0, 0, 0);
        DateTime end1 = new DateTime(dateEnd.getYear(),dateEnd.getMonthOfYear(),dateEnd.getDayOfMonth(), 0, 0, 0, 0);

        return start1.isBefore(end1);
    }

    public static Integer getYear(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar.get(Calendar.YEAR);
    }

    public static Integer getMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar.get(Calendar.MONTH) + 1;
    }

	public static Date parseTahunPk(String tahun) throws ParseException {

        String yyyy = tahun;
        String mm = String.format("%02d", getNow().toString());
        String dd = "01";

        Date date = parse(yyyy+mm+dd, "yyyy/MM/dd");

		return date;
	}

	public static Date parseBulanPk(String string) throws ParseException {

        String yyyy = getYear(getNow()).toString();
        String mm = String.format("%02d", getMonth(getNow()).toString());
        String dd = "01";

        Date date = parse(yyyy+mm+dd, "yyyy/MM/dd");

		return date;
	}

    public static java.time.LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        try {
            return dateToConvert.toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date convertToDateViaInstant(java.time.LocalDate dateToConvert) {
        try {
            return Date.from(dateToConvert.atStartOfDay()
                    .atZone(ZoneId.systemDefault())
                    .toInstant());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
