
package Thread;
public class RunnableInterfaceDemo implements Runnable {
    public void run(){
    for(int i=0; i<=5;i++){
        System.out.println("RunnableInterfaceDemo:"+i);
        try{
            Thread.sleep(1000);

        }
        catch (InterruptedException e){
            System.out.println(e);

        }
    }
}
        public static void main(String args[]){
            RunnableInterfaceDemo obj =new RunnableInterfaceDemo();
            Thread t2=new Thread(obj);
            t2.start();
        }
    }

