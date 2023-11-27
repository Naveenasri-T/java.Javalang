package Thread;
public class ThreadClassDemo extends Thread{
    public void run(){
        for( int i=0; i<=5; i++){
            System.out.println("threadclassdemo:"+i);
            try{
                Thread.sleep(1000);

            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            


        }
    }
    public static void main(String[] args) {
        ThreadClassDemo t1= new ThreadClassDemo();
        t1.start();
    }
}
