package javaBien;

public class Main {

    public static void main(String[] args) {
        Maze level1 = null;
        try {
            level1 = new Maze(25,6,"./data/level1.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        level1.displayInConsole();
    }
}
