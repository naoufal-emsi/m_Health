package m.health;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;

public class UserManagementActivity extends AppCompatActivity {
    private ArrayList<String> users;
    private ArrayAdapter<String> adapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_management);
        
        ListView userList = findViewById(R.id.userList);
        Button addUserBtn = findViewById(R.id.addUserBtn);
        Button backBtn = findViewById(R.id.backBtn);
        
        users = new ArrayList<>(Arrays.asList(
            "Dr. Smith - Doctor - Active",
            "John Doe - Patient - Active", 
            "Mary Johnson - Secretary - Active",
            "Dr. Wilson - Doctor - Inactive"
        ));
        
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, users);
        userList.setAdapter(adapter);
        
        userList.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Edit user: " + users.get(position), Toast.LENGTH_SHORT).show();
        });
        
        addUserBtn.setOnClickListener(v -> {
            users.add("New User - Role - Pending");
            adapter.notifyDataSetChanged();
            Toast.makeText(this, "User added", Toast.LENGTH_SHORT).show();
        });
        
        backBtn.setOnClickListener(v -> finish());
    }
}