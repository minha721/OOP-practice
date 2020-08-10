public class Queue {
   private int[] elements;
   private int size;
   public static final int DEFAULT_CAPACITY = 8;
   
   public Queue() {
      this(DEFAULT_CAPACITY);
   }

   public Queue(int capacity) {
      elements = new int[capacity];
   }
   
   public void enqueue(int value) {
	   if (size>=elements.length) {
		   int[] temp = new int[elements.length*2];
		   System.arraycopy(elements,0,temp,0,elements.length);
		   elements=temp;
	   }
	   elements[size++]=value;
   }
   
   public int dequeue() {
	   int temp = elements[0];
	   int[] newElements = new int[elements.length-1];
	   for(int i = 1; i < size; i++) {
		   newElements[i - 1] = elements[i];
	   }
	   elements = newElements;
	   size--;
	   return temp;
   }
   
   public boolean empty() {
	   return size==0;
   }
   
   public int getSize() {
	   return size;
   }
}