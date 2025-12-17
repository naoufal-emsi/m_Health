package m.health;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        CardView adminCard = findViewById(R.id.adminCard);
        CardView doctorCard = findViewById(R.id.doctorCard);
        
        adminCard.setOnClickListener(v -> {
            startActivity(new Intent(this, AdminLoginActivity.class));
        });
        
        doctorCard.setOnClickListener(v -> {
            startActivity(new Intent(this, DoctorLoginActivity.class));
        });
    }
}