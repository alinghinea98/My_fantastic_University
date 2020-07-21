package ro.ibm.summerschool.myfantasticuniversity.chat;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ro.ibm.summerschool.myfantasticuniversity.R;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context context;
    ArrayList<MessageModel> list;
    public static final int MESSAGE_TYPE_IN = 1;
    public static final int MESSAGE_TYPE_OUT = 2;

    public CustomAdapter(Context context, ArrayList<MessageModel> list) {
        this.context = context;
        this.list = list;
    }

    private class MessageInViewHolder extends RecyclerView.ViewHolder {

        TextView message_field,date_field, nameText;
        ImageView profileImage;
        MessageInViewHolder(final View itemView) {
            super(itemView);
            message_field = itemView.findViewById(R.id.text_message_body_r);
            date_field = itemView.findViewById(R.id.text_message_time_r);
//            nameText =  itemView.findViewById(R.id.text_message_name);
//            profileImage =  itemView.findViewById(R.id.image_message_profile);
        }
        void bind(int position) {
            MessageModel messageModel = list.get(position);
            message_field.setText(messageModel.message);
            date_field.setText(DateFormat.getTimeInstance(DateFormat.SHORT).format(messageModel.messageTime));
            //nameText.setText(messageModel.getSender().getContactName());
            //de bind uit si profile image
        }
    }

    private class MessageOutViewHolder extends RecyclerView.ViewHolder {

        TextView message_field,date_field;
        MessageOutViewHolder(final View itemView) {
            super(itemView);
            message_field = itemView.findViewById(R.id.text_message_body_s);
            date_field = itemView.findViewById(R.id.text_message_time_s);
        }
        void bind(int position) {
            MessageModel messageModel = list.get(position);
            message_field.setText(messageModel.message);
            date_field.setText(DateFormat.getTimeInstance(DateFormat.SHORT).format(messageModel.messageTime));
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == MESSAGE_TYPE_IN) {
            return new MessageInViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_receive, parent, false));
        }
        return new MessageOutViewHolder(LayoutInflater.from(context).inflate(R.layout.item_message_send, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (list.get(position).messageType == MESSAGE_TYPE_IN) {
            ((MessageInViewHolder) holder).bind(position);
        } else {
            ((MessageOutViewHolder) holder).bind(position);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).messageType;
    }
}