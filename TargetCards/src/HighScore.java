import java.io.*;

public class HighScore extends TargetCards{
    //name of file being used to store high scores
    public static File highScores = new File("HighScores.txt");


    //sets up file and creates it
    public static void SetUpFile() throws IOException {
        FileWriter fw = new FileWriter(highScores, true);
        BufferedWriter bw = new BufferedWriter(fw);
        String HighScores = "*** HIGH SCORES ***";
        bw.write(HighScores);
        bw.newLine();
        bw.close();
    }

    //reads file to screen
    public static void ReadFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(highScores));
        String entry;
        while ((entry = br.readLine()) != null) {
            System.out.println(entry);
        }
    }

    //allows for scores to be added to file
    public static void AddScores(String score) throws IOException {
        FileWriter fw = new FileWriter(highScores, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(score);
        bw.newLine();
        bw.close();

    }
}