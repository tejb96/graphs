
public class Queue {
	private int max_size;
	private int tail=-1;
	private int head=-1;
	private int[] queue;
	
	// Define Queue
	public Queue(int max_size) {
		this.max_size=max_size;
		queue=new int[this.max_size];
	}
	// Enqueue
	public void enqueue(int data)
	{
		if(tail==max_size-1) {
			return;
		}
		else {
			if(head==-1&&tail==-1) {
				head=tail=0;
			}
			else {
				tail+=1;
			}
			queue[tail]=data;
			System.out.println("Enqueued node: " +data);
		}
	}
	
	// Dequeue
	public int dequeue()
	{
		int data;
		if(head<0||head>tail) {
			System.out.println("Queue is empty - underflow");
			return -1;
		}
		else {
			data=queue[head];
			queue[head]=0;
			head+=1;
		}
		System.out.println("Dequeued node: "+data);
		return data;
	}
	
	// Display queue
	public void display()
	{
		for(int i=0;i<queue.length;i++) {
			System.out.print(queue[i]+" ");
		}

	}

	// Add any other parts needed
	public boolean isEmpty() {
		return (head == -1 || head > tail);
	}
}
