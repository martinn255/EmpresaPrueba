import fecha.Fecha;

public class  Secretario extends Empleado{
    protected String despacho;
    protected int fax;

    public Secretario(String nombre, long dni,String dire,Fecha fechaInicio,long telefono,double salario,String despacho,int fax){
        super(nombre, dni, dire,fechaInicio ,telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }
    public String toString(){
        String cadena = super.toString();
        cadena += " Despacho:" + this.despacho + " Fax: " + this.fax;
        return cadena;
    }
    
    
}
