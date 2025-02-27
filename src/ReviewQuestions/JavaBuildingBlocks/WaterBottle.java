package ReviewQuestions.JavaBuildingBlocks;

public class WaterBottle {
    private String brand;
    private boolean empty;
    public static void main (String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.println("Empty= " + wb.empty);
        System.out.println(", Brand= " + wb.brand);
    }
}
//Empty= false, Brand= null