public class Cliente {


    private int id;
    private String apellido;

    public Cliente(int id, String apellido) {
        this.id = id;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

