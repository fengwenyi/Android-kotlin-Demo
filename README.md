# Android-Kolin-Demo
用 `Kotlin` 编写的Andrroid 小的 `Demo`，相信一个个的小知识点，终究会发挥无穷力量！

### 1、app
这个是默认的，什么也没有

---
### 2、Loading
以前我一直在用 ~~ProgressDialog~~ ，没在意 `已弃用`，今天突发奇想，点进去了，看到类上有这样一段注释：

```
 * @deprecated <code>ProgressDialog</code> is a modal dialog, which prevents the
 * user from interacting with the app. Instead of using this class, you should
 * use a progress indicator like {@link android.widget.ProgressBar}, which can
 * be embedded in your app's UI. Alternatively, you can use a
 * <a href="/guide/topics/ui/notifiers/notifications.html">notification</a>
 * to inform the user of the task's progress.
```

我又继续点`android.widget.ProgressBar`，然后上网搜一下，看到有很多教程，效果也还不错，虽然用ProgressDialog也能达到效果及目的，但有删除线，终归是不好看的，索性就尝试下吧！于是有了这个 `Loading`。

但我想，应该还会有跟多的 `Demo` 吧！做个系列如何？

闲话少说，Loading正式开始

![目录](https://github.com/fengwenyi/Android-kotlin-Demo/blob/master/Screenshot/Loading/_1.jpg?raw=true)

从目录可以看到 `ProgressBar` 已经为我们提供了很多很好的功能了，足以满足我们的项目求了吧！

下面来看看模糊进度的示例：
![模糊进度](https://github.com/fengwenyi/Android-kotlin-Demo/blob/master/Screenshot/Loading/_2.jpg?raw=true)

这里值得一说的是，如果 `API >= 21` 那么支持这种样式，否则为 `黑白`。

下面来看下进度条示例了
![进度条](https://github.com/fengwenyi/Android-kotlin-Demo/blob/master/Screenshot/Loading/_3.jpg?raw=true)

这是一个动画，不能演示效果，遗憾！

当然，我们还能自定义样式：
![自定义样式](https://github.com/fengwenyi/Android-kotlin-Demo/blob/master/Screenshot/Loading/_4.jpg?raw=true)
