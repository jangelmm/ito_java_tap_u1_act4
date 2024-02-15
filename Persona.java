// Clase Padre

public class Persona {
    // Atributos
    protected static int contadorId = 0;
    protected int id; //Falta tipo de dato
    protected String nombre;
    protected int edad;
    protected char genero;
    
    // Constructor
    public Persona(String nombre, int edad, char genero) {
        this.id =+ contadorId;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Setters y Getters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String n) {
        nombre = n;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void setEdad(int e) {
        edad = e;
    }
    public int getEdad() {
        return edad;
    }
    
    public void setGenero(char g) {
        genero = g;
    }
    public char getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return nombre + "," + edad + "," + genero;
    }
    
}
