package fi.utu.tech.exercise1.maze;

import java.nio.file.Files;
import java.nio.file.Path;

public class Reader {
    public void read() throws Exception {
        var mazeFile = Path.of("maze.txt");

        var maze = Files.readString(mazeFile);

        //System.out.println(maze);
    }

    public char[][] readMaze(String labName) throws Exception {

        var mazeFile = Path.of(labName);

        var maze = Files.readString(mazeFile);

        String[] rows = maze.split("\n");
        //System.out.println(rows[0].length());
        int korkeus = maze.length() - maze.replace("\n", "").length() +1;
        int leveys = maze.split("\n")[0].length();
        //System.out.println(leveys);

        for (String rivi : maze.split("\n")){
            if (rivi.length() != maze.split("\n")[0].length()) throw new IllegalAccessException("Illegal row");
        }

        char[][] labyrintti = new char[korkeus][leveys];


        for (int y = 0; y < korkeus; y++) {
                for (int x = 0; x < leveys; x++) {
                    if (charAllowed(rows[y].charAt(x))) labyrintti[y][x] = rows[y].charAt(x);
                }
        }
        return labyrintti;
    }

    public boolean charAllowed(char x){
        return x == '1' || '2' <= x  && x <= '7' || x== ' ' || x == '.' || x == '*'|| x == 'G' || x == 'g' || x == 'P' || x == 'p';

    }



    public void test() throws Exception {
        char[][] labyrintti = readMaze("maze.txt");

        for (char[] row : labyrintti) {
            System.out.println(row);
        }

        System.out.println(labyrintti[0][0]);
        // TODO: kohdassa (0,0) pitäisi olla 7

        System.out.println(labyrintti[1][1]);
        // TODO: kohdassa (1,1) pitäisi olla '.'

        System.out.println(labyrintti[3][1]);
        // TODO: kohdassa (1,3) pitäisi olla '*'

        System.out.println(labyrintti[1][29]);
        // TODO: kohta (29,1) menee yli rajojen

        System.out.println(labyrintti[-1][-1]);
        // TODO: kohta (-1,-1) menee yli rajojen
    }


}
