package jaynewstrom.picassoOverlap;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;

final class ListItemView extends LinearLayout {

    @InjectView(R.id.image_view) ImageView imageView;

    public ListItemView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.list_item, this, true);
        ButterKnife.inject(this);
    }

    public void setListItem(ListItem listItem) {
        Picasso.with(getContext()).load(listItem.drawableResId).fit().into(imageView);
    }
}
