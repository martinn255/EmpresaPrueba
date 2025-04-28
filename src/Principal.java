public class Principal {
    public static void main(String[] args) {
        Fecha val = new Fecha(20,6,2003);
        Secretario p = new Secretario("Martin",4545,"chau",val,42234,12,"buenos",40);
        System.out.println("Secretario: " + p);

        Auto auto = new Auto(771,"BMW");
        Fecha val2 = new Fecha(12,1,2004);
        Vendedores n = new Vendedores("Juan",6757,"chau",val2,42234,12,77777777,auto);
        System.out.println("Vendedor: " + n);

        Fecha val3;
        val3 = new Fecha(5,3,2025);
        Pasantes s = new Pasantes("Martin",4545,"chau",val3,42234,12,true);
        System.out.println("Pasante: " + s);
        System.out.println("Dias Hasta hoy: " + val3.comparaFechaDias());
        


    }
    
}
