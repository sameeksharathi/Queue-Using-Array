class queueMain{
    public static void main(String[] args){
        QueueUsingArray obj = new QueueUsingArray(5);
        obj.dequeue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.display();
        obj.enqueue(40);
        obj.enqueue(50);
        obj.display();
      //  System.out.println(obj.beginning);
       // System.out.println(obj.top);
        obj.enqueue(60);
        obj.dequeue();
        obj.display();

    }
}
