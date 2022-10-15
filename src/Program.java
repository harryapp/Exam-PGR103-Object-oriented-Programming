import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    private ArrayList<Equipment> equipmentList;

    public void start(){
        loadEquipment();
        mainMenu();
    }

    private void loadEquipment() {
        EquipmentStorage equipmentStorage = new EquipmentFileHandler();
        equipmentList = equipmentStorage.importEquipments("equipment.txt");
    }

    private void mainMenu(){
        Scanner userInput = new Scanner(System.in);

        while (true){
            printMainMenu();
            switch (userInput.nextLine()){
                case "1" -> printList();
                case "2" -> Maintenance.printBallsNeedingMoreAir(equipmentList);
                case "3" -> Maintenance.printEquipmentNeedingToBeReplaced(equipmentList);
                case "4" -> Maintenance.printTableTennisRacketsNeedingNewPad(equipmentList);
                case "5" -> exitProgram();
                default -> System.out.println("Invalid input. Try again!");
            }
        }
    }

    private void printMainMenu(){
        System.out.println("---------------------------------------------- \n");
        System.out.println("Equipment manager");
        System.out.println("1. print the list of equipment");
        System.out.println("2. print the balls needing more air");
        System.out.println("3. print the equipments needing to be replaced ");
        System.out.println("4. print the table tennis rackets needing new pad");
        System.out.println("5. Exit program");
        System.out.print("Enter option ");
    }

    private void printList(){
        System.out.println("\nList of equipment: ");
        for (Equipment e : equipmentList) {
            System.out.println(e.toString());
        }
    }

    private void exitProgram() {
        System.out.println("Program shutting down..");
        System.exit(0);
    }

}
