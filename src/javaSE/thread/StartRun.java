package javaSE.thread;

/**
 * 创建线程 方式2
 * 1. 创建：实现Runnable + 重写 run()
 * 2. 启动: 创建实现类对象 + Thread对象 + start()
 * 3. 推荐  避免单继承的局限性  优先使用接口 方便共享资源
 *
 */
public class StartRun implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {

//        //创建实现类对象
//        StartRun sr = new StartRun();
//        //创建代理类对象Thread
//        Thread thread = new Thread(sr);
//        //启动线程
//        thread.start();//不保证立即运行 cpu调用
//        //st.run(); //普通方法调用 必须先听完歌才能学习
        //如果一个对象只使用一次,可以使用匿名  不用声明引用
        new Thread(new StartRun()).start();


        for (int i = 0; i < 20; i++) {
            System.out.println("一边学习");
        }
    }
}
