package fr.apexlegends.guide.splashscreen

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import fr.apexlegends.guide.R
import fr.apexlegends.guide.home.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    private val mHideHandler = Handler()
    private val mChangeActivity = Runnable {

        val i = MainActivity.newIntent(this)
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(i)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        fullscreen_content.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LOW_PROFILE or
                View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

        val objectAnimator = ObjectAnimator.ofFloat(
            fullscreen_content,
            View.ROTATION,
            0f,
            30f / 2,
            50f / 2,
            80f / 2,
            130f / 2,
            210f / 2,
            360f / 2,
            360f / 2 + 360f / 2 - 210f / 2,
            360f / 2 + 360f / 2 - 210f / 2 + 210f / 2 - 130f / 2,
            360f / 2 + 360f / 2 - 210f / 2 + 210f / 2 - 130f / 2 + 130f / 2 - 80f / 2,
            360f / 2 + 360f / 2 - 210f / 2 + 210f / 2 - 130f / 2 + 130f / 2 - 80f / 2 + 80f / 2 - 50f / 2,
            360f / 2 + 360f / 2 - 210f / 2 + 210f / 2 - 130f / 2 + 130f / 2 - 80f / 2 + 80f / 2 - 50f / 2 + 50f / 2 - 30f / 2,
            360f / 2 + 360f / 2 - 210f / 2 + 210f / 2 - 130f / 2 + 130f / 2 - 80f / 2 + 80f / 2 - 50f / 2 + 50f / 2 - 30f / 2 + 30f / 2 - 20f / 2 + 20f / 2 - 10f / 2 + 10f / 2
        )
        objectAnimator.duration = 1000
        objectAnimator.repeatCount = ObjectAnimator.INFINITE
        objectAnimator.repeatMode = ObjectAnimator.RESTART
        objectAnimator.start()
        goToActivity(2000)
    }

    private fun goToActivity(delayMillis: Int) {
        mHideHandler.removeCallbacks(mChangeActivity)
        mHideHandler.postDelayed(mChangeActivity, delayMillis.toLong())
    }
}
