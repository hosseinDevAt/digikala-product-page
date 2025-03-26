package ir.hosseindevat.digikala_product_page

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.hosseindevat.digikala_product_page.ui.theme.BlueText
import ir.hosseindevat.digikala_product_page.ui.theme.GrayLight
import ir.hosseindevat.digikala_product_page.ui.theme.MagentaMain
import ir.hosseindevat.digikala_product_page.ui.theme.YellowMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //enableEdgeToEdge()
        setContent {
            SetUI()
        }
    }

    @Preview(
        name = "Digikala",
        showBackground = true,
        widthDp = 450,
        heightDp = 1250
    )

    @Composable
    fun SetUI() {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(10.dp)
                .verticalScroll(rememberScrollState())

        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .background(Color.Red, shape = CircleShape)
                    .padding(8.dp)
            )

            Spacer(Modifier.height(40.dp))

            Image(
                painter = painterResource(R.drawable.product),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )

            Spacer(Modifier.height(50.dp))

            Box(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    "گوشی موبایل آیفون 16 حافظه 512 گیگ",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp),
                    textAlign = TextAlign.End
                )
            }

            Spacer(Modifier.height(15.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {

                Text(
                    "پرسش و پاسخ",
                    fontSize = 14.sp,
                    color = BlueText,
                    modifier = Modifier
                        .padding(end = 4.dp)
                )

                Text(
                    "10",
                    fontSize = 14.sp,
                    color = BlueText,
                )

                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .background(Color.Gray, shape = CircleShape)
                        .size(5.dp)
                )

                Text(
                    "دیدگاه کاربران",
                    fontSize = 14.sp,
                    color = BlueText,
                    modifier = Modifier
                        .padding(end = 4.dp)
                )

                Text(
                    "8",
                    fontSize = 14.sp,
                    color = BlueText,
                )

                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .background(Color.Gray, shape = CircleShape)
                        .size(5.dp)
                )

                Text(
                    "(58)",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(end = 4.dp)
                )

                Text(
                    "4.2",
                    fontSize = 14.sp,
                    color = Color.Black,
                )

                Icon(
                    Icons.Default.Star,
                    tint = YellowMain,
                    modifier = Modifier
                        .padding(horizontal = 5.dp),
                    contentDescription = ""
                )


            }

            Spacer(Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .background(GrayLight)
            )

            Spacer(Modifier.height(30.dp))

            Text(
                "ویژگی های محصول",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                textAlign = TextAlign.End
            )

            Spacer(Modifier.height(15.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {

                Text(
                    "آمریکا",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                )

                Text(
                    ":",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.LightGray,
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                )

                Text(
                    "کشور سازنده",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.LightGray,
                )

                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .background(Color.LightGray, shape = CircleShape)
                        .size(5.dp)
                )
            }

            Spacer(Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(GrayLight)
            )

            Spacer(Modifier.height(20.dp))

            Row {

                Icon(
                    painterResource(R.drawable.arrow),
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier.size(35.dp)
                )

                Text(
                    "مشخصات فنی",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 6.dp),
                    textAlign = TextAlign.End
                )
            }

            Spacer(Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(GrayLight)
            )

            Spacer(Modifier.height(20.dp))

            Row {

                Icon(
                    painterResource(R.drawable.arrow),
                    contentDescription = "",
                    tint = Color.Gray,
                    modifier = Modifier.size(35.dp)
                )

                Text(
                    "معرفی اجمالی محصول",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 6.dp),
                    textAlign = TextAlign.End
                )
            }

            Spacer(Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState(), reverseScrolling = true)
                    .background(GrayLight),
                verticalAlignment = Alignment.CenterVertically,
            ) {

                for (item in 1..10) {
                    Card(
                        modifier = Modifier
                            .padding(10.dp),
                        shape = CircleShape,
                        elevation = CardDefaults.cardElevation(4.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White)
                    ) {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {

                            Icon(
                                painterResource(R.drawable.arrow),
                                contentDescription = "",
                                tint = Color.Gray,
                                modifier = Modifier.size(35.dp)
                            )

                            Text(
                                "دسته بندی محصول",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 6.dp),
                                textAlign = TextAlign.End
                            )
                        }

                    }
                }

            }

            Spacer(Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    "نظر",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlueText,
                    modifier = Modifier
                        .padding(end = 4.dp, start = 10.dp)
                )

                Text(
                    "10",
                    fontSize = 14.sp,
                    color = BlueText,
                    fontWeight = FontWeight.Bold,
                )


                Text(
                    "دیدگاه کاربران",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 10.dp),
                    textAlign = TextAlign.End
                )

            }

            Spacer(Modifier.height(50.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .horizontalScroll(rememberScrollState(), reverseScrolling = true),
                verticalAlignment = Alignment.CenterVertically
            ) {


                for (item in 8 downTo 1) {

                    Spacer(Modifier.width(8.dp))

                    Card(
                        modifier = Modifier
                            .width(280.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(8.dp),
                    ) {

                        Spacer(Modifier.height(20.dp))

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End
                        ) {


                            Text(
                                "خریدار",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(end = 4.dp),
                            )

                            Icon(
                                Icons.Outlined.Person,
                                contentDescription = "",
                            )

                        }


                        Text(
                            "گوشی موبایل خیلی خوبیه و تقریبا از پس تمام کارهای حرفه ای برمیاد",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(end = 4.dp),
                            textAlign = TextAlign.End
                        )

                        Spacer(Modifier.height(40.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth().padding(4.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End
                        ) {

                            Text(
                                "حسین حسینی",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                            )

                            Box(
                                modifier = Modifier
                                    .padding(horizontal = 8.dp)
                                    .background(Color.Gray, shape = CircleShape)
                                    .size(5.dp)
                            )

                            Text(
                                "روز قبل",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                                modifier = Modifier
                                    .padding(end = 4.dp),
                                textAlign = TextAlign.End
                            )

                            Text(
                                "$item",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Gray,
                                modifier = Modifier
                                    .padding(end = 4.dp),
                                textAlign = TextAlign.End
                            )

                        }

                        Spacer(Modifier.height(20.dp))

                    }
                }

            }

            Spacer(Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column(
                    modifier = Modifier.padding(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "100,000,000",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray,
                            textDecoration = TextDecoration.LineThrough
                        )

                        Box(
                            modifier = Modifier
                                .padding(horizontal = 4.dp)
                                .background(MagentaMain, CircleShape)
                                .padding(6.dp)
                        ) {

                            Text(
                                "20 %",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                textDecoration = TextDecoration.LineThrough
                            )

                        }
                    }


                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "تومان",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                        )

                        Text(
                            "80,000,000",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(horizontal = 4.dp)
                        )
                    }

                }

                Box(
                    modifier = Modifier.fillMaxWidth().padding(end = 8.dp),
                    contentAlignment = Alignment.CenterEnd
                ) {
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = MagentaMain),
                        elevation = ButtonDefaults.buttonElevation(4.dp),
                        shape = AbsoluteRoundedCornerShape(10.dp)
                    ) {
                        Text(
                            "افزودن به سبد خرید",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(vertical = 6.dp)
                        )
                    }
                }

            }

        }

    }


}

