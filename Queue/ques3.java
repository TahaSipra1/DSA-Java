public class ques3 {
    public static class QueueCir{
        static int arr[]; 
        static int size;
        static int rear=-1;
        static int front =-1;
        QueueCir(int n){
            arr=new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear==-1 && front ==-1;
        }
        public static boolean isFull(){
            return (rear+1) %size==front;
        }


        //Enqueqe
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue Full");
                return ;
            }
            //1 element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }


        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1 ;
            }
            int result=arr[front];

            //If there is only one element
            if(front==rear){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }

            return result;
        }


        public static int peak(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1 ;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        QueueCir q=new QueueCir(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        while (!q.isEmpty()) {
            System.out.println(q.peak());
            q.remove();
        }
    }
}
