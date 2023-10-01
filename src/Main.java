import java.util.Scanner;

class PartyAffiliation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        String choice = input.nextLine();
        String result;

        if (choice.equalsIgnoreCase("D")) {
            result = "Democratic Donkey";
        } else if (choice.equalsIgnoreCase("R")) {
            result = "Republican Elephant";
        } else if (choice.equalsIgnoreCase("I")) {
            result = "Independent Person";
        } else {
            result = "Other";
        }

        System.out.println("You get a " + result + ".");

        input.close();
    }
}
