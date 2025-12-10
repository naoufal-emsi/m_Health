package m.health;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class UserManagementActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_management);
        
        ListView usersList = findViewById(R.id.usersList);
        Button addButton = findViewById(R.id.addButton);
        Button backButton = findViewById(R.id.backButton);
        
        List<String> users = Arrays.asList(
            "Dr. Ahmed Benali - Administrator",
            "Fatima Zahra - Nurse",
            "Youssef Alami - Doctor",
            "Aicha Bennani - Receptionist",
            "Omar Tazi - IT Support",
            "Khadija Fassi - Manager",
            "Rachid Idrissi - Security"
        );
        
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, users);
        usersList.setAdapter(adapter);
        
        backButton.setOnClickListener(v -> finish());
    }
}