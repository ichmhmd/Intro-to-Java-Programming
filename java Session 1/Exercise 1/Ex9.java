/*
(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
*/
public class Ex9 {
    public static void main(String[] args){

        System.out.println("Miles / (hour + (minutes / 60) + (seconds / 3600)) * 1.6" );
        int Miles=24; int hours=1; int minutes= 40; int seconds=35;

        double Average= (Miles / (hours + (minutes / 60) + (seconds / 3600)) * 1.6);

        System.out.println("Average in kilometers is equal: " + Average );

    }
}
