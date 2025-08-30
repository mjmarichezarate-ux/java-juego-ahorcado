import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean pablaraAdininada = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];


        for(int i = 0; i<letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }

        while (!pablaraAdininada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivininar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for(int i = 0; i <palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto! te quedan " + (intentosMaximos-intentos) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas). equals(palabraSecreta)) {
                pablaraAdininada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta:! " + palabraSecreta);
            }

        }
        
        if(!pablaraAdininada){
            System.out.println("Te has quedado sin intetos");
        }

        scanner.close();
 

       

    }
}
