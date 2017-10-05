package assignment.beedle.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MoneyTransfer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_transfer2);
        final TextView accText = (TextView) findViewById(R.id.accountText);
        final TextView amountText = (TextView) findViewById(R.id.amountText);
        final TextView noteText = (TextView) findViewById(R.id.noteText);

        Button btnCheckData = (Button) findViewById(R.id.checkData);
        btnCheckData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyTransfer2.this, ConfirmData.class);
                intent.putExtra("accountText", accText.getText().toString());
                intent.putExtra("amountText", amountText.getText().toString());
                intent.putExtra("noteText", noteText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
