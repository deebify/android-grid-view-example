package com.deeb.gridviewexample.DataProviderAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.deeb.gridviewexample.R;

/**
 * Created by deeb on 11/2/16.
 */

public class BookAdapter extends BaseAdapter {

    private final Context context;
    private final Book[] books;

    public BookAdapter(Context context, Book[] books) {
        this.context = context;
        this.books = books;
    }

    @Override
    public int getCount() {
        return books.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Getting the View
        final Book book = books[position];

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.linearlayout_book, null);
        }

        final ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview_cover_art);
        final TextView nameTextView = (TextView) convertView.findViewById(R.id.textview_book_name);
        final TextView authorTextView = (TextView) convertView.findViewById(R.id.textview_book_author);
        final ImageView imageViewFavorite = (ImageView) convertView.findViewById(R.id.imageview_favorite);

        imageView.setImageResource(book.getImageRes());
        nameTextView.setText(context.getString(book.getName()));
        authorTextView.setText(context.getString(book.getAuthor()));

        return convertView;
    }
}
