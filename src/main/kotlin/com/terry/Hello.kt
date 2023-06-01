package com.terry   //定義類別前導名稱

// 在 Kotlin 中定意函示，只要【fun 函式名稱 (字串的陣列)】
fun main(args: Array<String>) {
    //println("Hello kotlin")

    // **【2】**
    // 完成【1】之後，要如何將一個 Human 類別產生到記憶體當中呢？
    // 在 Kotlin 裡面呼叫「建構子」不需要再寫 new，只需要「Human()」就可以產生物件並呼叫裡面的方法
    Human().hello()

    // 儲存物件：使用「val」常數 與「var」變數
    val h = Human()
    h.hello()
}




// **【1】**
// 在 Kotlin 中，要設計「類別」只需要寫「class 類別名稱 {}」就可以了
/* 注意如果這邊用「class Person {}」會與「Person.java」中的「public class Person {}」名稱衝突，不可以這樣重複
   不然就是要把類別放在不同「Package」下面（此指 package com.terry ）
*/
class Human {

    //  回傳值不用寫在方法的名稱前面，不回傳資料時可以不用寫任何資訊，void 不用寫
    fun hello() {
        println("Hello.kt 裡面的 Hello kotlin!!")
    }
}