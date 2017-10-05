package assignment.beedle.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ConfirmTransferMoney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_transfer_money);


        TextView targetAccount = (TextView) findViewById(R.id.targetName);
        TextView targetAmount = (TextView) findViewById(R.id.amountTotal);
        TextView targetNote = (TextView) findViewById(R.id.noteTexts);

        targetAccount.setText(getIntent().getStringExtra("accountText"));
        targetAmount.setText(getIntent().getStringExtra("amountText"));
        targetNote.setText(getIntent().getStringExtra("noteText"));
    }
}
