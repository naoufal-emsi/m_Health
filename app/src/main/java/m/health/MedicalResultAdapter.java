package m.health;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MedicalResultAdapter extends BaseAdapter {
    private Context context;
    private List<String> results;
    private LayoutInflater inflater;

    public MedicalResultAdapter(Context context, List<String> results) {
        this.context = context;
        this.results = results;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return results.size();
    }

    @Override
    public Object getItem(int position) {
        return results.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_medical_result, parent, false);
        }

        String resultInfo = results.get(position);
        String[] parts = resultInfo.split(" - ");
        
        TextView resultPatient = convertView.findViewById(R.id.resultPatient);
        TextView resultValue = convertView.findViewById(R.id.resultValue);
        TextView resultStatus = convertView.findViewById(R.id.resultStatus);
        
        resultPatient.setText(parts[0]);
        resultValue.setText(parts.length > 1 ? parts[1] : "Résultat");
        
        String status = resultInfo.contains("Normal ✓") ? "✓" : 
                       resultInfo.contains("Élevé ⚠") || resultInfo.contains("Élevée ⚠") ? "⚠" : "✓";
        resultStatus.setText(status);

        return convertView;
    }
}