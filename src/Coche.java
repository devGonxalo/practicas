public class Coche {
    int puertas;

    Coche (int puertasTotales)
    {
        puertas = puertasTotales;
    }

    public static void main(String[] args)
    {
        Coche puertasDelanteras;
        puertasDelanteras = new Coche(2);

        Coche puertasTraseras;
        puertasTraseras = new Coche(2);

        System.out.println(puertasTraseras.puertas + puertasDelanteras.puertas);
    }

}
