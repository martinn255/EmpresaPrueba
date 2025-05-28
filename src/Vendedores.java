import fecha.Fecha;

public class Vendedores extends Empleado{
    protected long telfonoEmpr;
    protected Auto val;
    
    public Vendedores(String nombre, long dni,String dire,Fecha fechaInicio,long telefono,double salario,long telfonoEmpr,Auto val){
        super(nombre, dni, dire,fechaInicio ,telefono, salario);
        this.telfonoEmpr = telfonoEmpr;
        this.val = val;
    }
    
    public String toString(){
        String cadena = "";
        cadena += super.toString() + " Tel Empresarial:" + this.telfonoEmpr + " Auto:" + this.val.toString();
        return cadena;
    }

    
}
