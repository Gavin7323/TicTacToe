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
        var textArray : Array<CharSequence> = arrayOf(
            findViewById<TextView>(R.id.textView0).text,
            findViewById<TextView>(R.id.textView1).text,
            findViewById<TextView>(R.id.textView2).text,
            findViewById<TextView>(R.id.textView3).text,
            findViewById<TextView>(R.id.textView4).text,
            findViewById<TextView>(R.id.textView5).text,
            findViewById<TextView>(R.id.textView6).text,
            findViewById<TextView>(R.id.textView7).text,
            findViewById<TextView>(R.id.textView8).text
        )

        return checkRowForWin(textArray) || checkColForWin(textArray) || checkLeftDiagForWin(textArray) || checkRightDiagForWin(textArray)
    }

    private fun checkRightDiagForWin(textArray: Array<CharSequence>): Boolean {
        if(textArray[2] == textArray[4] && textArray[4] == textArray[6]){
            if (textArray[2] != ""){
                return true
            }
        }
    }

    private fun checkLeftDiagForWin(textArray: Array<CharSequence>): Boolean {
        if(textArray[0] == textArray[4] && textArray[4] == textArray[8]){
            if (textArray[0] != ""){
                return true
            }
        }
    }

    private fun checkColForWin(textArray: Array<CharSequence>): Boolean {
        for(col in 0..2){
            if(textArray[col + 0] == textArray[col + 3] && textArray[col + 3] == textArray[col + 6]){
                if(textArray[col + 0] != ""){
                    return true
                }
            }
        }
        return false
    }

    private fun checkRowForWin(textArray: Array<CharSequence>): Boolean {
        for(row in 0..2){
            if(textArray[3 * row + 0] == textArray[3 * row + 1] && textArray[3 * row + 1] == textArray[3 * row + 2]){
                if (textArray[3 * row + 0] != ""){
                     return true
                }
            }
        }
        return false
    }

    private fun handleWin() {
        val winLoseText : TextView = findViewById<TextView>(R.id.textView9);
        winLoseText.text = "$currentMove Wins!"
    }

    fun topLeftClick(view: View) {
        val textView : TextView = findViewById(R.id.textView0)
        if (textView.text == ""){
            textView.text = currentMove
            handleMove()
        }
    }

    fun topCenterClick(view: View) {
        val textView : TextView = findViewById(R.id.textView1)
        if (textView.text == ""){
            textView.text = currentMove
            handleMove()
        }
    }

    fun topRightClick(view: View) {
        val textView : TextView = findViewById(R.id.textView1)
        if (textView.text == ""){
            textView.text = currentMove
            handleMove()
        }
    }

    fun middleLeftClick(view: View) {
        val textView : TextView = findViewById(R.id.textView1)
        if (textView.text == ""){
            textView.text = currentMove
            handleMove()
        }
    }

    fun middleCenterClick(view: View) {
        val textView : TextView = findViewById(R.id.textView1)
        if (textView.text == ""){
            textView.text = currentMove
            handleMove()
        }
    }

    fun middleRightClick(view: View) {
        val textView : TextView = findViewById(R.id.textView1)
        if (textView.text == ""){
            textView.text = currentMove
            handleMove()
        }
    }

    fun bottomLeftClick(view: View) {
        val textView : TextView = findViewById(R.id.textView1)
        if (textView.text == ""){
            textView.text = currentMove
            handleMove()
        }
    }

    fun bottomCenterClick(view: View) {
        val textView : TextView = findViewById(R.id.textView1)
        if (textView.text == ""){
            textView.text = currentMove
            handleMove()
        }
    }

    fun bottomRightClick(view: View) {
        val textView : TextView = findViewById(R.id.textView1)
        if (textView.text == ""){
            textView.text = currentMove
            handleMove()
        }
    }

}