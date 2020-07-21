//package ro.ibm.summerschool.myfantasticuniversity.chat;
//
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView.ViewHolder;
//
//import ro.ibm.summerschool.myfantasticuniversity.R;
//
//public class ReceivedMessageHolder extends ViewHolder {
//    TextView messageText, timeText, nameText;
//    ImageView profileImage;
//
//    ReceivedMessageHolder(View itemView) {
//        super(itemView);
//        messageText = (TextView) itemView.findViewById(R.id.text_message_body_r);
//        timeText = (TextView) itemView.findViewById(R.id.text_message_time_r);
//        nameText = (TextView) itemView.findViewById(R.id.text_message_name);
//        profileImage = (ImageView) itemView.findViewById(R.id.image_message_profile);
//    }
//
//    void bind(User message) {
//        messageText.setText(message.getMessage());
//
//        // Format the stored timestamp into a readable String using method.
//       // timeText.setText(Utils.formatDateTime(message.getCreatedAt()));
//        nameText.setText(message.getSender().getContactName());
//
//        // Insert the profile image from the URL into the ImageView.
//       // Utils.displayRoundImageFromUrl(this, message.getSender().getProfileUrl(), profileImage);
//    }
//}
//
