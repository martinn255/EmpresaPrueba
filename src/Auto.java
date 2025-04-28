public class Auto {
    protected long matricula;
    protected String modelo;

    public Auto(long matricula,String modelo){
        this.matricula = matricula;
        this.modelo = modelo;
    }
    public String toString(){
        String cadena = " ";
        cadena +=  " Matricula:" +  this.matricula +  " Modelo:" + this.modelo ;
        return cadena;
    }
}
