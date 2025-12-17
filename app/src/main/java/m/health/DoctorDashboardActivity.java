package m.health;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class DoctorDashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.HomeMedecin);
        
        CardView planningCard = findViewById(R.id.planningCard);
        CardView recordsCard = findViewById(R.id.recordsCard);
        CardView resultsCard = findViewById(R.id.resultsCard);
        CardView messagesCard = findViewById(R.id.messagesCard);
        
        planningCard.setOnClickListener(v -> {
            startActivity(new Intent(this, Planning.class));
        });
        
        recordsCard.setOnClickListener(v -> {
            startActivity(new Intent(this, DossiersMedicaux.class));
        });
        
        resultsCard.setOnClickListener(v -> {
            startActivity(new Intent(this, ResultatsMedicaux.class));
        });
        
        messagesCard.setOnClickListener(v -> {
            startActivity(new Intent(this, DoctorMessagesActivity.class));
        });
    }
}