# CriminalIntent
Android Fragement RecyclerView
-
## 源码部分分为一下几个部分
1. 模型类
Crime类 恶行类
2. 单例类
创建为一个对象存放List<Crime>
3. Activity类
有一个抽象类SingleFragmentActivity类
两个Activity继承它并托管一下两个Fragment
4. Fragment类
一个实现CrimeList(即RecyclerView列表)
一个实现CrimeDetail(具体的恶行)
