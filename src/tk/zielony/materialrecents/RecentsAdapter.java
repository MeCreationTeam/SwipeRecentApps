package tk.zielony.materialrecents;

import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * Created by Marcin on 2015-04-13.
 */
public interface RecentsAdapter {
    String getTitle(int position);
    int getViewColor(int position);
    Drawable getIcon(int position);
    int getHeaderColor(int position);

    int getCount();
}
