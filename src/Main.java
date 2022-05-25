import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Streams 02
Exercise: Streams 2
Write a program that:

write using FileWriter the current date/time with seconds inside a file in src called file.txt
if the file already exists, alert the user about overwriting it
if not, alert the user of the new file creation
 */
public class Main {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Davide\\IdeaProjects\\Develhope\\Esercizio62\\src\\file.txt";
        File file = new File(filePath);

        if (file.exists()) System.out.println("The file already exists. It will be overwritten");
        else System.out.println("New file created");

        try (
                FileWriter writer = new FileWriter(filePath, false);
                PrintWriter pw = new PrintWriter(writer);
        ) {

            pw.print(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy/hh:mm a")));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
