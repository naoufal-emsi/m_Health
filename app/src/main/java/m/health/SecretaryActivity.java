package m.health;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class SecretaryActivity extends AppCompatActivity {

    private Button btnGestionRdv;
    private Button btnAccesPatients;
    private Button btnCoordination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_secretary);

        btnGestionRdv = findViewById(R.id.btn_nav_gestion_rdv);
        btnAccesPatients = findViewById(R.id.btn_nav_acces_patients);
        btnCoordination = findViewById(R.id.btn_nav_coordination);

        btnGestionRdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecretaryActivity.this, GestionRdvActivity.class);
                startActivity(intent);
            }
        });

        btnAccesPatients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecretaryActivity.this, UpdateDossierPatientActivity.class);
                startActivity(intent);
            }
        });

        btnCoordination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecretaryActivity.this, CoordinationMedecinActivity.class);
                startActivity(intent);
            }
        });
    }
}


