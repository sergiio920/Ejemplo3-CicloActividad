package sergio.moron.ejemplo3_cicloactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAbrir;
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS", "7. ESTOY EN EL MÉTODO RESTART");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS", "6. ESTOY EN EL MÉTODO DESTROY");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS", "5. ESTOY EN EL MÉTODO STOP");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS", "4. ESTOY EN EL MÉTODO PAUSE");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS", "3. ESTOY EN EL MÉTODO RESUME");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS", "2. ESTOY EN EL MÉTODO START");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbrir = findViewById(R.id.tbnAbrirMain);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        Log.e("ESTADOS", "1. ESTOY EN EL MÉTODO CREATE");
    }
}