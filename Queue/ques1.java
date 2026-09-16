import java.util.Scanner;
public class ques1 {

    public static class Queue{

        
        static int front;
        static int rear=-1;
        static int maxsize;
        static int[] arr;
        Queue(int maxsize){
            this.maxsize=maxsize;
            arr=new int[maxsize];
        }

        public static boolean isFull(){
            if(rear==maxsize-1){
                System.err.println("Queue Is Full");

            }
            return rear==maxsize-1;
        }
        public static boolean isEmpty(){
            if(rear==-1){
                System.out.println("queue is Empty");
            }
            return rear==-1;
        }

        public static void Enqueue(int value){
            if(!isFull()){
                rear++;
                arr[rear]=value;
                System.out.println("The Value :"+value+" Add in Queue");
                return ;

            }
        }

        public static int Dequeue(){
            if(!isEmpty()){
                front=arr[0];
                for(int i=0;i<rear;i++){
                    arr[i]=arr[i+1];
                }
                System.err.println("Value "+front+" Remove from Queue");
            }
            return front;
        }
        public static void Display(){
            for(int i = 0;i<=rear;i++){
                System.err.println(arr[i]);
            }
        }

        public static void size(){
            System.out.println("The size of Queue is "+(rear+1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue q=new Queue(10);
        int choice;
        do{
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter The Value you want to Add");
                    int value=sc.nextInt();
                    q.Enqueue(value);
                    break;

                case 2:
                    q.Dequeue();
                    break;

                case 3:
                    q.Display();
                    break;

                case 4:
                  q.size();
                  break;
                
                case 5:
                    System.err.println("Is Queue Empty "+q.isEmpty());
                    break;

                case 6:
                    System.out.println("Is Queue Full "+q.isFull());
                    break;

                case 7:
                    System.out.println("You Press Exit \n GoodBye");
                    break;
            
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }while(choice!=7);

        
    }
}
