import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 *@author johan
 *
 * program displays basic filereading using
 * try with resource
 */

public class FileTutorial {

  public static void main(String [] args) throws IOException {

    Path path = Paths.get("/home/johan/programmering/java/files/notes.txt");
    Charset charSet = Charset.forName("UTF-8");

    try( BufferedReader br = Files.newBufferedReader(path,charSet) ){
      String line = null;

      while((line = br.readLine()) != null){
	System.out.println(line);
      }

    }catch(IOException e){ 
      e.printStackTrace();
    }

  }

}
