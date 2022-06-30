
package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    int cedula;
    
    //Metodos
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //Sobrecarga de constructores
    public Persona(int cedula) {
        this.cedula = cedula;
    }
    
    public void correr() {
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo.");
    }
    //Sobrecarga de metodos
    public void correr(int km) {
        System.out.println("He corrido "+km+" kilometros.");
    }
    
}
