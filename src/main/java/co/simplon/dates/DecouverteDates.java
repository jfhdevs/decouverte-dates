package co.simplon.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DecouverteDates {

	public DecouverteDates() {
		super();
	}

	public boolean estInferieurDateCourante(Date date) throws ParseException {
		return date.before(new Date());
	} // estInferieurDateCourante

	public Date construireDate(String chaineFournie) throws ParseException {
		return new SimpleDateFormat("dd/MM/yyyy").parse(chaineFournie);
	} // construireDate

	public Date augmenterDate(Date dateInitiale, int nombreJours,
			int nombreHeures, int nombreMinutes) {
		Calendar caldate = Calendar.getInstance();
		caldate.setTime(dateInitiale);
		caldate.add(Calendar.DATE, nombreJours);
		caldate.add(Calendar.HOUR, nombreHeures);
		caldate.add(Calendar.MINUTE, nombreMinutes);
		return caldate.getTime();
	} // augmenterDate

	public String formaterUneDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_YYYY");
		return dateFormat.format(date);
	} // formaterUneDate

	public String formaterUneHeure(Date time) {
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH_mm:ss");
		String formatedTime = timeFormat.format(time) + "sec";
		formatedTime = formatedTime.replace('_', 'h');
		return formatedTime.replace(":", "min");
	} // formaterUneHeure
	
	public String formaterDateEnFrancais(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEEEEEE dd MMMMMMMMM YYYY");
		System.out.println(dateFormat.format(date));
		return dateFormat.format(date);
	} // formaterDateEnFrancais
}
