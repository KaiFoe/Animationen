package foerstermann.kai.animationen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnClockwise, btnFade, btnMove, btnSlide, btnBlink, btnZoom;
    ImageView imageView;
    MainActivityListener mainActivityListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBlink = findViewById(R.id.btnBlink);
        btnClockwise = findViewById(R.id.btnClock);
        btnFade = findViewById(R.id.btnFade);
        btnMove = findViewById(R.id.btnMove);
        btnSlide = findViewById(R.id.btnSlide);
        btnZoom = findViewById(R.id.btnZoom);

        imageView = findViewById(R.id.imageView);

        mainActivityListener = new MainActivityListener(this);

        btnZoom.setOnClickListener(mainActivityListener);
        btnSlide.setOnClickListener(mainActivityListener);
        btnFade.setOnClickListener(mainActivityListener);
        btnBlink.setOnClickListener(mainActivityListener);
        btnClockwise.setOnClickListener(mainActivityListener);
        btnMove.setOnClickListener(mainActivityListener);
    }

    public void zoom(View view) {
        mainActivityListener.zoom(view);
    }
}
