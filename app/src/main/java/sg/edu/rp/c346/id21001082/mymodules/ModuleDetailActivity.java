package sg.edu.rp.c346.id21001082.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView modCode;
    TextView modName;
    TextView acadYear;
    TextView acadSemester;
    TextView modCredit;
    TextView classVenue;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        modCode = findViewById(R.id.moduleCode);
        modName = findViewById(R.id.moduleName);
        acadYear = findViewById(R.id.year);
        acadSemester = findViewById(R.id.semester);
        modCredit = findViewById(R.id.moduleCredit);
        classVenue = findViewById(R.id.venue);
        btnBack = findViewById(R.id.backButton);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("moduleCode");
        modCode.setText("Module Code: " + moduleCode);

        String moduleName = intentReceived.getStringExtra("moduleName");
        modName.setText("Module Name: " + moduleName);

        int moduleYear = intentReceived.getIntExtra("moduleYear", 0);
        acadYear.setText("Academic Year: " + moduleYear);

        int acadSem = intentReceived.getIntExtra("acadSem", 0);
        acadSemester.setText("Semester: " + acadSem);

        int moduleCredit = intentReceived.getIntExtra("moduleCredit", 0);
        modCredit.setText("Module Credit: " + moduleCredit);

        String moduleVenue = intentReceived.getStringExtra("moduleVenue");
        classVenue.setText("Venue: " + moduleVenue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}