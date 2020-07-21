//package ro.ibm.summerschool.myfantasticuniversity.chat;
//
//import android.view.View;
//import android.widget.TextView;
//
//import ro.ibm.summerschool.myfantasticuniversity.R;
//
//import androidx.recyclerview.widget.RecyclerView.ViewHolder;
//
//public class SentMessageHolder extends ViewHolder {
//    TextView messageText, timeText;
//
//
//    SentMessageHolder(View itemView) {
//        super(itemView);
//        messageText = (TextView) itemView.findViewById(R.id.text_message_body_s);
//        timeText = (TextView) itemView.findViewById(R.id.text_message_time_s);
//
//    }
//
//    void bind(User message) {
//        messageText.setText(message.getMessage());
//
//        // Format the stored timestamp into a readable String using method.
//        //timeText.setText(Utils.formatDateTime(message.getCreatedAt()));
//
//    }
//}
//
