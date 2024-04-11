import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Crear la agenda
        Agenda agenda = new Agenda();

        // Agregar algunos eventos
        agenda.agregarEvento(new Evento("Reunión", LocalDate.of(2024, 3, 15), "Trabajo"));
        agenda.agregarEvento(new Evento("Conferencia", LocalDate.of(2024, 3, 16), "Trabajo"));
        agenda.agregarEvento(new Evento("Taller", LocalDate.of(2024, 3, 17), "Otro"));

        // Filtrar eventos por fecha
        LocalDate fechaFiltrar = LocalDate.of(2024, 3, 16);
        List<Evento> eventosFiltrados = agenda.filtrarEventosPorFecha(fechaFiltrar);
        System.out.println("Eventos para el " + fechaFiltrar + ": " + eventosFiltrados);

        // Contar eventos por categoría
        Map<String, Long> conteoPorCategoria = agenda.contarEventosPorCategoria();
        System.out.println("Conteo de eventos por categoría: " + conteoPorCategoria);

        // Encontrar el evento más próximo en el tiempo
        LocalDate fechaActual = LocalDate.now();
        Optional<Evento> eventoMasProximo = agenda.encontrarEventoMasProximo(fechaActual);
        eventoMasProximo.ifPresentOrElse(
                evento -> System.out.println("Evento más próximo: " + evento),
                () -> System.out.println("No hay eventos en la agenda.")
        );
    }
}