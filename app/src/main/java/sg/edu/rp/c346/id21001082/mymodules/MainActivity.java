package sg.edu.rp.c346.id21001082.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView viewMod1;
    TextView viewMod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewMod1 = findViewById(R.id.viewModule1);
        viewMod2 = findViewById(R.id.viewModule2);

        viewMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode", "C346");
                intent.putExtra("moduleName", "Android Programming");
                intent.putExtra("moduleYear", 2020);
                intent.putExtra("acadSem", 1);
                intent.putExtra("moduleCredit", 4);
                intent.putExtra("moduleVenue", "W66M");
                startActivity(intent);
            }
        });

        viewMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode", "C203");
                intent.putExtra("moduleName", "Web AppIn Development");
                intent.putExtra("moduleYear", 2020);
                intent.putExtra("acadSem", 1);
                intent.putExtra("moduleCredit", 4);
                intent.putExtra("moduleVenue", "W65H");
                startActivity(intent);
            }
        });
    }
}