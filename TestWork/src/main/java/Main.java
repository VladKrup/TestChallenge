import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* This program reads lines from a file, writes it to the list.
 Then, check each line in the list (after reversing it) on the line with the line following it.
 If this is true, the program connects the two lines, delete duplicate symbol and displays the result on the screen in the desired form.
*/

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Владелец\\IdeaProjects\\WorkTest\\src\\main\\java\\Dependency"));
        String line;
        while ((line = reader.readLine()) != null) {
            strings.add(line);
        }
        for (int i = 0; i < strings.size(); i++) {
            String tmp = rev(strings.get(i));
            if(i+1 == strings.size()){break;}
            String tmp2 = strings.get(i + 1).toString();
            if (tmp.equals(tmp2)) {
                concat(strings, i);
            }
        }


        }

    // reverse the String
    public static String rev(String tmp) {
        String b = new StringBuffer(tmp).reverse().toString();
        return b;
    }



   //result two Objects to String,concatenate they and out the result of the program
    public static void concat(List strings, int i) {
        String tmp = strings.get(i).toString();
        String tmp2 = strings.get(i + 1).toString();
        String result = tmp + tmp2;
        result = removeCharAt(result, 3);
        System.out.println(result);


    }

 // remove duplicate symbol after the concatenation
    public static String removeCharAt(String s, int pos) {

        return s.substring(0,pos) + s.substring(pos + 1);

    }

}





