//   Abdalla Fadl Shehata           
//   20190305 
package Command_Line;
import java.util.Scanner;
import java.io.IOException;
//////////////////////////////////
public class Main{
public static void main(String[] args) throws IOException {
    Parser parser = new Parser();
    Terminal terminal = new Terminal();  
    String command;
    String[] Args;
    String userInput;
    boolean keep = true ; 
    Scanner input = new Scanner(System.in);
    while (keep){
        System.out.print(">");
        userInput = input.nextLine();
        if (userInput.equals("exit")){
            keep = false ; 
            break ; 
        }
        if(parser.parse(userInput) ) {
            command = parser.getCommandName();
            Args = parser.getArgs(); 
            terminal.chooseCommandAction(command ,Args);
        } 
    }
}   
}
