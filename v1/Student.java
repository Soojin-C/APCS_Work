import cs1.Keyboard;

public abstract class Student {
  int smarts;
  int socials;
  int rest;
  int happiness;
  String name;
  int sameCourse;
  Courses first;
    public Student (){//sets the 3 attributes to the base case.
      String prompter;
      smarts = 5;
      socials = 5;
      rest = 5;

      //extraCourses = new ArrayList<Courses>(1); //Smarticles have 2 extra courses.

      prompter = "Please choose a extra class:\n";
      prompter += "\t1: History\n";
      prompter += "\t2: Art Appreciation\n";
      prompter += "\t3: Science";
      System.out.println(prompter);
      sameCourse = InsertCourse();

    }
    public Student(String newName) {//sets the name of a new student.
      this();
      name = newName;
    }

    public int InsertCourse(){
      int courseNum = Keyboard.readInt();

      if (courseNum == 1) {
        first = new History();}
      else if (courseNum == 2)  {
        first = new ArtApp();}
      else if(courseNum == 3){
        first = new Science();}
      else {
        System.out.println("TryAgain");
        InsertCourse();
      }
      return courseNum;
    }
}
