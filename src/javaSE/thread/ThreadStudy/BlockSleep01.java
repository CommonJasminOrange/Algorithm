package javaSE.thread.ThreadStudy;

import javaSE.thread.Web12306;

/**
 * sleep模拟网络延时，放大了发生问题的可能性
 */
public class BlockSleep01 implements Runnable{

    //票数
    private int ticketNums = 90;

    @Override
    public void run() {
        while (true){
            if (ticketNums < 0){
                break;
            }
            //模拟网络延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
        }

    }

    public static void main(String[] args) {
        //一份资源
        Web12306 web = new Web12306();
        System.out.println(Thread.currentThread().getName());
        //多个代理
        new Thread(web,"码农").start();
        new Thread(web,"马处").start();
        new Thread(web,"蚂蟥").start();
    }
}
