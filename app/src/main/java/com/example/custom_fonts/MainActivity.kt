package com.example.custom_fonts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// it can be created by using font family.
// font weight is given below.
/*
* 100: Thin
* 200: Light
* 300: Book
* 400: Regular
* 500: Medium
* 600: DemiBold
* 700: Bold
* 800: ExtraBold
* 900: Heavy
* */
/*
* For change the font of Toolbar .
* Go in style.xml.
* Add the font:family tag in it.
* And link the res/font folder.
* It will be automatically change the style of our Toolbar.
*
* */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
