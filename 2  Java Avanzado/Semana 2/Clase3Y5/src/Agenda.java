import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Agenda {
    private List<Evento> eventos;

    public Agenda() {
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> filtrarEventosPorFecha(LocalDate fecha) {
        return eventos.stream()
                .filter(evento -> evento.getFecha().isEqual(fecha))
                .collect(Collectors.toList());
    }

    public Map<String, Long> contarEventosPorCategoria() {
        return eventos.stream()
                .filter(evento -> evento.getCategoria() != null) // Filtrar eventos con categoría no nula
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
    }

    public Optional<Evento> encontrarEventoMasProximo(LocalDate fechaActual) {
        return eventos.stream()
                .min((evento1, evento2) -> {
                    long diferencia1 = Math.abs(evento1.getFecha().toEpochDay() - fechaActual.toEpochDay());
                    long diferencia2 = Math.abs(evento2.getFecha().toEpochDay() - fechaActual.toEpochDay());
                    return Long.compare(diferencia1, diferencia2);
                });
    }
}
