package com.terry;        //定義類別前導名稱


// Java 規定要把 main 方法寫在一個不相干的「類別」上（此指 Hello），才能執行程式
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world");    //要分號結尾「;」

        // 要讓「類別」（此指 Person）有功能，要將此類別產生到記憶體中讓他去執行
        // 使用「new」關鍵字，在記憶體當中把這個「類別」（此指 Person）生出來，被生出來「類別」稱之為「物件」
        /*「物件」身上有很多可以使用的功能，有小括號圖示的叫做「功能」也叫做「方法」
           會有這些方法是因為 Java 裡面規定，如果一個「類別」沒有繼承任何的「父類別」，它一率繼承「java.lang.Object 類別」
           所以在「new Person().」後續下拉選單可以看到很多功能，那些都是「Object 類別」給的
        */
        // 當在「Person 類別」中新增了「public void hello() {}」方法後，「new Person().」後續下拉選單就會看到「hello()」可以使用
        new Person().hello();

        // 印出「"我是 Person.java 中的 hello 方法!!!"」是由「Person 類別」中的 hello 方法所提供
        // 也可以將「記憶體中的 Person() 物件」（new Person().）儲存起來到別的物件，再利用該物件去呼叫 hello 方法
        /* 先定義一個「專們存放 Person 物件」的物件 p（Person p），也就是等號右邊先在記憶體當中生出一個 Person 物件
           再將這個物件的住址寫在一張叫 p 的紙上面，即 p 代表記憶體裡面的這個 Person 物件
         */
        Person p = new Person();   // 儲存物件

        // 接下來就可以 p 物件去呼叫他身上的「Hello 方法」得到結果
        p.hello();
    }
}

