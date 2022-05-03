public class App {
    public static void main(String[] args) throws Exception {

        var numeroIf = -45;

        if (numeroIf > 0) {
            System.out.println("numeroIf es POSITIVO");
        } else if (numeroIf < 0) {
            System.out.println("numeroIf es NEGATIVO");
        } else {
            System.out.println("numeroIf es CERO");
        }

        var numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile += 1;
            System.out.println(numeroWhile);
        }

        do {
            numeroWhile += 1;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "OTOÑO";

        switch (estacion) {
            case "INVIERNO":
                System.out.println("La estación es " + estacion);
                break;
            case "VERANO":
                System.out.println("La estación es " + estacion);
                break;
            case "OTOÑO":
                System.out.println("La estación es " + estacion);
                break;
            case "PRIMAVERA":
                System.out.println("La estación es " + estacion);
                break;
            default:
                System.out.println("El valor ingresado no es una estación");
                break;
        }
    }
}
