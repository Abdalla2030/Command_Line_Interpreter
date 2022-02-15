package Command_Line;
import java.util.Arrays;

class Parser {
String commandName;
String[] Args;
public boolean parse(String input) {
     String[] inputSplit = input.split(" ") ;
    commandName = inputSplit[0]; 
    String[] newArray = new String[inputSplit.length-1];
    for (int i= 1 ; i< inputSplit.length ;i++){
        newArray[i-1] = inputSplit[i] ; 
    }
    Args = Arrays.copyOf(newArray,newArray.length);
    ////////////////////////////////////  
    if ( ( commandName.equals("pwd") || commandName.equals("help")) && Args.length != 0){
        System.out.println("ERROR: " + commandName + " not take any argumnent!");
	return false;
    }
    /////////////////////////////////////
    if ( ( commandName.equals("mkdir") ||commandName.equals("cat") ) && Args.length == 0 ){
        System.out.println("ERROR: " + commandName + " take at least 1 argument!");
	return false;
    }
    /////////////////////////////////////
     if ( ( commandName.equals("echo") || commandName.equals("rmdir") ||commandName.equals("touch")
         ||commandName.equals("rm") ) && Args.length != 1 ){
        System.out.println("ERROR: " + commandName + " take one argument!");
	return false;
    }
    /////////////////////////////////////
    return true ; 
}
 public String getCommandName(){
  return commandName;
 }
 public String[] getArgs(){
  return Args; 
}
}
