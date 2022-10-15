import java.util.ArrayList;

public class Maintenance {

    public static void printBallsNeedingMoreAir(ArrayList<Equipment> equipmentList){
        System.out.println("The following balls needs more air:");
        equipmentList.stream()
                .filter(equipment -> equipment instanceof Ball && ((Ball) equipment).isNeedAirRefill())
                .forEach(System.out::println);
    }

    public static void printEquipmentNeedingToBeReplaced(ArrayList<Equipment> equipmentList){
        System.out.println("The following equipments needs to be replaced:");
        equipmentList.stream()
                .filter(Equipment::isNeedToBeReplaced)
                .forEach(System.out::println);

    }

    public static void printTableTennisRacketsNeedingNewPad(ArrayList<Equipment> equipmentList){
        System.out.println("The following Table Tennis Rackets needs new pad");
        equipmentList.stream()
                .filter(equipment -> equipment instanceof TableTennisRacket && ((TableTennisRacket) equipment).isNeedNewCoating())
                .forEach(System.out::println);
    }


}
