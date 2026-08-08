public class Main {
    public static void main(String[] args) {
//        Print the first line of the code
        SimplerPrinter simplerPrinter = new SimplerPrinter();
        simplerPrinter.print();

//        Print an image of the animal
        PrintImageOfAnimal printImageOfAnimal = new PrintImageOfAnimal();
        String camel = printImageOfAnimal.printCamel();
        System.out.println(camel);
    }
}