import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentFileHandlerTest  {
    private ArrayList<Equipment> importedEquipments;

    @BeforeEach
    void init(){
        EquipmentFileHandler equipmentFileHandler = new EquipmentFileHandler();
        importedEquipments = equipmentFileHandler.importEquipments("equipment.txt");
    }

    @Test
    void TestImportEquipment_CheckNumberOfEquipments() {
        assertEquals(18, importedEquipments.size() );
    }

    @Test
    void TestImportEquipment_BallIndex0() {
        Ball ballIndex0 = (Ball) importedEquipments.get(0);
        assertEquals(12, ballIndex0.getId());
        assertEquals("Locker 1", ballIndex0.getLocation());
        assertFalse(ballIndex0.isNeedToBeReplaced());
        assertEquals(BallType.FOOTBALL, ballIndex0.getBallType());
        assertTrue(ballIndex0.isNeedAirRefill());
    }

    @Test
    void TestImportEquipment_TableRacketIndex9() {
        TableTennisRacket tableTennisRacketIndex9 = (TableTennisRacket) importedEquipments.get(9);
        assertEquals(16, tableTennisRacketIndex9.getId());
        assertEquals("Locker 5", tableTennisRacketIndex9.getLocation());
        assertFalse(tableTennisRacketIndex9.isNeedToBeReplaced());
        assertFalse(tableTennisRacketIndex9.isNeedNewCoating());

    }

}