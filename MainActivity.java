package ro.mihai.modalbottom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ExampleBottomSheetDialog.BottomSheetListener {

    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOpenBottomSheet = findViewById(R.id.button_open_bottom_sheet);
        mTextView = findViewById(R.id.text_view_button_clicked);

        buttonOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ExampleBottomSheetDialog bottomSheet = new ExampleBottomSheetDialog();
                bottomSheet.show(getSupportFragmentManager(), "ExampleBottomSheet");
            }
        });
    }

    @Override
    public void onButtonCliked(String text) {
        mTextView.setText(text);
    }
}
