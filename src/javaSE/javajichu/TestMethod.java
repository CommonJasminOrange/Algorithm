package javaSE.javajichu;
//方法
public class TestMethod {
    public static void main(String[] args) {
        //通过对象调用普通方法
        TestMethod tm = new TestMethod();
        tm.print();
        int c = tm.add(1,2,3)+1000;
        System.out.println(c);
    }

    void print(){
        System.out.println("北京是中国的");
        System.out.println("香港是中国的");
        System.out.println("台湾是中国的");
    }
    int add(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
        return sum;  //return作用: 1.结束方法运行 2.返回值
    }
}
