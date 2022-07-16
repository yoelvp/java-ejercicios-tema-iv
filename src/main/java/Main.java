public class Main {
    public static void main(String[] args) {
        int numeroIf = 1;

        System.out.println("CONDICIONAL");
        if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
        System.out.println("");

        // Bucle While
        int numeroWhile = 4;

        while (numeroWhile < 3) {
            System.out.println("NÚMERO WHILE");
            System.out.println("Es el número " + numeroWhile + "\n");
            numeroWhile++;
        }

        int numeroDoWhile = 2;
        do {
            System.out.println("BUCLE DOWHILE");
            System.out.println("El número es " + numeroDoWhile + "\n");
            numeroDoWhile++;
        } while (numeroDoWhile < 2);


        System.out.println("BUCLE FOR");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El número es " + numeroFor);
        }

        System.out.println("SWITCH");
        String estacion = "verano";

        switch (estacion) {
            case "invierno":
                System.out.println("Estación de Invierno");
                break;

            case "verano":
                System.out.println("Estación de verano");
                break;

            default:
                System.out.println("No existe esta estación");
        }

        System.out.println("\n");
    }
}
