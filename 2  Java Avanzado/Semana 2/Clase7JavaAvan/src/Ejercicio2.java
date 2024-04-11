
public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println("Proyecto: Desarrollo de Software");
        // Crear las tareas principales del proyecto
        Tarea tareaPrincipal1 = new Tarea("Tarea Principal: Diseño de la Aplicación");
        Tarea tareaPrincipal2 = new Tarea("Tarea Principal: Implementación del Código");
        Tarea tareaPrincipal3 = new Tarea("Tarea Principal: Pruebas y Depuración");

        // Agregar subtareas a la primera tarea principal
        tareaPrincipal1.agregarSubtarea(new Tarea("Subtarea: Crear Prototipo"));
        tareaPrincipal1.agregarSubtarea(new Tarea("Subtarea: Diseñar Interfaz"));
        tareaPrincipal1.agregarSubtarea(new Tarea("Subtarea: Documentar Requisitos"));

        // Agregar subtareas a la segunda tarea principal
        tareaPrincipal2.agregarSubtarea(new Tarea("Subtarea: Desarrollar Backend"));
        tareaPrincipal2.agregarSubtarea(new Tarea("Subtarea: Desarrollar Frontend"));

        // Agregar subtareas a la tercera tarea principal
        tareaPrincipal3.agregarSubtarea(new Tarea("Subtarea: Ejecutar Pruebas de Integración"));
        tareaPrincipal3.agregarSubtarea(new Tarea("Subtarea: Solucionar Errores"));

        // Agregar subtareas a la tarea "Diseñar Interfaz"
        tareaPrincipal1.getSubtareas().get(1).agregarSubtarea(new Tarea("Sub-subtarea: Definir Esquema de Colores"));
        tareaPrincipal1.getSubtareas().get(1).agregarSubtarea(new Tarea("Sub-subtarea: Diseñar Diseño Responsivo"));

        // Agregar subtareas a la tarea "Desarrollar Backend"
        tareaPrincipal2.getSubtareas().get(0).agregarSubtarea(new Tarea("Sub-subtarea: Configurar Base de Datos"));
        tareaPrincipal2.getSubtareas().get(0).agregarSubtarea(new Tarea("Sub-subtarea: Crear Lógica de Negocios"));

        // Agregar subtareas a la tarea "Desarrollar Frontend"
        tareaPrincipal2.getSubtareas().get(1).agregarSubtarea(new Tarea("Sub-subtarea: Codificar Interfaz de Usuario"));
        tareaPrincipal2.getSubtareas().get(1).agregarSubtarea(new Tarea("Sub-subtarea: Integrar con Backend"));

        // Mostrar la estructura completa de tareas
        tareaPrincipal1.mostrarEstructura(0);
        tareaPrincipal2.mostrarEstructura(0);
        tareaPrincipal3.mostrarEstructura(0);
    }
}

