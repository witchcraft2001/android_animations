package ru.dmdev.animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.DecelerateInterpolator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);

        img_refresh.startAnimation(animRotate)

        val scaleXAnimator = ObjectAnimator.ofFloat(img_book, View.SCALE_X, 0.8F, 1F)
            .apply {
                duration = 1000
                interpolator = DecelerateInterpolator(1.2F)
                repeatCount = ValueAnimator.INFINITE
                repeatMode = ValueAnimator.REVERSE
            }

        val scaleYAnimator = ObjectAnimator.ofFloat(img_book, View.SCALE_Y, 0.8F, 1F)
            .apply {
                duration = 1000
                interpolator = DecelerateInterpolator(1.2F)
                repeatCount = ValueAnimator.INFINITE
                repeatMode = ValueAnimator.REVERSE
            }

        val animatorSet = AnimatorSet()
        animatorSet.playTogether(scaleXAnimator, scaleYAnimator)
        animatorSet.start()

        val animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale_and_fade);

        img_circle.startAnimation(animScale)

        val scaleXAnimator1 = ObjectAnimator.ofFloat(img_book1, View.SCALE_X, 0.8F, 1F)
            .apply {
                duration = 1000
                interpolator = DecelerateInterpolator(1.2F)
                repeatCount = ValueAnimator.INFINITE
                repeatMode = ValueAnimator.REVERSE
            }

        val scaleYAnimator1 = ObjectAnimator.ofFloat(img_book1, View.SCALE_Y, 0.8F, 1F)
            .apply {
                duration = 1000
                interpolator = DecelerateInterpolator(1.2F)
                repeatCount = ValueAnimator.INFINITE
                repeatMode = ValueAnimator.REVERSE
            }

        val animatorSet1 = AnimatorSet()
        animatorSet1.playTogether(scaleXAnimator1, scaleYAnimator1)
        animatorSet1.start()
    }
}
