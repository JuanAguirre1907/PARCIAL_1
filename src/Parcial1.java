import java.util.Scanner;
public class Parcial1 {
    public static void main(String[] args){
        iniciarJuego();
    }
    public static void iniciarJuego(){
        Scanner scanner = new Scanner(System.in);
        int Suma = 0, Numero, numeroCasa;
        String Continuar;

        System.out.println(" WELCOME TO JUAN'S 21 BLACKJACK PROGRAM\n " +
                "    Presione enter para iniciar");
        scanner.nextLine();
        while (true) {

            Numero=((int)Math.round(Math.random()*9+1));
            System.out.println(Numero);
            Suma=Suma+Numero;

            if (Suma>21) {
                System.out.println("excediste el limite sumando un total de "+Suma+" perdiste :P");
                break;
            }
            System.out.println("Su número actual es "+Suma+". Si desea plantarse presiona x seguido de un enter de lo contrario presiona enter para generar mas numeros ");
            Continuar = scanner.nextLine();

            if (Continuar.equals("x") || Continuar.equals("X")) {
                numeroCasa = ((int) (Math.round(Math.random() * 20 + 1)));
                System.out.println("El número de la casa es " + numeroCasa);
                if (Suma < numeroCasa) {
                    System.out.println("Tu número es "+Suma+" al ser menor al de la casa has perdido");
                    break;
                } else if (Suma == numeroCasa) {
                    System.out.println("los numeros son iguales, es un empate ");
                    break;
                } else {
                    System.out.println("Tu numero es mayor al de la casa has ganado ");
                    break;
                }
            }
        }
        System.out.println("Si quiere jugar de nuevo presione enter, si desea salir del juego preione Q ");
        Continuar = scanner.nextLine();
        if(Continuar.equals("Q") || Continuar.equals("q")){
            scanner.nextLine();

        }else {
            iniciarJuego();
        }
    }
}


