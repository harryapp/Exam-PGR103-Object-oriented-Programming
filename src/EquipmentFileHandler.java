import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EquipmentFileHandler implements EquipmentStorage {
    private Scanner fileReader;

    public ArrayList<Equipment> importEquipments(String filename) {
        File file = new File(filename);
        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Equipment> equipmentList = new ArrayList<>();

        while(fileReader.hasNextLine()){
            switch (fileReader.nextLine()){
                case "Ball" -> equipmentList.add(readBall());
                case "TableTennisRacket" -> equipmentList.add(readTableRacket());
                default -> System.out.println("Equipment not recognized. Skipping line");
            }
        }
        return equipmentList;
    }

    private Ball readBall(){
        int id = readInt();
        String location = readString();
        boolean needToBeReplaced = readBoolean();
        BallType ballType = readBallType();
        boolean needAirRefill = readBoolean();

        return new Ball(id, location, needToBeReplaced, ballType, needAirRefill);
    }


    private TableTennisRacket readTableRacket(){
        int id = readInt();
        String location = readString();
        boolean needToBeReplaced = readBoolean();
        boolean needNewCoating = readBoolean();

        return new TableTennisRacket(id, location, needToBeReplaced, needNewCoating);
    }

    private String readString() {
        return fileReader.nextLine();
    }

    private BallType readBallType() {
        return BallType.valueOf(fileReader.nextLine().toUpperCase());
    }

    private boolean readBoolean() {
        return Boolean.parseBoolean(fileReader.nextLine());
    }

    private int readInt() {
        return Integer.parseInt(fileReader.nextLine());
    }



}
