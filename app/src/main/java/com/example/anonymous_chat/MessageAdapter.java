package com.example.anonymous_chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    Context context;
    ArrayList<AnonymousMessage> messages;

    public MessageAdapter(Context context, ArrayList<AnonymousMessage> messages) {
        this.context = context;
        this.messages = messages;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.message_layout, parent, false);
        return new MessageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        AnonymousMessage message = messages.get(position);
        holder.tvMessage.setText(message.getMessage());
        holder.tvSentDate.setText(message.getSentDate().toString());
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        TextView tvMessage;
        TextView tvSentDate;

        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);

            tvMessage = itemView.findViewById(R.id.textViewMessageText);
            tvSentDate = itemView.findViewById(R.id.textViewSentDate);
        }
    }
}
