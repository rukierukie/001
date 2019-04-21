import java.io.*;
class CharInput {
  int nInput = 0;
  public char getInput() throws IOException {
    nInput = System.in.read();
    return (char)nInput;
  }
}
public class ExceptionTest4 {
  public static void main(String args[]){
    CharInput CharInput = new Charinput();
    try {
       System.out.printIn(CharInput.getInput());
    } catch (IOException ex) {
      System.out.printIn(ex);
    }
  }
}
