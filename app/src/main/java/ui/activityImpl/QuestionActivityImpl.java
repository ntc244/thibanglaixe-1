package ui.activityImpl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import model.Question;
import ui.activity.QuestionActivity;

public class QuestionActivityImpl extends AppCompatActivity implements QuestionActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setListQuestion(List<Question> questions) {

    }
}
