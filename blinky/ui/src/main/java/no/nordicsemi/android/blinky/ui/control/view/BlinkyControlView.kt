package no.nordicsemi.android.blinky.ui.control.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
internal fun BlinkyControlView(
    ledState: Boolean,
    buttonState: Boolean,
    onStateChanged: (Boolean) -> Unit,
    onMainImageClick: () -> Unit,
    mainImageResId: Int,
    onButtonGroupClick: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
/*
        LedControlView(
            state = ledState,
            onStateChanged = onStateChanged,
        )

        ButtonControlView(
            state = buttonState
        )
*/
        MainImageView(
            onClick = onMainImageClick,
            imageResId = mainImageResId,
        )
        ButtonGroupView(
            onButtonGroupClick = onButtonGroupClick,
        )
    }
}

@Preview
@Composable
private fun BlinkyControlViewPreview() {
    BlinkyControlView(
        ledState = true,
        buttonState = true,
        onStateChanged = {},
        onMainImageClick = {},
        mainImageResId = 0,
        onButtonGroupClick = {},
        modifier = Modifier.padding(16.dp),
    )
}