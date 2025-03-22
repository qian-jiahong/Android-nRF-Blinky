package no.nordicsemi.android.blinky.ui.control.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import no.nordicsemi.android.blinky.ui.R
import no.nordicsemi.android.scanner.view.DeviceConnectingView

@Composable
internal fun MainImageView(
    onClick: () -> Unit,
    imageResId: Int,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = "main image",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        )
    }
}

@Preview
@Composable
fun MainImageViewPreview() {
    MainImageView(
        onClick = {},
        imageResId = R.drawable.ic_car_main, // 示例资源ID
    )
}