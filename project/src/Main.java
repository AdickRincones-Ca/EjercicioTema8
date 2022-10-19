public class Main {
    public static void main(String[] args) {

        Persona persona= new Persona();
        Persona persona2= new Persona();
        Persona persona3= new Persona();

        persona.setEdad(20);
        persona2.setEdad(32);
        persona3.setEdad(40);

        persona.setNombre("Juan");
        persona2.setNombre("Jose");
        persona3.setNombre("Pedro");

        persona.setTelefono("123456789");
        persona2.setTelefono("243424242");
        persona3.setTelefono("312423442");

        System.out.println(persona.getEdad());
        System.out.println(persona2.getEdad());
        System.out.println(persona3.getEdad());

        System.out.println(persona.getNombre());
        System.out.println(persona2.getNombre());
        System.out.println(persona3.getNombre());

        System.out.println(persona.getTelefono());
        System.out.println(persona2.getTelefono());
        System.out.println(persona3.getTelefono());

    }
}

class Persona{

    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String nombre;
    private String telefono;



}