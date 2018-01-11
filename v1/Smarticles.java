import cs1.Keyboard;

public class Smarticles extends Student{
  Courses second;
  public Smarticles(){
    super();
    String prompter;
    smarts += 2;//gives an extra boost based on the personality type.

    prompter = "Please choose another extra class:\n";
    prompter += "\t1: History\n";
    prompter += "\t2: Art Appreciation\n";
    prompter += "\t3: Science";
    System.out.println(prompter);
    InsertCourse2();

    second.please();
  }

  public Smarticles(String newName){
    this();
    name = newName;
  }
  public void InsertCourse2(){
      int courseNum = Keyboard.readInt();

      if ((courseNum == 1) && (sameCourse != 1)) {
        second = new History();}
      else if ((courseNum == 2) && (sameCourse != 2)) {
        second = new ArtApp();}
      else if((courseNum == 3) && (sameCourse != 3)){
        second = new Science();}
      else {
        System.out.println("TryAgain");
        InsertCourse2();
      }
    }
}
