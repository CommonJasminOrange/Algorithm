package javaSE.thread;

/**
 * 创建线程
 * 1. 创建：继承 Thread + 重写 run()
 * 2. 启动: 创建子类对象 + start()
 * 3.
 */
public class StartThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {

        //创建子类对象
        StartThread st = new StartThread();
        //启动线程
        st.start();  //不保证立即运行 cpu调用
        //st.run(); //普通方法调用 必须先听完歌才能学习


        for (int i = 0; i <20; i++){
            System.out.println("一边学习");
        }
    }
}
