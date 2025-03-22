package no.nordicsemi.android.blinky.ui.control.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import no.nordicsemi.android.blinky.ui.R

@Composable
internal fun ButtonGroupView(
    onButtonGroupClick: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    OutlinedCard(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp) // 设置按钮之间的水平间隔为8dp
        ) {
            Button(onClick = { onButtonGroupClick(0) }, modifier = Modifier.padding(0.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_btn_lock),
                    contentDescription = "Button 1 Icon",
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp)
                )
            }
            Button(onClick = { onButtonGroupClick(1) }, modifier = Modifier.padding(0.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_btn_unlock),
                    contentDescription = "Button 2 Icon",
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp)
                )
            }
            Button(onClick = { onButtonGroupClick(2) }, modifier = Modifier.padding(0.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_btn_open_trunk),
                    contentDescription = "Button 3 Icon",
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp)
                )
            }
            Button(onClick = { onButtonGroupClick(3) }, modifier = Modifier.padding(0.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.ic_btn_settings),
                    contentDescription = "Button 4 Icon",
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp)
                )
            }
        }
    }
}

@Composable
@Preview
private fun ButtonGroupViewPreview() {
    ButtonGroupView(
        onButtonGroupClick = {},
        modifier = Modifier.padding(16.dp),
    )
}