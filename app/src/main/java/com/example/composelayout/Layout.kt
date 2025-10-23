package com.example.composelayout

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp

@Composable
fun ActivitasPertama(modifier: Modifier){
    column(modifier = Modifier.padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text(stringResource(R.string.univ),
            fontSize = 22.sp)
        Spacer(modifier = Modifier.height(25.dp))
        Card (modifier = Modifier
            .fillMaxWidth(1f)
            .padding(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )) {
            Row(){
                val gambar = painterResource(R.drawable.logo_umy)
                image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(5.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
            }
    }
    }
}