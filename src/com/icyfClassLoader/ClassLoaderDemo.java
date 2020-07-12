package com.icyfClassLoader;

/**
 * @Author: ESy
 * @Date: 2020/6/2 23:12
 * static ClassLoader.getSystemClassLoader() 返回用于委托的系统类加载器
 * ClassLoader getParent() 返回父类加载器进行委派
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader); //sun.misc.Launcher$AppClassLoader@18b4aac2

        ClassLoader loaderParent = loader.getParent();
        System.out.println(loaderParent); //sun.misc.Launcher$ExtClassLoader@1540e19d

        ClassLoader loaderParentParent = loaderParent.getParent();
        System.out.println(loaderParentParent); //null

    }
}
