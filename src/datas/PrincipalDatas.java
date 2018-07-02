package datas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class PrincipalDatas {

	public static boolean isDiaUtil(){
		Calendar data = Calendar.getInstance();
		if ( (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) || 
				(data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ))
			return false;
		else
			return true;

	}
	
	public static void main(String args[]) {
		try {
	
		LocalDate fixa = LocalDate.of(2015, Month.JANUARY, 10);
		LocalDate data = LocalDate.now();
		LocalDate data2 = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dataTime = LocalDateTime.now();	
		LocalDateTime dataTime2 = LocalDateTime.now();
	
		System.out.println(PrincipalDatas.isDiaUtil());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataVerificada = LocalDate.parse("16/04/2018", dtf);
		System.out.println(dataVerificada);
		
		
		System.out.println("Data Fixa:\t\t\t" +  fixa);
		System.out.println();
		
		System.out.println("Data Compare:\t\t\t" + data.compareTo(data2));
		System.out.println();
		
		System.out.println("Data Time Compare:\t\t" + dataTime.compareTo(dataTime2));
		System.out.println();
		
		System.out.println("Data Atual:\t\t\t" + data);
		System.out.println("Data Atual Format:\t\t" + data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		
		System.out.println();
		
		System.out.println("Hora Atual:\t\t\t" + time);
		System.out.println("Hora Atual Format:\t\t" + time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		
		System.out.println();
		
		System.out.println("Data Hora Atual:\t\t" + dataTime);
		
		System.out.println("Data Hora Atual Format:\t\t" + dataTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:MM:ss")));
		System.out.println("Data Hora Atual Format:\t\t" + dataTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		System.out.println();
		
		Period periodo = Period.between(fixa, data);
		System.out.println("Diferença apenas Anos:\t\t" + periodo.getYears());
	    System.out.println("Diferença apenas Meses:\t\t" + periodo.getMonths());
	    System.out.println("Diferença apenas Dias:\t\t" + periodo.getDays());
	    System.out.println();
		
	    System.out.println("Diferença Total em dias:\t" + ChronoUnit.DAYS.between(fixa, data));
	    System.out.println("Diferença Total em meses:\t" + ChronoUnit.MONTHS.between(fixa, data));
	    System.out.println("Diferença Total em anos:\t" + ChronoUnit.YEARS.between(fixa, data));
		System.out.println();
	    
	    Duration duracao = Duration.between(dataTime, dataTime2);
	    System.out.println(duracao.getSeconds());
	    System.out.println();
		} catch(final Exception exception) {
			System.err.println(exception);
		}
	}

}
