package javaSE.thread.ThreadStudy;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * sleep模拟网络延时，放大了发生问题的可能性
 */
public class BlockSleep02 implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        //倒计时
        Date endTime = new Date(System.currentTimeMillis()+1000*10);
        long end = endTime.getTime();
        while (true){
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            Thread.sleep(1000);
            endTime = new Date(endTime.getTime()-1000);
            if (end-1000 > endTime.getTime()){
                break;
            }
        }
    }

    @Override
    public void run() {

    }



}
