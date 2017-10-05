package assignment.beedle.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton home = (ImageButton) findViewById(R.id.imageButton);
        ImageButton billing = (ImageButton) findViewById(R.id.billingImageButton);
        ImageButton etc = (ImageButton) findViewById(R.id.etcImageButton);
        ImageButton mobile = (ImageButton) findViewById(R.id.mobileImageButton);
        ImageButton favorite = (ImageButton) findViewById(R.id.favoriteImageButton);



        ImageButton transfer = (ImageButton) findViewById(R.id.transferImageButton);
        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MoneyTransfer.class);
                startActivity(intent);
            }
        });

        ImageButton profile = (ImageButton) findViewById(R.id.profileImageButton);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });


        ImageButton more = (ImageButton) findViewById(R.id.moreImageButton);


        ImageButton transferTab = (ImageButton) findViewById(R.id.transfer2ImageButton);
        transferTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
