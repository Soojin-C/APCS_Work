//Driver class for our High School Sim

import cs1.Keyboard;

public class Woo {
  public static Student protag;
  public static void main(String[] args) {
	String prompt;
	String name;
	int choice;

	prompt = "Welcome to North Shore High School! (copyright not intended)\n";
	prompt += "Please enter your name: ";
	System.out.println(prompt);
	name = Keyboard.readString();

	prompt = "Hi, " + name + "!\n";
	prompt += "In order to be a successful student at this school, select a personality for you to have: \n";
	prompt += "\t1: Smarticles -- pass all your classes with flying colors!\n";
	prompt += "\t2: Social Butterfly -- enchant your peers with your extrovertedness!\n";
	prompt += "\t3: Sleeping Beauty -- go your whole high school career without bags under your eyes!";
	System.out.println(prompt);

        choice = Keyboard.readInt();

	if (choice == 1) protag = new Smarticles(name);
	//else if (choice == 2) protag = new SocialButterfly(name);
	//else if (choice == 3) protag = new SleepingBeauty(name);
/*
  */
  System.out.println(protag.smarts+"<=smarts name=>"+protag.name);
    }
}
