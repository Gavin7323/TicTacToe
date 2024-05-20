package com.example.myapplication3

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var currentMove = "X"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun changeCurrentMove(){
        if(currentMove == "X"){
            currentMove = "O"
        }else{
            currentMove = "X"
        }

    }

    private fun handleMove(){
        val win: Boolean = checkForWin()
        if(win){
            handleWin()
        }
        changeCurrentMove()
    }

    private fun checkForWin(): Boolean {
        TODO("Not yet implemented")
        var textArray : Array<CharSequence>

        return checkRowForWin(textArray) || checkColForWin(textArray) || checkLeftDiagForWin(textArray) || checkRightDiagForWin(textArray)
    }

    private fun checkRightDiagForWin(textArray: Array<CharSequence>): Boolean {
        TODO("Not yet implemented")
    }

    private fun checkLeftDiagForWin(textArray: Array<CharSequence>): Boolean {
        TODO("Not yet implemented")
    }

    private fun checkColForWin(textArray: Array<CharSequence>): Boolean {
        TODO("Not yet implemented")
    }

    private fun checkRowForWin(textArray: Array<CharSequence>): Boolean {
        for(row in 0..2){
            if(textArray[3 * row + 0] == textArray[3 * row + 1] && textArray[3 * row + 1] == textArray[3 * row + 2]){
                return true
            }
        }
        return false
    }

    private fun handleWin() {
        TODO("Not yet implemented")
        TODO("Create a TextView variable called winLoseText and get from findViewById(R.id.winLose) ")
//        TODO("set the text of winLoseText to ""$currentMove Wins!")
    }

    fun topLeftClick(view: View) {
        val textView : TextView = findViewById(R.id.textView0)
        if (textView.text == ""){
            textView.text = currentMove
            changeCurrentMove()
        }
    }

    fun topCenterClick(view: View) {
        val textView : TextView = findViewById(R.id.textView1)
        if (textView.text == ""){
            textView.text = currentMove
            changeCurrentMove()
        }
    }
}