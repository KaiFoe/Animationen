package foerstermann.kai.animationen;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivityListener implements View.OnClickListener {

    MainActivity mainActivity;


    public MainActivityListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBlink:
                Animation blink = AnimationUtils.loadAnimation(mainActivity, R.anim.blink);
                mainActivity.imageView.startAnimation(blink);
                break;
            case R.id.btnClock:
                Animation clock = AnimationUtils.loadAnimation(mainActivity, R.anim.clockwise);
                mainActivity.imageView.startAnimation(clock);
                break;
            case R.id.btnFade:
                Animation fade = AnimationUtils.loadAnimation(mainActivity, R.anim.fade);
                mainActivity.imageView.startAnimation(fade);
                break;
            case R.id.btnMove:
                Animation move = AnimationUtils.loadAnimation(mainActivity, R.anim.move);
                mainActivity.imageView.startAnimation(move);
                break;
            case R.id.btnSlide:
                Animation slide = AnimationUtils.loadAnimation(mainActivity, R.anim.slide);
                mainActivity.imageView.startAnimation(slide);
                break;
            case R.id.btnZoom:
                Animation zoom = AnimationUtils.loadAnimation(mainActivity, R.anim.myanimation);
                mainActivity.imageView.startAnimation(zoom);
                break;
        }
    }
}
