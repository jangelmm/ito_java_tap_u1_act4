import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Operaciones{
    ArrayList<Persona> personas = new ArrayList<>();
    //File archivoAlumnos = new File("Alumnos.txt");
    //File archivoDocente = new File("Docentes.txt");

    public void agregar(Persona p){
        personas.add(p);
    }
    public void eliminar(Persona p){
        personas.remove(p);
    }
    public void eliminar(int indice){
        personas.remove(indice);
    }
    public void crearArchivo(String nombre) throws IOException{
        File archivo = new File(nombre);
        archivo.createNewFile();
    }
    public void guardarDatos() throws IOException{
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Personas.txt"))) {
            for (Persona p : personas) {
                    String elemento = p.toString();
                    writer.write(elemento);
                    writer.newLine();  // Agrega una nueva línea después de cada elemento
            }
        }
    }
    public void crearEstadisticas() throws FileNotFoundException, IOException{
        int c_mujeres = 0, c_hombres = 0, c_mayores = 0, c_menores = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("Personas.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] elementos = linea.split(",");

                if(elementos[2].charAt(0) == 'M'){
                    c_hombres++;
                }
                if(elementos[2].charAt(0) == 'F'){
                    c_mujeres++;
                }
                if(Integer.parseInt(elementos[1]) >= 18){
                    c_mayores++;
                }
                if(Integer.parseInt(elementos[1]) < 18){
                    c_menores++;
                }
            }
        }
        System.out.println("Cantidad de mujeres: "+c_mujeres);
        System.out.println("Cantidad de hombres: "+c_hombres);
        System.out.println("Cantidad mayores de edad: " + c_mayores);
        System.out.println("Cantidad menores de edad: " + c_menores);
    }
}