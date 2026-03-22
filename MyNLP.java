import java.util.ArrayList;
import java.util.Scanner;

 /**
   * My Nlp 
   * 
   * This is a grammar/punctuation check NLP that takes in
   * a users sentence and corrects basic grammar, double spacing,
   * and allows the user to also edit grammar
   * 
   * @author - Tim H
   * @author - Alex A
   */

public class MyNLP {

  //ArrayLists that store
ArrayList<String> ogSentences = new ArrayList<String>();
ArrayList<String> correctedSentences = new ArrayList<String>();
  // TODO: assigned initial values for your instance variables
  public MyNLP() {
    ogSentences.add("hello  guys.");
    ogSentences.add("this is cool");
        for(int i = 0; i < ogSentences.size(); i++){
        String fixed = fixDoubleSpace(ogSentences.get(i));
        fixed = fixPeriod(fixed);
        correctedSentences.add(fixed);
    }
  }

  /**
   * Pre-Condition - Parameter must be a valid string with more than 1 character
   * Post-Condition - Sentence without ending punctuation will have a period added
   * This is a student developed method
   * @param - sentence is the sentence that's going to be edited
   * @return - the sentence is going to be returned after it's modified
   */

public String fixPeriod(String sentence){
  if(sentence.length() == 0){
    return "Please Provide a Valid Sentence!"; //In case the sentence has nothing in it
  }
  String last = sentence.substring(sentence.length() - 1);
  if (last.equals(".") == false && last.equals("!") == false && last.equals("?") == false){ //Checks if theres no ending punctuation at the end
    sentence = sentence + ".";
  }
  return sentence;
}


  
  /**
   * Pre-Condition - Parameter must be a valid string with more than 1 character
   * Post-Condition - Sentence without more than 1 space between characters will be fixed to only 1 space
   * This is a student developed method
   * @param - sentence is the sentence that's going to be edited
   * @return - the sentence is going to be returned after it's modified
   */
  
public String fixDoubleSpace (String sentence){
  ArrayList<String> letters = new ArrayList<String>();
  for (int i = 0; i < sentence.length(); i++){
  letters.add(sentence.substring(i, i + 1));
  }
  for (int i = 1; i < letters.size(); i++){
  if (letters.get(i).equals(" ") && letters.get(i - 1).equals(" ")){
    letters.remove(i);
    i--; //decrement since array is shifted left
   }
  }
  String correctedSentence = "";
  for (int i = 0; i < letters.size(); i++){
    correctedSentence = correctedSentence + letters.get(i); //re-make the updated sentence to return
  }
  return correctedSentence;
}


  /**
   * Pre-Condition - Parameter must be a valid string with more than 1 character and have an ending punctuation
   * Post-Condition - Sentence's ending punctuation will be changed to the desired one chosen
   * This is a student developed method
   * @param - sentence is the sentence that's going to be edited
   * @param - newPunctuation is the punctuation the user wants it to be changed to
   * @return - the sentence is going to be returned after it's modified
   */
  
 public String changeEndingPunctuation(String sentence, String newPunctuation){
   if (sentence.length() == 0){
     return "Please Provide a Valid Sentence!"; //error handling
   }
   String sentenceNoEnding = sentence.substring(0, sentence.length() - 1); //Gets the sentence without the last value since it's the punctuation
   String updatedSentence = sentenceNoEnding + newPunctuation; //concatenates the sentence without the punctuation with the new value
   return updatedSentence; 
 }
  
  /**
   * Starts the app and gets user input
   */
  public void prompt() {
    Scanner input = new Scanner(System.in);
    
    // Starting text
    System.out.println("Welcome to my NLP app!");
    System.out.println("Please Only Answer 1 or 2!");
    System.out.println("1. Review or Edit Sentence!");
    System.out.println("2. Add a New Sentence!");
    String userInput = input.nextLine(); // collect userInput
    
    // Logic for userInput
    if (userInput.equals("1")) {
      for(int i = 0; i < ogSentences.size(); i++) {
      System.out.println("Original: " + ogSentences.get(i));
      System.out.println("Corrected: " + correctedSentences.get(i));
      System.out.println("--------------"); // Formatting
      } 
  
    } else if (userInput.equals("2")) {
      System.out.println("Enter The Sentence You Want To Add!");
      String newSentence = input.nextLine();
      ogSentences.add(newSentence);
      String revised = fixDoubleSpace(newSentence);
      revised = fixPeriod(revised);
      System.out.println("Do You Want to Change The Period to Something Else?");
      System.out.println("1. Keep period (.)");
      System.out.println("2. Change to exclamation (!)");
      System.out.println("3. Change to question (?)");
      String choice = input.nextLine();
      String newPunctuation = ".";
      if(choice.equals("2")) {
       newPunctuation = "!";
      } else if(choice.equals("3")){
       newPunctuation = "?";
      }
      revised = changeEndingPunctuation(revised, newPunctuation);
      correctedSentences.add(revised);
      System.out.println("Corrected: " + revised);
      
    } else {
      // Error Handling
      System.out.println("\nSorry, I dont understand that."); 
      System.out.println("Please restart, and only choose option 1 or 2, sometimes 3"); 
    }
    
    System.out.println("\nGoodbye!");
    input.close();
  }
  
  /**
   * Prints the amount of sentences corrected and what was modified
   */
  public void printSummary() {
  System.out.println("Total Sentenced Edited!: " + ogSentences.size());
  System.out.println("Original Sentences vs Corrected Sentences!");
  for (int i = 0; i < ogSentences.size(); i++){
    System.out.println("Original Sentence: " + ogSentences.get(i));
    System.out.println("Corrected Sentence: " + correctedSentences.get(i));
    System.out.println("-----------------");
  }
  }

}
