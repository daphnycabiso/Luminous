package com.example.lenovo.luminous;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton butt;
    private int a = 0;
    private Button button;
    private ImageView image;
    private Drawable[] drawables = null;
    private Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.imageView);
        //button  = (Button) findViewById(R.id.button);
        butt = (ToggleButton) findViewById(R.id.toggleButton);
        drawables = new Drawable[]{
                getResources().getDrawable(R.drawable.lightbulb),
                getResources().getDrawable(R.drawable.bulb)
        };
        drawable = drawables[1];
        image.setImageDrawable(drawable);

        butt.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        boolean checked = ((ToggleButton)view).isChecked();
                        if(checked){
                            drawable = drawables[0];
                            image.setImageDrawable(drawable);


                        }
                        else {
                            drawable = drawables[1];
                            image.setImageDrawable(drawable);

                        }

                    }
                }

        );
    }
}
