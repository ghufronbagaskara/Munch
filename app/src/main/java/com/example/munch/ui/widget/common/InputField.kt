package com.example.munch.ui.widget.common

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.munch.ui.theme.MunchScheme
import com.example.munch.ui.theme.Roboto


@Composable
fun InputField(
    label: String? = null,
    value: String,
    placeholder: String = "placeholder",
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle(
        fontFamily = Roboto,
    ),
    enabled: Boolean = true,
    keyboardType: KeyboardType = KeyboardType.Text,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    leadingContent: @Composable (() -> Unit)? = null,
    trailingContent: @Composable (() -> Unit)? = null
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
    ) {
        if (label != null) {
            Text(
                text = label,
                style = TextStyle(
                    fontFamily = Roboto,
                    fontWeight = FontWeight.Bold,
                    color = MunchScheme.SecondaryVariant1.color,
                    fontSize = 16.sp
                ),
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            visualTransformation = visualTransformation,
            modifier = modifier
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(12.dp),
                    color = MunchScheme.Black.color
                )
                .padding(vertical = 18.dp, horizontal = 10.dp),
            textStyle = TextStyle(
                fontFamily = Roboto,
                fontSize = 16.sp
            ).merge(textStyle),
            enabled = enabled,
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = keyboardType
            ),
            decorationBox = { innerTextField ->
                Row {
                    if (leadingContent != null) {
                        leadingContent()
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    ) {
                        if (value.isEmpty()) {
                            Text(
                                text = placeholder,
                                color = MunchScheme.SecondaryVariant1.color,
                                style = TextStyle(
                                    fontFamily = Roboto,
                                    fontSize = 16.sp
                                ).merge(textStyle),
                            )
                        } else {
                            innerTextField()
                        }
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    if (trailingContent != null) {
                        trailingContent()
                    }
                }
            }
        )
    }
}