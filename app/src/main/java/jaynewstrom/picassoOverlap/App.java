package jaynewstrom.picassoOverlap;

import android.app.Application;
import android.net.Uri;
import android.util.Log;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.Listener;

public final class App extends Application {

    Picasso picasso;

    @Override public void onCreate() {
        super.onCreate();
        picasso = new Picasso.Builder(this).listener(new Listener() {
            @Override public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                Log.e("PicassoError", "Boom", exception);
            }
        }).build();
        Picasso.setSingletonInstance(picasso);
    }
}
