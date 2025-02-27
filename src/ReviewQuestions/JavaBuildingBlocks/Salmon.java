package ReviewQuestions.JavaBuildingBlocks;

public class Salmon {
    int count;

    public Salmon() { // This is now a constructor
        count = 4;
    }

    public static void main(String[] args) {
        Salmon s = new Salmon(); // Calls the constructor
        System.out.println(s.count); // Prints 4
    }
}

//0