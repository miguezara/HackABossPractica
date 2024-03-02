

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GestorEstudiantes {

    private Connection conexion;

    public GestorEstudiantes(Connection conexion) {
        this.conexion = conexion;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        String sql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";

        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, estudiante.getNombre());
            statement.setInt(2, estudiante.getEdad());
            statement.setDouble(3, estudiante.getCalificacion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        String sql = "SELECT * FROM estudiantes";

        try {
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                Estudiante estudiante = new Estudiante(
                        resultado.getInt("id"),
                        resultado.getString("nombre"),
                        resultado.getInt("edad"),
                        resultado.getDouble("calificacion")
                );
                listaEstudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaEstudiantes;
    }
}
