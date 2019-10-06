package javaSE.Collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试Map常用方法
 */
public class TestMap2 {
    public static void main(String[] args) {

        Employee e1 = new Employee(1001, "我", 50000);
        Employee e2 = new Employee(1001, "你", 5000);
        Employee e3 = new Employee(1001, "她", 5000);
        Employee e4 = new Employee(1001, "她", 50500);

        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, e1);
        map.put(2, e2);
        map.put(3, e3);
        map.put(3, e4);

        Employee employee = map.get(1);
        System.out.println(employee.getEname());

        System.out.println(map);

    }
}

//雇员信息
class Employee {
    private int id;
    private String ename;
    private double salayr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalayr() {
        return salayr;
    }

    public void setSalayr(double salayr) {
        this.salayr = salayr;
    }

    public Employee(int id, String ename, double salayr) {
        this.id = id;
        this.ename = ename;
        this.salayr = salayr;
    }

    @Override
    public String toString() {
        return "id:"+id+" name:"+ename+" salary:"+salayr;
    }
}