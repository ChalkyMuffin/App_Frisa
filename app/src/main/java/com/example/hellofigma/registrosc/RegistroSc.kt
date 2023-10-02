package com.example.hellofigma.registrosc

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.relayDropShadow

/**
 * g
 *
 * This composable was generated from the UI Package 'registro_sc'.
 * Generated code; do not edit directly
 */
@Composable
fun RegistroSc(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Registro(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 43.0.dp,
                    y = 53.0.dp
                )
            )
        )
        Datos(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 50.5.dp,
                    y = 145.0.dp
                )
            )
        )
        Frame9(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 43.0.dp,
                    y = 538.0.dp
                )
            )
        ) {
            IniciarSesiN()
        }
        Frame18(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 43.0.dp,
                    y = 196.0.dp
                )
            )
        ) {
            Obligatorio()
            Frame4 {
                Usuario()
            }
        }
        Frame19(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 43.0.dp,
                    y = 268.0.dp
                )
            )
        ) {
            Obligatorio1()
            Frame5 {
                Usuario1()
            }
        }
        Frame20(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 43.0.dp,
                    y = 340.0.dp
                )
            )
        ) {
            Obligatorio2()
            Frame6 {
                Usuario2()
            }
        }
        Frame21(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 43.0.dp,
                    y = 412.0.dp
                )
            )
        ) {
            Obligatorio3()
            Frame7 {
                Usuario3()
            }
        }
        Frame22(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 43.0.dp,
                    y = 484.0.dp
                )
            )
        ) {
            Frame8 {
                Usuario4()
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun RegistroScPreview() {
    MaterialTheme {
        RelayContainer {
            RegistroSc(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Registro(modifier: Modifier = Modifier) {
    RelayText(
        content = "Registro",
        fontSize = 40.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(275.0.dp)
    )
}

@Composable
fun Datos(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ingrese sus datos en los siguientes campos",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(260.0.dp)
    )
}

@Composable
fun IniciarSesiN(modifier: Modifier = Modifier) {
    RelayText(
        content = "Guardar",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame9(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 201,
            red = 184,
            green = 3,
            blue = 3
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 18.0.dp,
            top = 6.0.dp,
            end = 18.0.dp,
            bottom = 6.0.dp
        ),
        itemSpacing = 10.0,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(275.0.dp).requiredHeight(31.0.dp)
    )
}

@Composable
fun Obligatorio(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Obligatorio ")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 184,
                        green = 3,
                        blue = 3
                    )
                )
            ) {
                append("*")
            }
        },
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Usuario(modifier: Modifier = Modifier) {
    RelayText(
        content = "Nombre del encargado",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 53,
            red = 95,
            green = 95,
            blue = 95
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 18.0.dp,
            top = 6.0.dp,
            end = 18.0.dp,
            bottom = 6.0.dp
        ),
        itemSpacing = 10.0,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(275.0.dp)
    )
}

@Composable
fun Frame18(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Obligatorio1(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Obligatorio ")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 184,
                        green = 3,
                        blue = 3
                    )
                )
            ) {
                append("*")
            }
        },
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Usuario1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Nombre de la Organizacion",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 53,
            red = 95,
            green = 95,
            blue = 95
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 18.0.dp,
            top = 6.0.dp,
            end = 18.0.dp,
            bottom = 6.0.dp
        ),
        itemSpacing = 10.0,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(275.0.dp)
    )
}

@Composable
fun Frame19(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Obligatorio2(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Obligatorio ")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 184,
                        green = 3,
                        blue = 3
                    )
                )
            ) {
                append("*")
            }
        },
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Usuario2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Telefono",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 53,
            red = 95,
            green = 95,
            blue = 95
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 18.0.dp,
            top = 6.0.dp,
            end = 18.0.dp,
            bottom = 6.0.dp
        ),
        itemSpacing = 10.0,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(275.0.dp)
    )
}

@Composable
fun Frame20(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Obligatorio3(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            append("Obligatorio ")
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 184,
                        green = 3,
                        blue = 3
                    )
                )
            ) {
                append("*")
            }
        },
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Usuario3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Dirección",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 53,
            red = 95,
            green = 95,
            blue = 95
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 18.0.dp,
            top = 6.0.dp,
            end = 18.0.dp,
            bottom = 6.0.dp
        ),
        itemSpacing = 10.0,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(275.0.dp)
    )
}

@Composable
fun Frame21(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Usuario4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Correo",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 153,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(500.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 53,
            red = 95,
            green = 95,
            blue = 95
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 18.0.dp,
            top = 6.0.dp,
            end = 18.0.dp,
            bottom = 6.0.dp
        ),
        itemSpacing = 10.0,
        radius = 5.0,
        content = content,
        modifier = modifier.requiredWidth(275.0.dp)
    )
}

@Composable
fun Frame22(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = 4.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 0.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}
