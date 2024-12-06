import java.io.IOException;

//Create new build, and run in terminal print "java Main",
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String room = "##########" +
                "#        #" +
                "#    z   #" +
                "#  l     #" +
                "##########";

        Player player = new Player(5, 4,Sprites.getPlayerSprite(), 2, 3);
        Overworld t = new Overworld(room, player);
        t.run();

    }
}