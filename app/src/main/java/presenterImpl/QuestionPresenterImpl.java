package presenterImpl;

import java.util.List;

import model.Question;
import presenter.QuestionPresenter;
import service.QuestionService;
import serviceCallback.ListDataCallback;
import serviceImpl.QuestionServiceImpl;
import ui.activity.BaseQuestionActivity;

public class QuestionPresenterImpl implements QuestionPresenter {


//    private QuestionActivityImpl view;
    private BaseQuestionActivity view;
    private QuestionService questionService;
    private List<Question> questions;

    public QuestionPresenterImpl(BaseQuestionActivity view) {
        this.view = view;
        this.questionService = QuestionServiceImpl.getInstance();
    }
    
    @Override
    public void getListQuestion(String task) {
        questionService.getListQuestion(new ListDataCallback<Question>() {
            @Override
            public void onSuccess(List<Question> data) {
                view.setListQuestion(data);
//                QuestionPresenterImpl.this.questions = data;
//                Log.d("size data in presenter ", String.valueOf(QuestionPresenterImpl.this.questions.size()));
            }

            @Override
            public void onFail(String error) {

            }
        }, task);
//        return questions;
    }
}
