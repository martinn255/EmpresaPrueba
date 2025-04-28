public class Empleado {
    protected String nombre;
    protected long dni;
    protected String dire;

    protected Fecha fechaInicio;
    //protected int fechaInicio;
    protected long telefono;
    protected double salario;
    //protected Empleado Supervisor;
    public Empleado(){

    }
    public Empleado(String nombre, long dni,String dire,Fecha fechaInicio,long telefono,double salario){
        this.nombre = nombre ;
        this.dni = dni;
        this.dire = dire;
        this.fechaInicio = fechaInicio;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String toString(){
        String cadena = "";
        cadena += "Nombre:" + this.nombre + " Dni:"+  this.dni + " " + this.fechaInicio;
        return cadena;
    }

 }   
