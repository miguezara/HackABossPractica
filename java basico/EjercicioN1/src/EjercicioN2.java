public class EjercicioN2 {
    public static void main(String[] args) {
        //Crear un vector tipo Impresora
        Impresora[] impresoras = new Impresora[5];
        //Almacenar 3 impresora Cannon y 2 Epson
        impresoras[0] = new ImpresoraCannon("Cannon123", "USB", "2023-02-26", 100, 80);
        impresoras[1] = new ImpresoraCannon("Cannon456", "WiFi", "2023-02-26", 150, 70);
        impresoras[2] = new ImpresoraCannon("Cannon789", "Ethernet", "2023-02-26", 200, 90);
        impresoras[3] = new ImpresoraEpson("EpsonABC", "USB", "2023-02-26", 120, 60);
        impresoras[4] = new ImpresoraEpson("EpsonDEF", "WiFi", "2023-02-26", 180, 75);

        //Recorres el vector y ejecutar para imprimir en cada posicion
        for (int i = 0; i < impresoras.length; i++){
            impresoras[i].imprimir();
    }

    }
}

