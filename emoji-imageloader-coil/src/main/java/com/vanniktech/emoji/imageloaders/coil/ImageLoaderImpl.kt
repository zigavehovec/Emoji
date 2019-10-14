package com.vanniktech.emoji.imageloaders.coil

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import coil.api.load
import com.vanniktech.emoji.ImageLoader

class ImageLoaderImpl : ImageLoader {
  override fun loadImage(
    uri: Uri?,
    imageView: ImageView?,
    extraData: Bundle?
  ) {
    imageView?.load(uri)
  }
}
