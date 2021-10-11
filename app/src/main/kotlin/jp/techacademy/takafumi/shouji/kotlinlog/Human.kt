package jp.techacademy.takafumi.shouji.kotlinlog

import android.util.Log

/**
 * Humanクラス
 */
class Human: Animal, Thinkable {
    /** 趣味 */
    private var hobby: String

    /**
     * コンストラクタ
     */
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }

    /**
     * セリフログを出力
     */
    override fun say() {
        // 出力するメッセージ
        val message = "私の名前は${this.name}です。年は${this.age}歳です。"
        // メッセージ出力
        Log.d("kotlintest", message)
    }

    /**
     * 考えるログを出力
     */
    override fun think() {
        // 出力するメッセージ
        val message = "私は${this.hobby}について考える。"
        // メッセージ出力
        Log.d("kotlintest", message)
    }

}