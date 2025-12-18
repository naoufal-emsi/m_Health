package m.health;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class DoctorMessagesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_messages);
        
        ListView messagesList = findViewById(R.id.messagesList);
        Button newMessageButton = findViewById(R.id.newMessageButton);
        Button backButton = findViewById(R.id.backButton);
        
        List<String> messages = Arrays.asList(
            "Amina Cherkaoui: Question sur posologie médicament",
            "Hassan Benjelloun: Demande de renouvellement ordonnance",
            "Salma Ouali: Effets secondaires traitement",
            "Karim El Fassi: Résultats analyses à interpréter",
            "Nadia Berrada: Douleurs thoraciques occasionnelles",
            "Mehdi Lahlou: Suivi post-opératoire cicatrisation",
            "Zineb Alaoui: Réaction allergique alimentaire",
            "Abderrahim Tounsi: Douleurs articulaires matinales",
            "Leila Benkirane: Fréquence des migraines augmentée",
            "Saad Chraibi: Demande de bilan de santé complet"
        );
        
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, messages);
        messagesList.setAdapter(adapter);
        
        newMessageButton.setOnClickListener(v -> {
            Toast.makeText(this, "Fonction nouveau message à implémenter", Toast.LENGTH_SHORT).show();
        });
        
        backButton.setOnClickListener(v -> finish());
    }
}