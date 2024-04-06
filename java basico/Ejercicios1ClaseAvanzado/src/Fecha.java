public class Fecha {
    private int day;
    private int month;
    private int year;


    //Constructor que puede lanzar una excepcion personalizada
    public Fecha(int day, int month, int year) throws FechaException {
        if (day < 1 || day > 31) {
            throw new FechaException("Los valores de día y mes no son válidos.");
        }
        this.day = day;
        if (month < 1 || month > 12) throw new FechaException("Error en el mes rango entre 1 y 12");
        this.month = month;
        this.year = year;
    }

}
