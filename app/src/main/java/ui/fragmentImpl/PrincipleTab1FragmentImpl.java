package ui.fragmentImpl;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.squareup.picasso.Callback;

import model.ExamPrinciple;
import ui.fragment.PrincipleTabFragment;
import utils.CustomPicasso;

public class PrincipleTab1FragmentImpl extends Fragment implements PrincipleTabFragment {

    private ExamPrinciple examPrinciple;

    private View view;
    private TextView txtExamPrinciple;
    private ImageView imgPrinciple;

    public static PrincipleTab1FragmentImpl getInstance(ExamPrinciple examPrinciple) {
        PrincipleTab1FragmentImpl myFragment = new PrincipleTab1FragmentImpl();
        myFragment.examPrinciple = examPrinciple;
        return myFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.exam_principle_tab1_fragment, container, false);
        imgPrinciple = view.findViewById(R.id.imgPrinciple);
        txtExamPrinciple = view.findViewById(R.id.txtExamPrinciple);
        display();
        return view;
    }

    @Override
    public void display() {
        CustomPicasso.with(PrincipleTab1FragmentImpl.this.getContext())
                .load("https://songchung.vn/API_giaothong/image/" + examPrinciple.getImage())
                .placeholder(R.mipmap.loader)
                .error(R.mipmap.error)
                .into(imgPrinciple, new Callback() {
                    @Override
                    public void onSuccess() {
                        Log.d("Success: ", "Success");
                    }

                    @Override
                    public void onError() {
                        Log.d("error: ", "error");
                    }
                });

        String fullText = examPrinciple.getContent();
//        String luatThi = fullText.substring(0, 8);
//        String noiDungLuatThi = fullText.substring(8, 228);
//        String cachCham = fullText.substring(228, 244);
//        String noiDungCachCham = fullText.substring(244, 498);

        Spannable spannable = new SpannableString(fullText);
        ForegroundColorSpan fcsBlue = new ForegroundColorSpan(getResources().getColor(R.color.colorPrimaryDark));
        ForegroundColorSpan fcsBlack = new ForegroundColorSpan(getResources().getColor(R.color.black));
        RelativeSizeSpan rss15 = new RelativeSizeSpan(0.75f);
        RelativeSizeSpan rss20 = new RelativeSizeSpan(1f);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);

        spannable.setSpan(boldSpan, 0, 8, Spanned.SPAN_COMPOSING);
        spannable.setSpan(fcsBlack, 8, 228, Spanned.SPAN_COMPOSING);
        spannable.setSpan(rss20, 0, 8, Spanned.SPAN_COMPOSING);
        spannable.setSpan(rss15, 8, 228, Spanned.SPAN_COMPOSING);

        spannable.setSpan(boldSpan, 228, 244, Spanned.SPAN_COMPOSING);
        spannable.setSpan(fcsBlack, 244, 498, Spanned.SPAN_COMPOSING);
        spannable.setSpan(rss20, 228, 244, Spanned.SPAN_COMPOSING);
        spannable.setSpan(rss15, 244, 498, Spanned.SPAN_COMPOSING);


        txtExamPrinciple.setText(spannable);
    }
}
