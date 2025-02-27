package ReviewQuestions.JavaBuildingBlocks;

public class Bear {
//    protected void finalize() {
//        System.out.println("Roar!");
//    }

    public static void main(String[] args) {
        Bear bear = new Bear(); // Creates a Bear object
        bear = null;            // Makes the Bear object eligible for garbage collection
        System.gc();            // Suggests the JVM to run garbage collection
    }
}

//✅ B. finalize() might or might not be called.
//✅ E. Garbage collection might or might not run.