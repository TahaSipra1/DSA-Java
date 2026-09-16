import java.util.Scanner;

public class ques1 {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=10;
        int [] arr=new int[max];
        int choice;
        int size=0;
        System.out.println("Array Size is 10");
        System.err.println();
        do{
            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace/Update value at index");
            System.out.println("10. Size");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

           switch (choice) {
            case 1:
                if(size==max){
                        System.err.println("Array Size Full");
                    }
                    else{
                    System.out.println("Enter the value");
                    int value=sc.nextInt();
                    arr[size]=value;
                    size++;
                    System.out.println("Value Added");
                    }
                break;

            case 2:
                if(size==max){
                        System.err.println("Array Size full");
                    }
                    else{
                    System.out.println("Enter the value");
                    int value=sc.nextInt();
                    System.out.println("Enter the index");
                    int index=sc.nextInt();
                    for(int i=size;i>index;i--){
                        arr[i]=arr[i-1];
                    }
                    arr[index]=value;
                    size++;
                    System.out.println("Value Added");
                    }
                break;

            case 3:
                System.out.println("Give the value  (Press 1 for Stop)");
                int value=sc.nextInt();
                while (size<max) {
                    if(value==1){
                        break;
                    }
                    arr[size]=value;
                }
                System.out.println("All Values Added");
                break;
            
            case 4:
                size--;
                System.out.println("Last Element Deleted");
                break;

            case 5:
                System.out.println("Enter index ");
                int index=sc.nextInt();
                for(int i=index;i<size;i++){
                    arr[i]=arr[i+1];
                }
                size--;
                System.out.println("Element Deleted");
                break;
            case 6:
                for(int i=0;i<size;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                break;

            case 7:
                System.out.println("Enter the value you want to Search");
                int search =sc.nextInt();
                boolean found=false;
                for(int i =0;i<size;i++){
                    if(arr[i]==search){
                        System.out.println("Value Found on index :"+i);
                        found=true;
                    }
                }
                if(found!=true){
                    System.out.println("Value Not Found");
                }
               
                break;

            case 8:
                System.out.println("Enter the index ");
                index=sc.nextInt();
                System.out.println("Value at  This Index  is "+arr[index]);
                break;
            
            case 9:
                 System.out.println("Enter the new value");
                value=sc.nextInt();
                System.out.println("Enter the index");
                index=sc.nextInt();
                arr[index]=value;
                break;

            case 10:
                System.out.println("The Size of Array is Now "+size);
                break;

            case 11:
                System.out.println("Your press for Exit");
                System.out.println("Good Bye");
                break;

            default:
                System.out.println("Invalid choice");

           }


        }while(choice!=11);
    }
}
