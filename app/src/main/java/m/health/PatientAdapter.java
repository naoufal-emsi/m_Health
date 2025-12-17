package m.health;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PatientAdapter extends BaseAdapter {
    private Context context;
    private List<String> patients;
    private LayoutInflater inflater;

    public PatientAdapter(Context context, List<String> patients) {
        this.context = context;
        this.patients = patients;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return patients.size();
    }

    @Override
    public Object getItem(int position) {
        return patients.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_patient, parent, false);
        }

        String patientInfo = patients.get(position);
        String[] parts = patientInfo.split(" - ID: ");
        
        TextView patientName = convertView.findViewById(R.id.patientName);
        TextView patientInfoText = convertView.findViewById(R.id.patientInfo);
        TextView patientId = convertView.findViewById(R.id.patientId);
        
        patientName.setText(parts[0]);
        patientInfoText.setText("Patient enregistré");
        patientId.setText(parts.length > 1 ? parts[1] : "000");

        return convertView;
    }
}