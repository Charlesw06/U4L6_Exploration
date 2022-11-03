public class U4L6Runner {
    public static void main(String[] args) {
        StringLoops loops = new StringLoops();
        System.out.println(loops.replaceCharacter("a", "Apples and bananas", "*"));
        System.out.println(loops.replaceCharacter("t", "Ratatattat", "p"));
        System.out.println(loops.replaceCharacter("!", "Nice! Day today!", "?"));
        System.out.println(loops.replaceCharacter("i", "it’s the brain drain pain train", "I"));
        System.out.println(loops.replaceCharacter("i", "it’s the brain drain pain train", " "));
        System.out.println(loops.replaceCharacter("A", "ABABABABABC", "D"));
        System.out.println(loops.replaceCharacter("a", "ABABABABABC", "D"));

    }
}
