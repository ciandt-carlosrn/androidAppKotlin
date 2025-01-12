import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            orientation = LinearLayout.VERTICAL
            setPadding(16, 16, 16, 16)
            gravity = Gravity.CENTER
        }

        val imageView = ImageViewComponent(this).apply {
            setImageResource(R.drawable.banner)
        }

        val titleTextView = TitleTextViewComponent(this).apply {
            setTitleText(getString(R.string.example_title))
        }

        val descriptionTextView = DescriptionTextViewComponent(this).apply {
            setDescriptionText(getString(R.string.example_description))
        }

        val backButton = BackButtonComponent(this).apply {
            setOnClickAction { finish() }
        }

        linearLayout.apply {
            addView(imageView)
            addView(titleTextView)
            addView(descriptionTextView)
            addView(backButton)
        }

        setContentView(linearLayout)
    }
}