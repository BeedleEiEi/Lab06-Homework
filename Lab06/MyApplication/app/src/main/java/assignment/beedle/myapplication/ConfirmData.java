package assignment.beedle.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_data);
        TextView targetAccount = (TextView) findViewById(R.id.targetAccount);
        TextView targetAmount = (TextView) findViewById(R.id.targetAmount);
        TextView targetNote = (TextView) findViewById(R.id.targetNote);

        targetAccount.setText(getIntent().getStringExtra("accountText"));
        targetAmount.setText(getIntent().getStringExtra("amountText"));
        targetNote.setText(getIntent().getStringExtra("noteText"));

        Button confirmBtn = (Button) findViewById(R.id.confirmBtn);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmData.this, ConfirmTransferMoney.class);
                intent.putExtra("accountText", getIntent().getStringExtra("accountText"));
                intent.putExtra("amountText", getIntent().getStringExtra("amountText"));
                intent.putExtra("noteText", getIntent().getStringExtra("noteText"));
                startActivity(intent);
            }
        });
    }
}
