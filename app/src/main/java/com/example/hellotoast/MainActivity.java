package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.hellotoast.extra.MESSAGE";
    private int mCount = 0;
    private TextView mShowCount;
    private TextView mMessageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageTextView = findViewById(R.id.show_count);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Log.d("Question1","La deuxième activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML est créé et le fichier AndroidManifest.xml est modifié pour déclarer une deuxième activité.");
        Log.d("Question2", "Le bouton Up (Haut) de la barre d'applications n'apparaît plus dans la deuxième activité pour renvoyer l'utilisateur à l'activité parent");
        Log.d("Question3", "new Intent(Context context, Class<?> class)");
        Log.d("Question4", "Comme extra d'intention (Intent)");
        Log.d("Question5", "Tout ce qui précède");

    }



    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = mMessageTextView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}