package javaBien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Maze {
    private final int width;
    private final int height;
    private char mazeArray[][];

    public Maze(int width, int height, String filePath) throws Exception {
        this.width = width;
        this.height = height;
        mazeArray = new char[height][width];
            try{
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                for (int i=0;i<height;i++) {
                    String line = bufferedReader.readLine();
                    mazeArray[i] = line.toCharArray();
                    for (char c:mazeArray[i]){
                        if (!((c=='H')||(c=='T')||(c=='R')||(c==' ')||(c=='\n'))){
                            throw new Exception("Exception de Java pas bien");
                        }
                    }
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
    }


    public void displayInConsole(){
        for (char[] line : mazeArray){
            for (char c : line){
                System.out.print(c);
            }
            System.out.println("");
        }

    }
}
