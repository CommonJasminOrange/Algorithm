# 合并排序的递归算法和非递归算法 (java)
 
## 什么是归并排序
归并排序其实就做两件事：
“分解”——将序列每次折半划分。
“合并”——将划分后的序列段两两合并后排序。 

##首先我们来看一下分解是怎样实现的呢？
```
// 递归退出条件，即left >= right的时候
 if (left < right) {
    // 找出中间索引
    i = (left + right) / 2;
    // 对左边数组进行递归
     mergeSort(a, 0, center);
    // 对右边数组进行递归
    mSort(a, i + 1, right);
     // 合并
   merging(a, left, i, right);
 }
 ```




