package ReviewQuestions.JavaBuildingBlocks;

public class Rabbit {
    public static void main(String[] args) {
        Rabbit one = new Rabbit();   // Line 3: Creates Rabbit #1
        Rabbit two = new Rabbit();   // Line 4: Creates Rabbit #2
        Rabbit three = one;          // Line 5: three refers to Rabbit #1
        one = null;                  // Line 6: one no longer refers to Rabbit #1
        Rabbit four = one;           // Line 7: four is null (one was null)
        three = null;                // Line 8: three no longer refers to Rabbit #1
        two = null;                  // Line 9: two no longer refers to Rabbit #2
        two = new Rabbit();          // Line 10: Rabbit #3 is created, Rabbit #2 is now unreachable
        System.gc();                 // Line 11: Suggests garbage collection (not guaranteed)
    }
}

//The Rabbit object from line 3 is first eligible for garbage collection immediately
//following line 8.

//The Rabbit object from line 4 is first eligible for garbage collection immediately
//following line 9.