public class Program {
    public static void main(String[] args) {
    //Урок 3. Стек и очередь. Задание 1.
        int arr[] = new int[] {1, 2, 3, 5, 6, 7};
        System.out.println("Пропущено число: " + FindNumber.search(arr));

    //Урок 3. Стек и очередь. Задание 2.
        Queue q = new Queue(5);
            q.insert(10);
            q.insert(20);
            q.insert(30);
            q.insert(40);
            q.insert(50);
            q.remove();
            q.remove();
            q.insert(99);
            q.insert(88);
            q.insert(770);
            int f = 0, maxsize = 5;
            while(f < maxsize){
                q.peek( f++);
            }
            q.remove();
            q.remove();
            q.insert(10);
            q.insert(20);
            q.insert(30);
            q.insert(40);
            q.insert(770);
            q.remove();
        //System.out.println(q.size());
            while(f < maxsize){
                q.peek( f++);
            }

        /*Notebook [] notebooks = new Notebook[20000];
        for (int i = 0; i < notebooks.length;i++){
            notebooks[i] = new Notebook();
        }
        Notebook.getArray(notebooks);
        Notebook.bubbleSortArray(notebooks);
        Notebook.getArray(notebooks);//Notebook*/
    }
}
