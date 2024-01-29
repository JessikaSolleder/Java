
import java.util.Random;
import java.util.Scanner;

public class ExerciseApp {

        public static void main(String[] args) {
            Scanner cry = new Scanner(System.in);
/* Random exercise generator */
do {

    String[] exerciseBank = {"Crunches", "Push Ups", "Pull Ups", "Bench Press", "Lateral DB Flyes", "Side Crunches", "Toe Crunches", "Tricep Extensions", " Hyperextensions", "Front Raise", "Bosu ball squat", "Bent Over Row", "Arnold Press", " Seated Leg Cross Overs", "X-walks", "Leg Lifts (Any)","Twisted Knee Raises", "Negative Pull Ups", "Boat Pose with Scissor Variation", 
     "Calf Raises", "Bicycle Crunches", "KB Shoulder Press", "KB Halos", "Steering Wheels", " Seated Battle Rope", "Oblique V-Up", "Shoulder Ext & Int Rotation", "Lat Pulldown", " Hip Adductor", "Hip Abductor", "Cable Face Pulls", "Inchworms", "Bb Row"};
    
    var randomIndex = new Random().nextInt(exerciseBank.length);

    String randomExercise = exerciseBank[randomIndex];
    
    System.out.println("Exercise: " + randomExercise);


/* Random period of time generator */

String[] secondsBank = {"15", "20", "25", "30", "35", "40", "45", "50", "55", "60"};

   var randomSecondsIndex = new Random().nextInt(secondsBank.length);

   String randomSeconds = secondsBank[randomSecondsIndex];
    
    System.out.println("Seconds: " + randomSeconds);
    
}

while (!finished(cry));}


public static boolean finished(Scanner cry) {

    System.out.println("Are you crying yet? Y/N");
    String result = cry.next();


    return result.equals("Y");
}


}
