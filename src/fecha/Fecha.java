package fecha;
import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.zip.DataFormatException;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Fecha {
    //private LocalDateTime fechaH;
    private LocalDate fecha;

    public Fecha(){
        this.fecha = LocalDate.now();
    }
    public Fecha(int dia,int mes ,int anio){
        //setFecha(dia,mes,anio);
        this.fecha = LocalDate.of(anio, mes, dia);
    }
    public void setFecha(int dia,int mes,int anio){
        this.fecha = LocalDate.of(anio, mes, dia);
    }
    public long comparaFechaDias(){
        LocalDate actual = LocalDate.now();
        return ChronoUnit.DAYS.between(this.fecha, actual);
    }
    public String toString(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Fecha de Ingreso: " + this.fecha.format(formato);
    }

    /* 
    //Pasar de un String fecha a int fecha
    String fechaStr = "26/04/2025";
    // Crear un formateador
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    // Parsear la fecha
    LocalDate fecha = LocalDate.parse(fechaStr, formatter);
    
    int dia = fecha.getDayOfMonth();
    int mes = fecha.getMonthValue();
    int anio = fecha.getYear();
    System.out.println("Día: " + dia + ", Mes: " + mes + ", Año: " + anio);*/


    /*public Fecha() {
        this.fechaH = LocalDateTime.now();
    }
    public Fecha(int dia,int mes,int anio,int hora,int min){
        this.fechaH = LocalDateTime.of(anio, mes, dia, hora, min);
    }

    public int getAnio() {
        return this.fechaH.getYear();
    }

    public void setAnio(int anio) {
        this.fechaH = this.fechaH.withYear(anio);
    }

    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy  hh:mm");
        return this.fechaH.format(formato);
    }*/
}
