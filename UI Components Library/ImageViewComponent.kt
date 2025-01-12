import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView

class ImageViewComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    init {
        layoutParams = LayoutParams(200, 100)
        contentDescription = context.getString(R.string.example_image_desc)
    }

    fun setImageResource(resourceId: Int) {
        setImageResource(resourceId)
    }
}