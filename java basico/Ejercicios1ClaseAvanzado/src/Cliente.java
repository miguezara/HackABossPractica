class Cliente {
    private int id;
    private String nombre;
    private double saldo;
    private double limite;

    public Cliente(int id, String nombre, double saldo, double limite) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void comprar(double monto) throws ClienteException {
        if (saldo + monto > limite) {
            throw new ClienteException("Saldo excede el límite de crédito.");
        }
        saldo += monto;
        System.out.println("Compra exitosa. Nuevo saldo: " + saldo);
    }

    public void pagar(double monto) throws ClienteException {
        if (saldo - monto < 0) {
            throw new ClienteException("No hay deuda pendiente para pagar.");
        }
        saldo -= monto;
        System.out.println("Pago realizado. Nuevo saldo: " + saldo);
    }
}