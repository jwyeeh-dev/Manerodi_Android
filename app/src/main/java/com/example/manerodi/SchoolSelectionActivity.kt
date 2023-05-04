package com.example.manerodi

import android.content.Intent
import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.DrawableCompat
import android.os.Bundle
import android.view.View

class SchoolSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.school_selection_layout)
        val elementarySchoolView = findViewById<View>(R.id.view_elementary_school)
        val middleSchoolView = findViewById<View>(R.id.view_middle_school)
        val highSchoolView = findViewById<View>(R.id.view_high_school)

        val onClickListener = View.OnClickListener { view ->
            // 70% 반투명 보라색 필터 적용
            val purpleColor = Color.parseColor("#B366CC") // 이곳에 보라색 코드 입력
            val semiTransparentPurple = Color.argb(178, Color.red(purpleColor), Color.green(purpleColor), Color.blue(purpleColor))
            val wrappedDrawable = DrawableCompat.wrap(view.background)
            DrawableCompat.setTint(wrappedDrawable, semiTransparentPurple)
            view.background = wrappedDrawable


            // 교과서 선택 페이지로 이동하는 코드 (새로운 액티비티를 만들어 사용)
            val intent = Intent(this, TextbookSelectionActivity::class.java)
            startActivity(intent)
        }

        elementarySchoolView.setOnClickListener(onClickListener)
        middleSchoolView.setOnClickListener(onClickListener)
        highSchoolView.setOnClickListener(onClickListener)
    }
}
