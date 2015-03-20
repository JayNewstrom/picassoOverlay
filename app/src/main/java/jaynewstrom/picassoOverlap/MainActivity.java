package jaynewstrom.picassoOverlap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;


public final class MainActivity extends Activity {

    @InjectView(R.id.list_view) ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        listView.setAdapter(new PicassoListAdapter());
    }

    static final class PicassoListAdapter extends BaseAdapter {

        private final List<ListItem> listItems;

        PicassoListAdapter() {
            listItems = new ArrayList<>();
            listItems.add(new ListItem(R.drawable.i1));
            listItems.add(new ListItem(R.drawable.i2));
            listItems.add(new ListItem(R.drawable.i3));
            listItems.add(new ListItem(R.drawable.i4));
            listItems.add(new ListItem(R.drawable.i5));
            listItems.add(new ListItem(R.drawable.i6));
            listItems.add(new ListItem(R.drawable.i7));

            listItems.add(new ListItem(R.drawable.i1));
            listItems.add(new ListItem(R.drawable.i2));
            listItems.add(new ListItem(R.drawable.i3));
            listItems.add(new ListItem(R.drawable.i4));
            listItems.add(new ListItem(R.drawable.i5));
            listItems.add(new ListItem(R.drawable.i6));
            listItems.add(new ListItem(R.drawable.i7));

            listItems.add(new ListItem(R.drawable.i1));
            listItems.add(new ListItem(R.drawable.i2));
            listItems.add(new ListItem(R.drawable.i3));
            listItems.add(new ListItem(R.drawable.i4));
            listItems.add(new ListItem(R.drawable.i5));
            listItems.add(new ListItem(R.drawable.i6));
            listItems.add(new ListItem(R.drawable.i7));

            listItems.add(new ListItem(R.drawable.i1));
            listItems.add(new ListItem(R.drawable.i2));
            listItems.add(new ListItem(R.drawable.i3));
            listItems.add(new ListItem(R.drawable.i4));
            listItems.add(new ListItem(R.drawable.i5));
            listItems.add(new ListItem(R.drawable.i6));
            listItems.add(new ListItem(R.drawable.i7));
        }

        @Override public int getCount() {
            return listItems.size();
        }

        @Override public ListItem getItem(int position) {
            return listItems.get(position);
        }

        @Override public long getItemId(int position) {
            return position;
        }

        @Override public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = new ListItemView(parent.getContext());
            }
            ((ListItemView) convertView).setListItem(getItem(position));
            return convertView;
        }
    }
}
