import java.util.Scanner;

public class ques1{
    public static class Stack{
        static int max=10;
        static int[] stackk=new int[max];
        static int top=-1;
        public static boolean isEmpty(){
            if(top==-1){
                System.out.println("The Stack is Empty");
            }
            return top ==-1;
        }

         public static boolean isFull(){
            if(top==max-1){
                System.out.println("The Stack is Full");
            }
            return top==max-1;
        }


        public static void push(int value){
            if(!isFull()){
            top++;
            stackk[top]=value;
            System.out.println("The Value :"+value+" Add in Stack");
            }           
        }

        public static int pop(){
            if(!isEmpty()){
            System.err.println("Value "+stackk[top]+" Remove from Stack");
            }
            return stackk[top--];
            
        }

        public static int peak(){
            return stackk[top];
        }

        public static void display(){
            if(!isEmpty()){
                System.out.println("The Stacks Values are ");
           for(int i=top;i>=0;i--)
            System.out.println(stackk[i]);
           }
        }

        public static void size(){
            System.out.println("The size of Stack is " + (top+1));
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        Stack s =new Stack();
        do{
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.println("Enter the No of Operation you want ot perform");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    if (!s.isFull()) {
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();
                        s.push(value);
                    }
                    break;
                case 2:
                    if(!s.isEmpty()){
                        s.pop();
                    }
                    break;
                case 3:
                    s.display();
                    break;

                case 4:
                    s.size();
                    break;

                case 5:
                    System.out.println("Is Stack Empty "+ s.isEmpty() ); 
                    break;

                case 6:
                    System.out.println("Is Stack Full "+ s.isFull()); 
                    break;

                case 7:
                    System.out.println("You press Exit \n GoodBye");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }while(choice!=7);
        

    }
}
