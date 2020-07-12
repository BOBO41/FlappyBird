# Flappy Bird
Flappy Bird for desktop platforms.

基于Java和JDK基本库的Flappy Bird

开发平台为macOS 10.15.5，开发工具为Eclipse IDE (4.16.0)，Java SE 8[1.8.0_251]


### 游戏启动界面
![image](https://github.com/kingyuluk/flappy-bird/blob/master/examples/start.png)

### 运行示例
![image](https://github.com/kingyuluk/flappy-bird/blob/master/examples/play.gif)

### 游戏结束界面
![image](https://github.com/kingyuluk/flappy-bird/blob/master/examples/over.png)


# Package Contents
* com.bird.app    游戏的入口

* com.bird.main   游戏的内容

* com.bird.util   自定义的工具

# Change Log

v1.2.1 - July 12, 2020
* 使用AudioClip类的方法播放连续的短音频会导致线程冲突使游戏卡顿

  改用sun.audio类的AudioPlayer方法播放音频
  
v1.2.0 - July 11, 2020
* 现在水管可以移动了，随着游戏分数的上升会提升游戏难度

v1.1.0 - July 11, 2020
* 添加了悬浮型的水管

v1.0.0 - July 10, 2020
* 具备完整的游戏功能

# Notes

* 文本编码格式为UTF-8，若注释出现乱码请修改编译器的文本编码格式

* 由于使用了sun.*包，不同版本的JDK中sun包中的类可能发生变化，因此无法确保工作在所有JAVA平台上

# Contact
* email: <kingyuluk@mail.dlut.edu.cn>