# Collection
集合与数组类似， 但集合中的数据量可以动态变化
## List 
存放的数据可以重复 ，并且有顺序
### ArrayList
ArrayList底层是Object数组 查询快 增删慢
* 添加：集合对象名.add(实参);
* 删除：集合对象名.remove(下标); 集合对象名.remove(指定删除内容); 备注 需要给集合指定泛型 .clear()清空
* 修改：集合对象名.set(下标,新值);
* 单个查询：集合对象名.get(下标);
* 遍历：1.for 2.foreach 3.lambda表达式(forEach)
### LinkedList
LinkedList底层是链表 增删快 查询慢

## Set
存放的数据不可以重复 ，并且无顺序
### HashSet
HashSet底层是哈希表
* 添加：集合对象名.add(实参);
* 删除：集合对象名.remove(指定删除内容);因为HashSet底层是哈希表没有下标因此不能通过下标删除 
* 修改：没有下标 因此没有修改方法 (删除+添加)
* 没有单个查询
* 遍历： 1.foreach 3.迭代器 Iterator
 ```
//通过迭代器遍历HashSet
Iterator<String> it = hash.iterator();
while(it.hasNext()) {
System.out.println(it.next());
}
 
System.out.println("==================");
 
//通过加强for循环遍历HashSet
for(String s: hash) {
System.out.println(s);
 ```
### TreeSet
TreeSet底层是二叉树 不可以重复，但是有序(对于实现了Comparable,Comparator接口的类型)
TreeSet中的方法与HasSet一样
## Map
双列型，存放数据无序，key不可以重复!(如果重复(是否重复根据equals方法)，则新的覆盖旧的)，value可以重复
HashMap 底层是哈希表
* 添加方法:
 