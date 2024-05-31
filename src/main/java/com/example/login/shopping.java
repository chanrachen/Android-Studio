package com.example.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shopping);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnSuccess3=findViewById(R.id.buttonBackA);
        btnSuccess3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),mianscreen.class);
                startActivity(intent);
            }
        });
        TextView btnSuccess4 = findViewById(R.id.shopping);
        btnSuccess4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.amazon.com/s?k=online+shopping&adgrpid=81307892773&hvadid=673494580736&hvdev=c&hvlocphy=1009829&hvnetw=g&hvqmt=b&hvrand=17297652958218399595&hvtargid=kwd-10690131&hydadcr=22337_13507774&tag=hydglogoo-20&ref=pd_sl_5jwjc6eenn_b");
            }
        });
    }

    private void gotoUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}