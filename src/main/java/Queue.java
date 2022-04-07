public class Queue {

        private int maxSize;
        private Integer[] queue;
        private int front;
        private int rear;
        private int items;
        public Queue(int s){
            maxSize = s;
            queue = new Integer[maxSize];
            front = 0;
            rear = -1;
            items = 0;
        }
        public void insert(int i){
            int numbers = maxSize, j = 0;
            if(isFull()){
                rear = -1;
                System.out.println("Queue is full !!!");
                return;
            }
            else if(!isFull()){
                while (numbers-1 >= 0){
                    if (queue[numbers-1] == null){
                        queue[numbers-1] = i;
                        System.out.println("insert " + i + " on index " + (numbers-1));
                        items++;
                        rear = numbers-1;
                        return;
                    }
                    numbers--;
                }
            }
        }
        public void remove(){
        if(isEmpty()){
            System.out.println("is empty");
            return;
        }
        int i = 0;
        while(i < maxSize){
            if (queue[i] != null) {
                System.out.println("delete " + queue[i] + " on index " + (i));
                queue[i] = null;
                items--;
                return;
            }
            i++;
        }
        }
        public void peek(int front){
            System.out.println("queue[front] = " + queue[front]);
        }
        public boolean isEmpty(){
            return (items==0);
        }
        public boolean isFull(){
            return (items==maxSize);
        }
        public int size(){
            return items;
        }
    }
