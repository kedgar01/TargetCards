import java.io.IOException;

public class HighScoreSetUp extends HighScore {
    //used to set up the file itself and view that the file has indeed been created and populated
    public static void main (String[] args) throws IOException {
        SetUpFile();
        ReadFile();
    }
}