// Subclase

public class Alumno extends Persona {
    // Atributos
    private String email;
    private int grupo;

    // Constructor
    public Alumno(String nombre, int edad, char genero, String email, int grupo) {
        super(nombre, edad, genero);
        this.email = email;
        this.grupo = grupo;
    }

    // Setters y Getters
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    
    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }
    public int getGrupo() {
        return grupo;
    }

    @Override
    public String toString() {
        return nombre + "," + edad + "," +genero + "," + email + "," + grupo;
    }
    
}
