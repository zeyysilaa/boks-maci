public class BoksMaci {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("B" , 10, 120,100, 30);
        Fighter f2 = new Fighter("C" , 20, 85, 85, 40);

        Match match = new Match(f1,f2, 100,85);
        match.run();

    }
}
