package com.example.hellofigma.perfilorgvistausuariover2

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.hellofigma.R
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow

/**
 * This composable was generated from the UI Package 'perfil_org_vista_usuario_ver2'.
 * Generated code; do not edit directly
 */
@Composable
fun PerfilOrgVistaUsuarioVer2(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Rectangle23(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = 0.0.dp
                )
            ).rowWeight(1.0f).columnWeight(1.0f)
        )
        Frame4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 610.0.dp
                )
            )
        ) {
            Suscribirme()
        }
        Component8 {
            Rectangle7(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Frame30(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 0.5.dp
                    )
                )
            ) {
                Menu {
                    Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Frame29 {
                    Buscar()
                    Vector2()
                }
            }
        }
        Component22(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 890.0.dp,
                    y = 226.0.dp
                )
            )
        ) {
            Rectangle8(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Frame31(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 0.5.dp
                    )
                )
            ) {
                Menu1 {
                    Vector3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Vector4(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
                Frame32 {
                    Buscar1()
                    Vector5()
                }
            }
        }
        Component21(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 45.0.dp
                )
            )
        ) {
            Rectangle24(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Siguenos(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Org(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Frame34(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                Instagram()
                Twitter()
                Facebook()
            }
            Frame39(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -0.498291015625.dp,
                        y = 26.0.dp
                    )
                )
            ) {
                Frame38 {
                    Frame33 {
                        Image6()
                        CambiaMex()
                    }
                }
                Vector6()
            }
        }
        UbicaciN(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            ).columnWeight(1.0f)
        )
        Publicaciones(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            ).columnWeight(1.0f)
        )
        Image8(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 361.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
private fun PerfilOrgVistaUsuarioVer2Preview() {
    MaterialTheme {
        RelayContainer {
            PerfilOrgVistaUsuarioVer2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Rectangle23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.perfil_org_vista_usuario_ver2_rectangle_23),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 547.5.dp,
                end = 1.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Suscribirme(modifier: Modifier = Modifier) {
    RelayText(
        content = "Suscribirme",
        fontSize = 12.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 247,
            green = 247,
            blue = 247
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
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp)
    )
}

@Composable
fun Rectangle7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.perfil_org_vista_usuario_ver2_rectangle_7),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.perfil_org_vista_usuario_ver2_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.25.dp,
                top = 6.5.dp,
                end = 3.25.dp,
                bottom = 6.5.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Menu(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(26.0.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun Buscar(modifier: Modifier = Modifier) {
    RelayText(
        content = "Buscar",
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
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.perfil_org_vista_usuario_ver2_vector1),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Frame29(
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
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 10.0.dp,
            top = 2.0.dp,
            end = 10.0.dp,
            bottom = 2.0.dp
        ),
        itemSpacing = 202.0,
        radius = 18.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Frame30(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 15.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Component8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Rectangle8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.perfil_org_vista_usuario_ver2_rectangle_8),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f))
}

@Composable
fun Vector4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.perfil_org_vista_usuario_ver2_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.25.dp,
                top = 6.5.dp,
                end = 3.25.dp,
                bottom = 6.5.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Menu1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(26.0.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun Buscar1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Buscar",
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
fun Vector5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.perfil_org_vista_usuario_ver2_vector3),
        modifier = modifier.requiredWidth(12.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Frame32(
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
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 10.0.dp,
            top = 2.0.dp,
            end = 10.0.dp,
            bottom = 2.0.dp
        ),
        itemSpacing = 202.0,
        radius = 18.0,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Frame31(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 15.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Component22(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(45.0.dp)
    )
}

@Composable
fun Rectangle24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.perfil_org_vista_usuario_ver2_rectangle_24),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Siguenos(modifier: Modifier = Modifier) {
    RelayText(
        content = "¡Siguenos!",
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 142.0.dp,
                top = 182.0.dp,
                end = 142.0.dp,
                bottom = 70.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Org(modifier: Modifier = Modifier) {
    RelayText(
        content = "¡Hola!, somos una organización dedicada... ¡Hola!, somos una organización dedicada... ¡Hola!, somos una organización dedicada... ¡Hola!, somos una organización dedicada... ¡Hola!, somos una organización dedicada... ¡Hola!, somos una organización dedicada... ¡Hola!, somos una organización dedicada... ¡Hola!, somos una organización dedicada...",
        fontSize = 9.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        fontWeight = FontWeight(500.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 37.0.dp,
                top = 79.0.dp,
                end = 38.0.dp,
                bottom = 106.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Instagram(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.perfil_org_vista_usuario_ver2_instagram),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Twitter(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.perfil_org_vista_usuario_ver2_twitter),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Facebook(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.perfil_org_vista_usuario_ver2_facebook),
        contentScale = ContentScale.Fit,
        modifier = modifier.requiredWidth(30.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Frame34(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 71.0,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 63.0.dp,
                top = 217.0.dp,
                end = 65.0.dp,
                bottom = 26.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.perfil_org_vista_usuario_ver2_image_6),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun CambiaMex(modifier: Modifier = Modifier) {
    RelayText(
        content = "CambiaMex",
        fontSize = 18.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Frame33(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(160.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Frame38(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 68.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Vector6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.perfil_org_vista_usuario_ver2_vector4),
        modifier = modifier.requiredWidth(25.00341796875.dp).requiredHeight(21.249420166015625.dp)
    )
}

@Composable
fun Frame39(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 90.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Component21(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(360.0.dp).requiredHeight(273.0.dp)
    )
}

@Composable
fun UbicaciN(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ubicación",
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 329.0.dp,
                end = 0.0.dp,
                bottom = 290.0.dp
            )
        ).fillMaxHeight(1.0f)
    )
}

@Composable
fun Publicaciones(modifier: Modifier = Modifier) {
    RelayText(
        content = "Publicaciones",
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 558.5.dp,
                end = 0.0.dp,
                bottom = 60.5.dp
            )
        ).fillMaxHeight(1.0f)
    )
}

@Composable
fun Image8(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.perfil_org_vista_usuario_ver2_image_8),
        radius = 10.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(332.0.dp).requiredHeight(170.0.dp)
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
