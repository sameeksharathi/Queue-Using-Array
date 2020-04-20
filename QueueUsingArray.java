public class QueueUsingArray {
    int arr[];
    int top;
    int beginning;
    public QueueUsingArray(int size){
        arr = new int[size];
        top = -1;
        beginning= -1;
    }
    public boolean isEmpty(){
        if(beginning == -1 || beginning == arr.length){
            return true;
        }else
            return false;
    }
    public boolean isFull(){
        if(top== arr.length-1){
            return true;
        }else
            return false;
    }
    public void enqueue(int data){
        if(isEmpty()){
            top++;
            beginning++;
            arr[beginning]=data;
        }
        else if(isFull()){
            System.out.println("Queue Overflow");
        }
        else{
            top++;
            arr[top]=data;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
        }
        else{
            for (int i = beginning; i <(top); i++) {
                arr[i]=arr[i+1];
            }
            top--;

        }
    }
    public void display(){
        for (int i = beginning; i < top+1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
