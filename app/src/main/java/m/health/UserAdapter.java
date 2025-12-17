package m.health;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends BaseAdapter {
    private Context context;
    private List<String> users;
    private LayoutInflater inflater;

    public UserAdapter(Context context, List<String> users) {
        this.context = context;
        this.users = users;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_user, parent, false);
        }

        String userInfo = users.get(position);
        String[] parts = userInfo.split(" - ");
        
        TextView userName = convertView.findViewById(R.id.userName);
        TextView userRole = convertView.findViewById(R.id.userRole);
        
        userName.setText(parts[0]);
        userRole.setText(parts.length > 1 ? parts[1] : "Utilisateur");

        return convertView;
    }
}