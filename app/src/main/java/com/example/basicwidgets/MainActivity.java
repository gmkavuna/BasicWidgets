package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView button1Text;
    TextView checkBoxText;
    Button button1;
    CheckBox checkBox1;
    Switch switch1;
    TextView switch1Text;
    RadioGroup radioGroup;
    TextView radioGroupText;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    Button updateLabel;
    TextView updateLabelText;
    EditText editText;

    SeekBar progressBar;
    TextView progressBarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //first button
        button1Text = (TextView) this.findViewById(R.id.button1Text);
        button1 = (Button) this.findViewById(R.id.button1);
        radioGroup = (RadioGroup) this.findViewById(R.id.radioGroup) ;

        //the checkbox
        checkBox1 = (CheckBox) this.findViewById(R.id.checkBox1);
        checkBox1.setChecked(false);
        checkBoxText = (TextView) this.findViewById(R.id.checkBoxText);
        checkBoxText.setText("This Checkbox is: Unchecked");

        //switch button
        switch1 = (Switch) this.findViewById(R.id.switch1);
        switch1Text = (TextView) this.findViewById(R.id.switchText);

        //radio buttons
        radioGroupText = (TextView) this.findViewById(R.id.radioGroupText);
        radioGroup = (RadioGroup) this.findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton) this.findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) this.findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) this.findViewById(R.id.radioButton3);

        updateLabel = (Button) this.findViewById(R.id.updateLabel);
        updateLabelText = (TextView) this.findViewById(R.id.enteredText);
        editText = (EditText) this.findViewById(R.id.editText);

        progressBar = (SeekBar) findViewById(R.id.progressBar);
        progressBarText = (TextView) findViewById(R.id.progressBarText);

        progressBarText.setText(String.valueOf(progressBar.getProgress()));

        progressBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBarText.setText(String.valueOf(progressBar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }

    public void button1Listener(View view) {

        String button1TextValue = (String) button1.getText();
        button1Text.setText(button1TextValue);
    }

    public void checkBox1Listener(View view) {
        if (checkBox1.isChecked()) {
            checkBoxText.setText("This Checkbox is: Checked");
        } else {
            checkBoxText.setText("This Checkbox is: Unchecked");
        }
    }

    public void switchButtonListner(View view) {
        if (switch1.isChecked()) {
            switch1Text.setText("On");
        } else {
            switch1Text.setText("Off");
        }
    }
    public void radioButtonListener(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.radioButton:
                if(checked)
                    radioGroupText.setText("Radio1 Selected");
                break;
            case R.id.radioButton2:
                if(checked)
                    radioGroupText.setText("Radio2 Selected");
                break;
            case R.id.radioButton3:
                if(checked)
                    radioGroupText.setText("Radio3 Selected");
                break;
        }
    }

    public void updateLabelListener(View view){

        updateLabelText.setText(editText.getText());
    }
}


