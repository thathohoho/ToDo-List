import java.util.Scanner;

public class ToDoList {

    private static String PointOne = "";
    private static String PointTwo = "";
    private static String PointThree = "";
    private static String PointFour = "";
    private static String PointFive = "";

    public static void main(String[] args){
        System.out.println("To-Do List Manager by hohoho");
        Setup();
    }

    private static void Setup(){
        PointOne = "[blank]";
        PointTwo = "[blank]";
        PointThree = "[blank]";
        PointFour = "[blank]";
        PointFive = "[blank]";
        List();
    }

    private static void List(){

        String[] ToDo = {PointOne, PointTwo, PointThree, PointFour, PointFive};
            for (int x = 0; x < ToDo.length; x++) {
                System.out.println(x+1 + ": " + ToDo[x]);
            }

        System.out.println("\nMenu");

        Scanner menu = new Scanner(System.in);
        String menuInput = menu.next();

        if (menuInput.equalsIgnoreCase("EditOne")) {
                Scanner editOne = new Scanner(System.in);
                String editOneInput = editOne.next();
                PointOne = editOneInput;}
        
        if (menuInput.equalsIgnoreCase("EditTwo")) {
                Scanner editTwo = new Scanner(System.in);
                String editTwoInput = editTwo.next();
                PointTwo = editTwoInput;}
        
        if (menuInput.equalsIgnoreCase("EditThree")) {
                Scanner editThree = new Scanner(System.in);
                String editThreeInput = editThree.next();
                PointThree = editThreeInput;}
        
        if (menuInput.equalsIgnoreCase("EditFour")) {
                Scanner editFour = new Scanner(System.in);
                String editFourInput = editFour.next();
                PointFour = editFourInput;}
        
        if (menuInput.equalsIgnoreCase("EditFive")) {
                Scanner editFive = new Scanner(System.in);
                String editFiveInput = editFive.next();
                PointFive = editFiveInput;}

        if (menuInput.equalsIgnoreCase("CheckOne")) {
            PointOne = PointOne + " √"; }
        if (menuInput.equalsIgnoreCase("CheckTwo")) {
            PointTwo = PointTwo + " √"; }
        if (menuInput.equalsIgnoreCase("CheckThree")) {
            PointThree = PointThree + " √"; }
        if (menuInput.equalsIgnoreCase("CheckFour")) {
            PointFour = PointFour + " √"; }
        if (menuInput.equalsIgnoreCase("CheckFive")) {
            PointFive = PointFive + " √"; }

        if (menuInput.equalsIgnoreCase("Reset")) {
            Setup();}

        List();

    }
}
