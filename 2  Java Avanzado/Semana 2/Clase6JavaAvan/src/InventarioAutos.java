import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {
    private List<T> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    // Método para agregar autos al inventario
    public void agregarAuto(T auto) {
        inventario.add(auto);
    }

    // Método para buscar autos por marca
    public List<T> buscarPorMarca(String marca) {
        List<T> autosEncontrados = new ArrayList<>();
        for (T auto : inventario) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    // Método para buscar autos por año
    public List<T> buscarPorAño(int año) {
        List<T> autosEncontrados = new ArrayList<>();
        for (T auto : inventario) {
            if (auto.getAño() == año) {
                autosEncontrados.add(auto);
            }
        }
        return autosEncontrados;
    }

    // Método para calcular el valor total del inventario
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (T auto : inventario) {
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }
}