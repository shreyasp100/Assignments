import java.util.*;
public class tokenring{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("enter the number of nodes: ");
        int n = sc.nextInt();

        System.out.println("The ring formed is as below:");
        for(int i =0;i<n;i++){
            System.out.print(i + " ");
        }
        System.out.println("0");

        int choice = 0;
        int token = 0;

        do{

            System.out.print("Enter the sender: ");
            int sender = sc.nextInt();

            System.out.print("Enter the receiver: ");
            int receiver = sc.nextInt();

            System.out.print("Enter the data: ");
            int data  = sc.nextInt();

            System.out.print("Token Passing:");
            for(int i=token;i<sender;i++){
                System.out.println(""+i+"->");
            }
            System.out.println(" "+sender);

            System.out.println("Sender " +sender+ " is sending data "+data);
            for(int i=sender;i!=receiver;i=(i+1)%n){
                System.out.println("Data " +data+ " is forwarded by "+i);
            }
            System.out.println("Receiver " +receiver+ " is receiving "+data);

            token = sender;

            System.out.println("Do you again want to enter data. If yes enter 1, If NO enter 0");
            choice = sc.nextInt();


        }while(choice == 1);

    }

}
