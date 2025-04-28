import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        
        LocalDate fecha;
        LocalTime hora;
        fecha = LocalDate.now();
        hora = LocalTime.now();
        System.out.println(fecha);
        System.out.println(hora);
        System.out.println("-----------------------------");
        LocalDateTime fechaYHora, fechaEspecial;
        fechaYHora = LocalDateTime.now();
        fechaEspecial = LocalDateTime.of(2018, 12 ,9,16,32 );
        System.out.println(fechaYHora);
        System.out.println(fechaEspecial);                                  //HH
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("'Fecha:'dd/MM/yyyy 'Hora:'hh:mm");
        System.out.println(fechaEspecial.format(formato));
        System.out.println("Distania entre las dos Anios:" + ChronoUnit.YEARS.between(fechaEspecial, fechaYHora));
        
    }
}
