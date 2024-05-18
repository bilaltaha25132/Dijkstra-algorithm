import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Graph graph=Graph.createGraph();
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.println("***** HELLO AND WELCOME TO THE PAKISTAN FIRST EVER TRAIN APPLICATION *****\n");
        String message="\nEnter Your choice of options \nPress 1: To Display All Stations"+"\n"+
                "Press 2: To Display the Train Map"+"\n"+
                "Press 3: To Find the Shortest route from source 'A' to destination 'B'"+"\n"+
                "Press 4: To Find the Quickest route from source 'A' to destination 'B'"+"\n"+
                "Press 5: To Find the Cheapest route from source 'A' to destination 'B'"+"\n"+
                "Press 6: To View Your Destination Searches"+"\n"+
                "Press 7: To Exit"+"\n";
        System.out.println(message);
        i=sc.nextInt();
        while(i!=7){
            if(i==1) {
                graph.displayAllStations();
                System.out.println(message);
                i = sc.nextInt();
            }
            if (i==2) {
                graph.displayMap();
                System.out.println(message);
                i=sc.nextInt();
            }
            if(i==3){
                System.out.println("Enter source A: ");
                String source= sc.next();
                System.out.println("Enter destination B: ");
                String destination=sc.next();
                graph.shortestDistance(source,destination);
                System.out.println(message);
                i=sc.nextInt();
            }
            if(i==4){
                System.out.println("Enter source A: ");
                String source= sc.next();
                System.out.println("Enter destination B: ");
                String destination=sc.next();
                graph.shortestTime(source,destination);
                System.out.println(message);
                i=sc.nextInt();
            }
            if(i==5){
                System.out.println("Enter source A: ");
                String source= sc.next();
                System.out.println("Enter destination B: ");
                String destination=sc.next();
                graph.shortestCost(source,destination);
                System.out.println(message);
                i=sc.nextInt();
            }
            if(i==6){
                graph.getRecentDestinations();
                System.out.println(message);
                i=sc.nextInt();
            }

        }

        System.out.println("********* FAREWELL, WAITING FOR OUR NEXT MEETING :-) ****************** ");


    }
}
