# JVM分代垃圾回收
![avatar](https://upload-images.jianshu.io/upload_images/1527923-ae6b5c45212fc181.jpg?imageMogr2/auto-orient/strip|imageView2/2/w/922/format/webp)  
### Minor GC
用于清理年轻代区域。Eden区满了就会触发-次Minor GC,清理无用对象,将有用对象复制
### Major GC
用于清理老年代区域。
### Full GC
用于清理年轻代、年者代区域。成本较高,会对系统性能产生影响。
### Eden
Eden区存储了从未通过垃圾回收的新对象
### Survivor
存放垃圾回收后，仍然有用的对象，循环存放，小于15次垃圾回收次数
### Tenured
年老代区域存放超过15次垃圾回收的对象

年轻代（Young Generation）分为 eden 和 Survivor 两个区，Survivor 又分为2个均等的区，S0 和 S1。  
首先，新对象都分配到年轻代的 eden 空间，Survivor 刚开始是空的。  
当 eden 满了以后，minor gc 就被触发了。  
还被引用的对象被复制到第一个 survivor 空间，然后把整个 eden 空间都清理掉。  
下一次 minor gc 时还是同样的过程，把 eden 中还被引用的对象复制到 survivor 空间，然后清除 eden 空间，只是这次是复制到第二个 survivor（S1），同时，把上次 minor gc 移到 S0 中的对象也移到 S1，并增加这些对象的年龄，移到 S1 之后，S0 也被清理掉，这时，eden 和 S0 都干净了。  
下一次 minor gc 同理，只是这次换为了 S0，eden 和 S1 都干净了。  
这个过程不断重复，这样 survivor 中对象的年龄会一直增长，当达到一定程度（例如8），这个对象就从年轻代转移到了老年代。  
这样，老年代中的对象就持续增加。最后就会触发 major gc 对老年代空间进行清理和压缩。    

每个对象都有一个“年龄”，这个年龄实际上指的就是该对象经历过的minor gc的次数。当对象刚分配到Eden区域时，对象的年龄为“0”，当minor gc被触发后，所有存活的对象（仍然可达对象）会被拷贝到其中一个Survivor区域，同时年龄增长为“1”。并清除整个Eden内存区域中的非可达对象。  
重复多次(默认15次)Survlvor中没有 被清理的对象,即“年龄”为15，则会复制到老年代Old(Tenured)区中，  
当Old区满了则会触发一 个次完整地垃圾回收 ( FullGC) ,之前新生代的垃圾回收称为 (minorGC )  
  
