
public class ques2 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static class queueLink {
            public static Node head=null;
            public static Node tail=null;

            public static boolean isEmpty(){
                return head==null;
            }

            //enqueue
        public static void add(int data){
                Node newNode=new Node(data);
                if(tail==null){
                    tail=head=newNode;
                    return ;
                }
                tail.next=newNode;
                tail=newNode;
            }

            //dequwuw
            public static int remove(){
                if(isEmpty()){
                    System.out.println("Queue is Empty Nothing remove");
                    return -1;
                }
                int front=head.data;
                if(head==tail){
                    tail=null;
                }
                head=head.next;
                return front;
            }

            //Display
            public static int peak(){
                if(isEmpty()){
                    System.out.println("Queue is Empty Nothing remove");
                    return -1;
                }
                
                return head.data;
            }
    
        }
        public static void main(String[] args) {
            queueLink q=new queueLink();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);

            while (!q.isEmpty()) {
                System.out.println(q.peak());
                q.remove();        
            }
        }
    
    }

    

