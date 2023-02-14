package android.wings.websarva.listenerwork2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean btnFlg = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tvHello = findViewById(R.id.tvHello);

                if (btnFlg) {
                    tvHello.setVisibility(View.INVISIBLE);
                    btnFlg = false;
                } else {
                    tvHello.setVisibility(View.VISIBLE);
                    btnFlg = true;
                }
            }
        });
    }
}