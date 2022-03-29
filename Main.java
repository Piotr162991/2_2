import java.util.Scanner;
class Main {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    System.out.println("Podaj tekst:");
    String wynik = scan.nextLine();
    int kod;
    char znak;
     for (int i = 0 ; i < wynik.length() ; i++)   
      {
          znak = wynik.charAt(i);
        
        kod = (int) znak;
       if (kod>=97 && kod <=122)
       {
        System.out.print(Character.toUpperCase(znak));
         }
        else{
          System.out.print(Character.toLowerCase(znak));
        }
  }
    int liczba_zmian= wynik.length();
    System.out.println("\nLiczba zmian:");
    System.out.print(liczba_zmian);
}
}