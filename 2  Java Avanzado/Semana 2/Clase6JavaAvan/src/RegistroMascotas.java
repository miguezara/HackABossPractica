import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas<T> {
    private List<Mascota<T>> registro;

    public RegistroMascotas() {
        this.registro = new ArrayList<>();
    }

    public void agregarMascota(Mascota<T> mascota) {
        registro.add(mascota);
    }

    public List<Mascota<T>> buscarPorNombre(String nombre) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    public List<Mascota<T>> buscarPorEspecie(T especie) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        if (especie.equals("")) {
            return registro;
        }
        for (Mascota<T> mascota : registro) {
            if (mascota.getEspecie().equals(especie)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    public int contarMascotasRegistradas() {
        return registro.size();
    }

    public void generarDatosAleatorios(int cantidad) {
        Random random = new Random();
        String[] nombres = {"Gala", "Toby", "Nala", "Leo", "Chispa", "Rocky", "Momo", "Charlie", "Lucy"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};

        for (int i = 0; i < cantidad; i++) {
            String nombreAleatorio = nombres[random.nextInt(nombres.length)];
            int edadAleatoria = random.nextInt(15) + 1; // Edad entre 1 y 15 años
            T especieAleatoria = (T) especies[random.nextInt(especies.length)];

            Mascota<T> mascota = new Mascota<>(nombreAleatorio, edadAleatoria, especieAleatoria);
            agregarMascota(mascota);
        }
    }
}