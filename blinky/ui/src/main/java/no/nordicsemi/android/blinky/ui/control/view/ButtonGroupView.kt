package no.nordicsemi.android.blinky.ui.control.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RadioButtonChecked
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import no.nordicsemi.android.blinky.ui.R

@Composable
internal fun ButtonGroupView(
    onClick: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    OutlinedCard(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { onClick(0) }) {
                Text(text = "Button 1")
            }
            Button(onClick = { onClick(1) }) {
                Text(text = "Button 2")
            }
            Button(onClick = { onClick(2) }) {
                Text(text = "Button 3")
            }
            Button(onClick = { onClick(3) }) {
                Text(text = "Button 4")
            }
        }
    }
}

@Composable
@Preview
private fun ButtonGroupViewPreview() {
    ButtonGroupView(
        onClick = {},
        modifier = Modifier.padding(16.dp),
    )
}