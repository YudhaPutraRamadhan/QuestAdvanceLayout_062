package com.example.composelayout

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle

@Composable
fun ActivitasPertama(modifier: Modifier){
    column(modifier = Modifier.padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold)
        Text(text = stringResource(id = R.string.univ),
            fontSize = 22.sp)
        Spacer(modifier = Modifier.height(height = 25.dp))
        Card (modifier = Modifier
            .fillMaxWidth(fraction = 1f)
            .padding(all = 12.dp))
    }
}