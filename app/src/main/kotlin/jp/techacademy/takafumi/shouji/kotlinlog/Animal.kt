package jp.techacademy.takafumi.shouji.kotlinlog

/**
 * Animal抽象クラス
 */
abstract class Animal {
    /** 名前 */
    protected var name: String
    /** 年齢 */
    protected var age: Int

    /**
     * コンストラクタ
     * @param name 名前
     * @param age 年齢
     */
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    /**
     * セリフを出力する抽象メソッド
     */
    abstract fun say()
}