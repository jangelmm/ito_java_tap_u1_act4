// Subclase

public class Docente extends Persona{
    // Atributos
    private long telefono;
    private String nss;

    // Constructor
    public Docente(String nombre, int edad, char genero, long telefono, String nss) {
        super(nombre, edad, genero);
        this. telefono = telefono;
        this.nss = nss;
    }
    
    // Setters y Getters
    public void setTelefono(long tel) {
        telefono = tel;
    }
    public long getTelefono() {
        return telefono;
    }
    
    public void setNSS(String nss) {
        this.nss = nss;
    }
    public String getNSS() {
        return nss;
    }

    @Override
    public String toString() {
        return nombre + "," + edad + "," +genero + "," + telefono + "," + nss;
    }
}
