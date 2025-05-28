import fecha.Fecha;

public class Pasantes extends Empleado{
    protected boolean formaParte;

    public Pasantes(String nombre, long dni,String dire,Fecha fechaInicio,long telefono,double salario,boolean formaParte){
        super(nombre, dni, dire,fechaInicio ,telefono, salario);
        this.formaParte = formaParte;
    }
    /*public int getDia(){
        return this.fechaInicio;
    }*/
    public boolean esPasante(){
        
        return this.formaParte;
    }
    public String toString(){
        String cadena = "";
        cadena += super.toString() + " Es Pasante:" + esPasante();
        return cadena;
    }
}
