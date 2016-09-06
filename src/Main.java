public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String[] colorArray={"Green","Blue"};
        Thermos barginBin = new Thermos("a","b","c",0,0,colorArray);

        barginBin.setBrand("Bargin Bin");
        barginBin.setThermosType("Non-insulated");
        barginBin.setContents("Coffee");
        barginBin.setContentsTemp(105);
        barginBin.setPrice(59.95);
        barginBin.setdOfM("04241989");

        System.out.println(barginBin.getBrand());
        System.out.println(barginBin.getThermosType());
        System.out.println(barginBin.getContents());
        System.out.println(barginBin.getContentsTemp());
        System.out.println(barginBin.getPrice());
        System.out.println(barginBin.getdOfM());


        Student ironyardIntake = new Student();
        ironyardIntake.setFirstName("Johnny");
        ironyardIntake.setLastName("Cash");
        ironyardIntake.setGender('f');
        ironyardIntake.setDateOfBirth("05051959");
        ironyardIntake.setGrade('f');

        ironyardIntake.getFirstName();
        ironyardIntake.getLastName();
        ironyardIntake.getGender();
        ironyardIntake.getDateOfBirth();
        ironyardIntake.getGrade();


        Oven mayflower = new Oven();

        mayflower.setOvenBrand("Mayflower");
        mayflower.setNumOfRacks(32);
        mayflower.setCurrTemp(500);
        mayflower.setPowerOn(true);
        mayflower.setUnderWarranty(false);
        mayflower.setRecallIssued(false);

        mayflower.getOvenBrand();
        mayflower.getNumOfRacks();
        mayflower.getCurrTemp();
        mayflower.getPowerOn();
        mayflower.getUnderWarranty();
        mayflower.getRecallIssued();

        Microwave trinity = new Microwave();

        trinity.setCookTime(50);
        //trinity.setCookSettings();
        trinity.setTrayRotation(5000);

        System.out.println(trinity.getCookTime());
        //System.out.println(trinity.getCookSettings());
        System.out.println(trinity.getTrayRotationSpeed());


        Elevator iyElevator = new Elevator();

        iyElevator.setInService(true);
        iyElevator.setWeightLimit(5000);
        iyElevator.setDoorsOpeningMelody("screeching");
        iyElevator.setDateLastInspected("08162016");

        iyElevator.getInService();
        iyElevator.getWeightLimit();
        iyElevator.getDoorsOpeningMelody();
        iyElevator.getDateLastInspected();

        Table kitchen = new Table();

        kitchen.setNumOfLegs((byte)0100);
        kitchen.setNumOfCorners(45);
        kitchen.setSurfaceType("Granite");
        kitchen.setPrice(5000f);
        kitchen.setWhereFound("Home Depot");
        kitchen.setCanGetRefund('n');

        kitchen.getNumOfCorners();
        kitchen.getNumOfCorners();
        kitchen.getSurfaceType();
        kitchen.getPrice();
        kitchen.getWhereFound();
        kitchen.getCanGetRefund();
    }
}
