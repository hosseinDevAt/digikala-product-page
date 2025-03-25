package ir.hosseindevat.digikala_product_page

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.hosseindevat.digikala_product_page.ui.theme.BlueText
import ir.hosseindevat.digikala_product_page.ui.theme.GrayLight
import ir.hosseindevat.digikala_product_page.ui.theme.MagentaMain
import ir.hosseindevat.digikala_product_page.ui.theme.PurpleGrey40
import ir.hosseindevat.digikala_product_page.ui.theme.YellowMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
        setContent {
            SetUI()
        }
    }

    @Preview(
        name = "hossein",
        showBackground = true,
        widthDp = 500,
        heightDp = 1300
    )

    @Composable
    fun SetUI() {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(Color.White)
        ) {

            Spacer(Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .padding(horizontal = 12.dp)
                    .background(Color.Red),
            )

            Spacer(Modifier.height(40.dp))

            Image(
                painter = painterResource(R.drawable.product),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )

            Spacer(Modifier.height(30.dp))

            Text(
                "گوشی موبایل آیفون نسخه پرایم اصل",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 14.dp),
                textAlign = TextAlign.End
            )

            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    "پرسش و پاسخ",
                    fontSize = 14.sp,
                    color = BlueText,
                    modifier = Modifier
                        .padding(end = 4.dp),
                    textAlign = TextAlign.End
                )

                Text(
                    "3",
                    fontSize = 14.sp,
                    color = BlueText,
                    textAlign = TextAlign.End
                )

                Box(
                    Modifier
                        .padding(10.dp)
                        .size(5.dp)
                        .background(Color.Gray, shape = CircleShape)
                )

                Text(
                    "دیدگاه کاربران",
                    fontSize = 14.sp,
                    color = BlueText,
                    modifier = Modifier
                        .padding(end = 4.dp),
                    textAlign = TextAlign.End
                )

                Text(
                    "8",
                    fontSize = 14.sp,
                    color = BlueText,
                    textAlign = TextAlign.End
                )

                Box(
                    Modifier
                        .padding(10.dp)
                        .size(5.dp)
                        .background(Color.Gray, shape = CircleShape)
                )

                Text(
                    "(10)",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.End
                )

                Text(
                    "4.2",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(end = 2.dp),
                )

                Icon(
                    Icons.Default.Star,
                    contentDescription = "",
                    tint = YellowMain,
                    modifier = Modifier
                        .padding(end = 12.dp)
                        .size(18.dp)
                )

            }

            Spacer(Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp)
                    .background(GrayLight)
            )

            Spacer(Modifier.height(20.dp))

            Text(
                "ویژگی های محصول",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 14.dp),
                textAlign = TextAlign.End
            )

            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {

                Text(
                    "آمریکا",
                    fontSize = 14.sp,
                    color = PurpleGrey40
                )

                Text(
                    ":",
                    fontSize = 14.sp,
                    color = PurpleGrey40,
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                )

                Text(
                    "کشور تولید",
                    fontSize = 14.sp,
                    color = PurpleGrey40
                )

                Box(
                    Modifier
                        .padding(start = 10.dp, end = 14.dp)
                        .size(5.dp)
                        .background(Color.Gray, shape = CircleShape)
                )
            }

            Spacer(Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.LightGray)
            )

            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Icon(
                    painter = painterResource(R.drawable.arrow),
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .padding(10.dp)
                        .size(28.dp),
                )

                Text(
                    "مشخصات فنی",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(end = 14.dp)
                )

            }

            Spacer(Modifier.height(10.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.LightGray)
            )

            Spacer(Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Icon(
                    painter = painterResource(R.drawable.arrow),
                    tint = Color.Gray,
                    contentDescription = "",
                    modifier = Modifier
                        .padding(10.dp)
                        .size(28.dp),
                )

                Text(
                    "معرفی اجمالی محصول",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(end = 14.dp)
                )

            }

            Spacer(Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState(),
                        reverseScrolling = true
                    )
                    .background(GrayLight)
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {

                for (item in 10 downTo 1) {

                    Spacer(Modifier.width(10.dp))

                    Card(
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        elevation = CardDefaults.cardElevation(4.dp)
                    ) {

                        Row(
                            modifier = Modifier.padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Icon(
                                painter = painterResource(R.drawable.arrow),
                                tint = Color.Gray,
                                contentDescription = ""
                            )

                            Text(
                                "محصول تستی شماره $item",
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .padding(end = 14.dp)
                            )

                        }

                    }

                }

            }

            Spacer(Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,

                ) {

                Text(
                    "نظر",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(start = 10.dp),
                    color = BlueText
                )

                Text(
                    "8",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 4.dp),
                    color = BlueText
                )

                Text(
                    "دیدگاه کاربران",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 14.dp),
                    textAlign = TextAlign.End,
                    fontWeight = FontWeight.Bold
                )

            }

            Spacer(Modifier.height(40.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        rememberScrollState(),
                        reverseScrolling = true
                    ),
                verticalAlignment = Alignment.CenterVertically,
            ) {

                for (item in 1..8) {

                    Spacer(Modifier.width(8.dp))

                    Card(
                        modifier = Modifier.width(280.dp),
                        shape = AbsoluteRoundedCornerShape(10.dp),
                        elevation = CardDefaults.cardElevation(4.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        border = BorderStroke(1.dp, Color.LightGray)
                    ) {

                        Spacer(Modifier.height(20.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End
                        ) {
                            Text(
                                "خریدار",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(end = 4.dp)
                            )

                            Icon(
                                Icons.Outlined.Person,
                                contentDescription = "",
                                modifier = Modifier.padding(end = 12.dp)
                            )

                        }

                        Text(
                            "بهترین گوشی دنیاس و بنظرم به شدت ارزش خرید بسیار بالایی داره",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(end = 12.dp, start = 10.dp, top = 10.dp),
                            textAlign = TextAlign.End
                        )

                        Spacer(Modifier.height(40.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End
                        ) {

                            Text(
                                "حسین حسینی",
                                fontSize = 14.sp,
                                color = Color.Gray,
                                modifier = Modifier
                                    .padding(bottom = 16.dp)
                            )

                            Box(
                                Modifier
                                    .padding(start = 8.dp, end = 8.dp, bottom = 16.dp)
                                    .size(5.dp)
                                    .background(Color.Gray, shape = CircleShape)
                            )

                            Text(
                                "روز قبل",
                                modifier = Modifier
                                    .padding(end = 12.dp, bottom = 16.dp),
                                fontSize = 14.sp,
                                color = Color.Gray,
                            )

                        }

                    }
                    Spacer(Modifier.height(8.dp))
                }

            }

            Spacer(Modifier.height(20.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RectangleShape,
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(12.dp)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Text(
                                "100,000,000",
                                fontSize = 12.sp,
                                color = Color.Gray,
                                modifier = Modifier
                                    .padding(end = 6.dp),
                                textDecoration = TextDecoration.LineThrough

                            )

                            Text(
                                "20%",
                                fontSize = 12.sp,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(end = 6.dp)
                                    .background(
                                        MagentaMain,
                                        CircleShape
                                    )
                                    .padding(horizontal = 4.dp, vertical = 2.dp),

                                )

                        }

                        Spacer(Modifier.height(6.dp))

                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Text(
                                "تومان",
                                fontSize = 14.sp,
                                modifier = Modifier
                                    .padding(end = 6.dp),
                                )

                            Text(
                                "80,000,000",
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .padding(end = 6.dp),
                                )

                        }

                    }


                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.CenterEnd
                    ) {

                        Button(
                            onClick = {},
                            shape = AbsoluteRoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MagentaMain
                            )
                        ) {

                            Text(
                                "افزودن به سبد خرید",
                                fontSize = 16.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                            )

                        }

                    }

                }


            }

        }

    }


}

