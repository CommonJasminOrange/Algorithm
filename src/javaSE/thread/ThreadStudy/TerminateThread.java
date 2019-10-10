package javaSE.thread.ThreadStudy;

/**
 * 终止线程
 * 1.线程执行完毕 --> 次数
 * 2.外部干涉--> 加入标识
 * 不使用stop
 */
public class TerminateThread implements Runnable{

    //1.创建标识
    private boolean flag = true;
    private String name;

    public TerminateThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0;
        //2.关联表示  true-->运行 false-->不运行
        while (flag){
            System.out.println(name+"-->"+i++);
        }
    }

    //3.对外提供方法 改变标识
    public void terminate(){
        this.flag = false;
    }

    public static void main(String[] args) {

        TerminateThread tt = new TerminateThread("C罗");
        new Thread(tt).start();
        for (int i = 0;i <= 99;i++){
            if (i == 88){
                tt.terminate();//线程的终止
                System.out.println("tt game over");
            }
            System.out.println("main-->"+i);
        }
    }
}
