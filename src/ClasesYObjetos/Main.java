package ClasesYObjetos;
public class Main {
    public static void main(String[] args) {
        //Creamos un objeto persona con el primer constructor
        Persona persona1 = new Persona("Victor",24);
        Persona persona2 = new Persona(1140897749);
        
        //Llamamos el primer metodo correr
        persona1.correr();
        persona2.correr(20);
    }
}
