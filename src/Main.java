import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Print the first line of the code
        SimplerPrinter simplerPrinter = new SimplerPrinter();
        simplerPrinter.print();

//        Print an image of the animal
        PrintImageOfAnimal printImageOfAnimal = new PrintImageOfAnimal();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Please enter the number of the habitat you would like to view(1 to 6):");
            String view = scanner.nextLine();
            if(view.equalsIgnoreCase("exit")){
                System.out.println("See you later");
                break;
            }
            int check = Integer.parseInt(view);
            switch (check) {
                case 1:
                    System.out.println(printImageOfAnimal.printCamel());
                    break;
                case 2:
                    System.out.println(printImageOfAnimal.printLion());
                    break;
                case 3:
                    System.out.println(printImageOfAnimal.printDeer());
                    break;
                case 4:
                    System.out.println(printImageOfAnimal.printGoose());
                    break;
                case 5:
                    System.out.println(printImageOfAnimal.printBat());
                    break;
                case 6:
                    System.out.println(printImageOfAnimal.printRabbit());
                    break;
                default:
                    System.out.println("Write a 1-6 view of camera...");
            }
//            System.out.println("You have reached the end of the program. To check another habitat, please restart the watcher.");
        }
    }
}