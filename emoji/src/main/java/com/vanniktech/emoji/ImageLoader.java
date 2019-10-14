package com.vanniktech.emoji;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public interface ImageLoader {
  void loadImage(Uri uri, ImageView imageView, Bundle extraData);
}
