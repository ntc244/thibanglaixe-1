package ui.activity;

import android.view.MenuItem;

import java.util.List;

import model.Question;

public interface SaHinhActivity {
    boolean onOptionsItemSelected(MenuItem item);

    void setListQuestion(List<Question> questions);
}
