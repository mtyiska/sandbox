class MyComputer extends Thread{
    private int threadNo;

    public MyComputer(int threadNo) {
        this.threadNo = threadNo;
    }

    public void countMe(){
        for(int i =0; i<=9; i++){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value of i is: "+i +" and the thread number is: "+threadNo);
        }
    }

    @Override
    public void run() {
       countMe();
    }
}

public class App{
    public static void main(String[] args) {
        MyComputer counter1 = new MyComputer(1);
        MyComputer counter2 = new MyComputer(2);

        long startTime = System.currentTimeMillis();
        counter1.start();
        System.out.println("******************");
        counter2.start();

        long endTime = System.currentTimeMillis();
        System.out.println("Total time : "+ (endTime - startTime));
    }
}